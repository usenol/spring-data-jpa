package com.usenol.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> {
    private LocalDateTime timestamp;
    private int status;
    private String message;
    private T data; // Hata mesajları veya başarılı yanıtlar için dinamik veri türü
}
