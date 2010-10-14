package com.pivotallabs.api;

public class ApiResponse {
    private int httpResponseCode;
    private String responseBody;

    public ApiResponse(int httpCode, String responseBody) {
        this.httpResponseCode = httpCode;
        this.responseBody = responseBody;
    }

    public int getResponseCode() {
        return httpResponseCode;
    }

    public String getResponseBody() {
        return responseBody;
    }


    public boolean isSuccess() {
        return httpResponseCode >= 200 && httpResponseCode < 300;
    }

    public boolean isUnauthorized() {
        return httpResponseCode == 401;
    }

    @Override
    public String toString() {
        return "ApiResponse{" +
                "httpResponseCode=" + httpResponseCode +
                ", responseBody='" + responseBody + '\'' +
                '}';
    }
}