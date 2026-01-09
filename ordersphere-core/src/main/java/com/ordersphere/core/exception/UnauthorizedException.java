package com.ordersphere.core.exception;

import com.ordersphere.core.api.PlatformErrorCode;

public class UnauthorizedException extends BaseException {

    public UnauthorizedException() {
        super("Unauthorized", PlatformErrorCode.UNAUTHORIZED.code());
    }
}
