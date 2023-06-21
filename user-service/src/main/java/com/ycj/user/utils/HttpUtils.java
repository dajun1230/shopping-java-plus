package com.ycj.user.utils;

import com.ycj.common.model.HeaderConstant;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

public class HttpUtils {
    public static HttpServletRequest currentRequest() {
        return ((ServletRequestAttributes) Objects.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
    }

    public static String getManageUserId(HttpServletRequest httpServletRequest) {
        return httpServletRequest.getHeader(HeaderConstant.MANAGE_USER_ID);
    }
}
