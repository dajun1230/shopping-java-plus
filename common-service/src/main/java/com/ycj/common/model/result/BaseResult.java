package com.ycj.common.model.result;

import lombok.Data;

@Data
public class BaseResult<T> {
    /**
     * 結果碼
     */
    private String code;

    /**
     * 描述
     */
    private String desc;

    /**
     * 返回數據
     */
    private T result;

    public BaseResult() {

    }

    public BaseResult(T result) {
        this.result = result;
    }
}