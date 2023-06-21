package com.ycj.common.model.enums;

import lombok.Getter;

@Getter
public enum SwitchEnum {
    ON("ON", "开"),
    OFF("OFF", "关");

    private final String code;
    private final String message;

    SwitchEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }
}