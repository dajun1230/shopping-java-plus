package com.ycj.user.model.request;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Data
public class ManageUserRequest {

    @NotNull(message = "请求id不能为空")
    @ApiModelProperty(value = "请求id", example = "猪猪侠")
    private String requestId;

    @NotNull(message = "用户名不能为空")
    @ApiModelProperty(value = "用户名", example = "猪猪侠")
    private String manageName;

    @NotNull(message = "密码不能为空")
    @ApiModelProperty(value = "密码（加密后的）", example = "EFSNKJJDSJHCFHHDLKSNKCVNKDKN")
    private String password;

    @NotNull(message = "手机号")
    @Pattern(regexp = "^((13[0-9])|(15[^4])|(18[0,2,3,5-9])|(17[0-8])|(147))\\d{8}$",message = "手机号格式错误")
    @ApiModelProperty(value = "手机号", example = "18628395765")
    private String mobile;

    @ApiModelProperty(value = "登录用户id", example = "1")
    private Integer parentId;

    @ApiModelProperty(value = "状态", example = "ON")
    private String status;

    @ApiModelProperty(value = "最后登录时间", example = "")
    private Date loginTime;

    @ApiModelProperty(value = "创建时间", example = "")
    private Date createTime;
}
