package com.ycj.common.model.result;

import lombok.Data;

/**
 * 分页查询公共返回对象
 */
@Data
public class PageResult<T> extends BaseResult<T> {
    /**
     * 总数
     */
    private long total;

    /**
     * 当前页
     */
    private long page;
}
