package com.ycj.user.repository.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName(value = "manage_user")
@Data
public class ManageUser {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String manageName;

    private String password;

    private String mobile;

    private Integer parentId;

    private String status;

    private Boolean isDelete;

    private Date loginTime;

    private Date createTime;

    private String  requestId;

}
