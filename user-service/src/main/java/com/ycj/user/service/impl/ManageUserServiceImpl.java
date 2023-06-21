package com.ycj.user.service.impl;

import com.ycj.common.exception.CommonException;
import com.ycj.common.model.enums.ErrorCodeEnum;
import com.ycj.common.model.enums.SwitchEnum;
import com.ycj.common.model.result.BaseResult;
import com.ycj.common.model.result.PageResult;
import com.ycj.common.utils.JwtOperator;
import com.ycj.user.model.request.ManageUserRequest;
import com.ycj.user.model.result.ManageUserResult;
import com.ycj.user.repository.ManageUserRepository;
import com.ycj.user.service.ManageUserService;
import com.ycj.user.utils.HttpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ManageUserServiceImpl implements ManageUserService {

    @Autowired
    private ManageUserRepository manageUserRepository;

//    @Autowired
//    private JwtOperator jwtOperator;

    /**
     * 新增用户
     * @param manageUserRequest 用户对象
     */
    @Override
    public void createUser(ManageUserRequest manageUserRequest) {
        Date date = new Date();
        manageUserRequest.setStatus(SwitchEnum.ON.getCode());
        manageUserRequest.setCreateTime(date);
        manageUserRequest.setLoginTime(date);
        manageUserRequest.setParentId(Integer.parseInt(HttpUtils.getManageUserId(HttpUtils.currentRequest())));
        manageUserRepository.createUser(manageUserRequest);
    }

    @Override
    public BaseResult<ManageUserResult> token(ManageUserRequest manageUserRequest) {
        ManageUserResult result = manageUserRepository.queryUser(manageUserRequest);
        if (result == null) {
            throw new CommonException(ErrorCodeEnum.LOGIN_ERROR);
        }
        Map<String, Object> map = new HashMap<>();
        map.put("id", result.getId());
        map.put("message", result.getManageName());
        map.put("mobile", result.getMobile());
//        result.setToken(jwtOperator.generateToken(map));
        return new BaseResult<>(result);
    }

    @Override
    public void deleteByIds(List<Integer> ids) {
        manageUserRepository.deleteByIds(ids);
    }

    @Override
    public PageResult<List<ManageUserResult>> selectByPage(long pageSize, long pageNumber) {
        return manageUserRepository.selectByPage(pageSize, pageNumber);
    }

    @Override
    public ManageUserResult queryById(int id) {
        return manageUserRepository.queryById(id);
    }

    @Override
    public void statusSwitch(int id) {
        manageUserRepository.statusSwitch(id);
    }

}
