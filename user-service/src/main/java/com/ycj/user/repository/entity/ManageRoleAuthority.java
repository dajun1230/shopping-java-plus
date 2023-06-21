package com.ycj.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "manage_role_authority")
@Data
public class ManageRoleAuthority {

    private Long id;

    private Integer manageRoleId;

    private Integer manageAuthorityId;

}
