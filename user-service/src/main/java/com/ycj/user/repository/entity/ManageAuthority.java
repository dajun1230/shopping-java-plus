package com.ycj.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName(value = "manage_authority")
@Data
public class ManageAuthority {

    @TableId
    private Integer id;

    private String authorityName;

    private String authorityUrl;

    private Integer authoritySort;

    private Integer parentAuthorityId;

    private Boolean isShow;

    private Date createTime;
}
