package com.ordersphere.core.api;

public record ErrorCode(int httpCode, int serviceCode, int businessCode) {

    @Override
    public String toString() {
        return "%d.%04d.%04d".formatted(httpCode, serviceCode, businessCode);
    }
}
