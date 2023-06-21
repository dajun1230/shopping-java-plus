package com.ycj.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName(value = "manage_role")
@Data
public class ManageRole {
    private Integer id;

    private Integer managerUserId;

    private String roleName;

    private String roleDescription;

    private String status;

    private Boolean isRoot;

    private Date createTime;
}
