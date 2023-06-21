package com.ycj.user.repository;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ycj.common.model.enums.SwitchEnum;
import com.ycj.common.model.result.PageResult;
import com.ycj.user.mapstruct.ManageUserMapstruct;
import com.ycj.user.model.request.ManageUserRequest;
import com.ycj.user.model.result.ManageUserResult;
import com.ycj.user.repository.entity.ManageUser;
import com.ycj.user.repository.mappers.ManageUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManageUserRepository {

    @Autowired
    private ManageUserMapper manageUserMapper;

    /**
     * 新增用户
     *
     * @param
     */
    public int createUser(ManageUserRequest manageUserRequest) {
        return manageUserMapper.insert(ManageUserMapstruct.INSTANCE.toManageUser(manageUserRequest));
    }

    public ManageUserResult queryUser(ManageUserRequest manageUserRequest) {
        QueryWrapper<ManageUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("mobile", manageUserRequest.getMobile());
        queryWrapper.eq("password", manageUserRequest.getPassword());
        queryWrapper.eq("status", manageUserRequest.getStatus());
        return ManageUserMapstruct.INSTANCE.toManageUserResult(manageUserMapper.selectOne(queryWrapper));
    }

    /**
     * 根据id列表删除用户
     *
     * @param ids 用户id列表
     * @return 成功条数
     */
    public int deleteByIds(List<Integer> ids) {
        return manageUserMapper.deleteBatchIds((ids));
    }

    /**
     * 分页查询用户列表
     *
     * @param pageSize   页容量
     * @param pageNumber 页码
     * @return 用户列表
     */
    public PageResult<List<ManageUserResult>> selectByPage(long pageSize, long pageNumber) {
        QueryWrapper<ManageUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("create_time");
        Page<ManageUser> page = manageUserMapper.selectPage(new Page<>(pageNumber, pageSize), queryWrapper);
        PageResult<List<ManageUserResult>> pageResult = new PageResult<>();
        pageResult.setPage(page.getCurrent());
        pageResult.setTotal(page.getTotal());
        pageResult.setResult(ManageUserMapstruct.INSTANCE.toManageUserRequestList(page.getRecords()));
        return pageResult;
    }

    /**
     * 根据用户id查询用户
     *
     * @param id 用户id
     * @return 用户对象
     */
    public ManageUserResult queryById(int id) {
        return ManageUserMapstruct.INSTANCE.toManageUserResult(manageUserMapper.selectById(id));
    }

    /**
     * 用户状态开关
     * @param id 用户id
     * @return 是否成功
     */
    public int statusSwitch(int id) {
        ManageUser manageUser = manageUserMapper.selectById(id);
        if (null == manageUser) {
            return 0;
        }
        if (SwitchEnum.ON.getCode().equals(manageUser.getStatus())) {
            manageUser.setStatus(SwitchEnum.OFF.getCode());
        } else {
            manageUser.setStatus(SwitchEnum.ON.getCode());
        }
        return manageUserMapper.updateById(manageUser);
    }
}
