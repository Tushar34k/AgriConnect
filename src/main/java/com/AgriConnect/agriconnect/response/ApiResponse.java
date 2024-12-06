package com.AgriConnect.agriconnect.response;

import java.time.LocalDateTime;

public class ApiResponse<T> {
    private boolean status;        // Success or failure indicator
    private String message;        // Descriptive message
    private T data;                // Generic data payload
    private LocalDateTime timestamp; // Timestamp of the response

    // Constructors
    public ApiResponse() {
        this.timestamp = LocalDateTime.now(); // Automatically set timestamp
    }

    public ApiResponse(boolean status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
        this.timestamp = LocalDateTime.now();
    }

    // Getters and Setters
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}

