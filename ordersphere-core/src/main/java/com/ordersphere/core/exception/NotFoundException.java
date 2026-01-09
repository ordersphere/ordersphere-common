package com.ordersphere.core.exception;

import com.ordersphere.core.api.PlatformErrorCode;

public class NotFoundException extends BaseException {

    public NotFoundException() {
        super("Resource not found", PlatformErrorCode.NOT_FOUND.code());
    }
}
