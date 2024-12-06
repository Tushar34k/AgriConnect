package com.AgriConnect.agriconnect.response;

public class ApiResponseUtil<T> {

    // Success response
    public static <T> ApiResponse<T> success(String message, T data) {
        return new ApiResponse<>(true, message, data);
    }

    // Failure response
    public static <T> ApiResponse<T> failure(String message, T data) {
        return new ApiResponse<>(false, message, data);
    }

    // Overload for success without data
    public static ApiResponse<Void> success(String message) {
        return new ApiResponse<>(true, message, null);
    }

    // Overload for failure without data
    public static ApiResponse<Void> failure(String message) {
        return new ApiResponse<>(false, message, null);
    }
}

