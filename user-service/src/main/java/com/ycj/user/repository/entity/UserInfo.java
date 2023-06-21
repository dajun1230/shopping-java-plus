package com.ycj.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@TableName(value = "user_info")
@Data
public class UserInfo {

    private String id;

    private String openId;

    private String unionid;

    private String icon;

    private String nickName;

    private String phone;

    private Byte sex;

    private Date createTime;
}
