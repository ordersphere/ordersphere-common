package com.ordersphere.core.api;

import java.time.Instant;
import java.util.List;

public record ErrorResponse(String errorCode, String message, Instant timestamp, List<ErrorDetail> details,
                            String traceId) {

}
