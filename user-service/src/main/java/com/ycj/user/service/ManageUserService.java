package com.ycj.user.service;

import com.ycj.common.model.result.BaseResult;
import com.ycj.common.model.result.PageResult;
import com.ycj.user.model.request.ManageUserRequest;
import com.ycj.user.model.result.ManageUserResult;

import java.util.List;

public interface ManageUserService {
    /**
     * 新增用户
     * @param manageUserRequest 用户对象
     */
    void createUser(ManageUserRequest manageUserRequest);

    /**
     * 新增用户
     *
     */
    BaseResult<ManageUserResult> token(ManageUserRequest manageUserRequest);

    /**
     * 根据id列表删除用户
     * @param ids 用户id列表
     * @return 成功条数
     */
    void deleteByIds(List<Integer> ids);

    /**
     * 分页查询用户
     * @param
     */
    PageResult<List<ManageUserResult>> selectByPage(long pageSize, long PageNumber);

    /**
     * 查询管理后台用户详情
     *
     */
    ManageUserResult queryById(int id);

    /**
     * 用户状态开关
     * @param id 用户id
     * @return 是否成功
     */
    void statusSwitch(int id);

}
