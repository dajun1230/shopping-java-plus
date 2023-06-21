package com.ycj.common.model.enums;

import lombok.Getter;

@Getter
public enum ErrorCodeEnum {
    SUCCESS("200", "成功"),
    NU_KNOW_ERROR("500", "服务器异常，请联系管理员"),
    ARGUMENT_NOT_VALID_ERROR("501", "请求数据校验错误"),
    CHANNEL_CONFIG_ERROR("503", "渠道配置错误"),
    SAVE_PLAN_FAIL("504", "保存营销方案失败"),
    DELETE_PLAN_FAIL("505", "删除营销方案失败"),
    CHECK_REQUEST_ID_ERROR("506","幂等校验失败"),
    DATA_NOT_EXIST_ERROR("507","待处理数据不存在"),
    DATA_CONFLICT_ERROR("508","时间冲突错误"),
    LOGIN_ERROR("510", "账户或密码错误"),
    CHECK_AUTHORIZATION_ERROR("511", "鉴权异常");

    private final String code;
    private final String message;

    ErrorCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
