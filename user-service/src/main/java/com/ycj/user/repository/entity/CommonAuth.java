package com.ycj.user.repository.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "common_auth")
@Data
public class CommonAuth {
    private Integer id;

    private String authPath;

    private Integer authType;

    private Boolean isValid;

    private Integer requestType;

    private String authDescription;
}
