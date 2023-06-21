package com.ycj.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "manage_user_role")
@Data
public class ManageUserRole {

    private Long id;

    private Integer manageUserId;

    private Integer manageRoleId;

}
