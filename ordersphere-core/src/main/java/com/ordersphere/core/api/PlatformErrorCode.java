package com.ordersphere.core.api;

public enum PlatformErrorCode {

    BAD_REQUEST(new ErrorCode(400,0000,0001)),
    VALIDATION_ERROR(new ErrorCode(400,0000,0002)),
    UNAUTHORIZED(new ErrorCode(401,0000,0001)),
    FORBIDDEN(new ErrorCode(403,0000,0001)),
    METHOD_NOT_ALLOWED(new ErrorCode(405,0000,0001)),
    UNSUPPORTED_MEDIA_TYPE(new ErrorCode(415,0000,0001)),
    INTERNAL_ERROR(new ErrorCode(500,0000,0001)),
    NOT_FOUND(new ErrorCode(404, 0000, 0001));


    private final ErrorCode code;


    PlatformErrorCode(ErrorCode code) {
        this.code = code;
    }

    public ErrorCode code() {
        return code;
    }
}
