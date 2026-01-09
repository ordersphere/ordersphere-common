package com.ordersphere.core.exception;

import com.ordersphere.core.api.ErrorDetail;
import com.ordersphere.core.api.PlatformErrorCode;

import java.util.List;

public class ValidationException extends BaseException {

    private final List<ErrorDetail> errorDetails;

    public ValidationException(String message, List<ErrorDetail> errorDetails) {
        super(message, PlatformErrorCode.VALIDATION_ERROR.code());
        this.errorDetails = errorDetails;
    }

    public List<ErrorDetail> getErrorDetails() {
        return errorDetails;
    }


}
