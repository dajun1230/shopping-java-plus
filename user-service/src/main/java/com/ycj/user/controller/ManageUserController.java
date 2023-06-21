package com.ycj.user.controller;

import com.ycj.common.model.result.BaseResult;
import com.ycj.common.model.result.PageResult;
import com.ycj.user.model.request.ManageUserRequest;
import com.ycj.user.model.result.ManageUserResult;
import com.ycj.user.service.ManageUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Api(tags = "【用戶】-B端")
@RequestMapping("/manage-user")
public class ManageUserController {

    @Autowired
    private ManageUserService manageUserService;

    /**
     * 新增用戶
     *
     * @return manageUserRequest 用戶対象
     */
    @ApiOperation(value = "用户新增", notes = "管理后台/用户新增")
    @PostMapping("/add")
    public BaseResult<Void> createUser(@Valid @RequestBody ManageUserRequest manageUserRequest) {
        manageUserService.createUser(manageUserRequest);
        return new BaseResult<>();
    }

    /**
     * 根据id删除用户
     *
     * @param ids 用户id列表
     * @return 成功条数
     */
    @ApiOperation(value = "根据id列表删除用户", notes = "管理后台/根据id列表删除用户")
    @PostMapping("/deleteByIds")
    public BaseResult<Void> deleteByIds(@RequestBody List<Integer> ids) {
        manageUserService.deleteByIds(ids);
        return new BaseResult<>();
    }

    /**
     * 根据id查询管理后台用户详情
     *
     * @param id 用户id
     */
    @ApiOperation(value = "查询管理后台用户详情", notes = "管理后台/查询管理后台用户详情")
    @GetMapping("/queryById")
    public BaseResult<ManageUserResult> queryById(@RequestParam int id) {
        ManageUserResult manageUserResult = manageUserService.queryById(id);
        return new BaseResult<>(manageUserResult);
    }

    /**
     * 分页查询用户
     *
     * @param pageSize   页容量
     * @param pageNumber 用户id
     * @return
     */
    @ApiOperation(value = "分页查询用户", notes = "管理后台/分页查询用户")
    @GetMapping("/selectByPage")
    public PageResult<List<ManageUserResult>> selectByPage(@RequestParam long pageSize, @RequestParam long pageNumber) {
        return manageUserService.selectByPage(pageSize, pageNumber);
    }

    /**
     * 用户状态开关
     *
     * @param id 用户id
     * @return 是否成功
     */
    @ApiOperation(value = "用户状态开关", notes = "管理后台/用户状态开关")
    @PostMapping("/statusSwitch")
    public BaseResult<Void> statusSwitch(@RequestBody int id) {
        manageUserService.statusSwitch(id);
        return new BaseResult<>();
    }
}
