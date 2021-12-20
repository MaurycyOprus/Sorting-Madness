package pl.put.poznan.transformer.logic;

import java.time.LocalDateTime;

public class ErrorMessage {
    private final LocalDateTime timestamp;
    private final String message;

    public ErrorMessage(String message){
        this.timestamp = LocalDateTime.now();
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

}
