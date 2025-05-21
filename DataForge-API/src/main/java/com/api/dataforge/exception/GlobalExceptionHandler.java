package com.api.dataforge.exception;


import com.api.dataforge.dto.ErrorResponseDto;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.server.ServerWebExchange;


import java.time.LocalDateTime;


@ControllerAdvice
public class GlobalExceptionHandler {
/*
    @ExceptionHandler(RuntimeException.class)
    public Mono<ResponseEntity<ErrorResponseDto>> handleRuntimeException(RuntimeException ex,  ServerWebExchange exchange) {

        String path = exchange.getRequest().getPath().value();

        // ✅ Don't interfere with Swagger/OpenAPI endpoints
        if (path.startsWith("/v3/api-docs") || path.startsWith("/swagger") || path.contains("swagger-ui")) {
            return Mono.error(ex);  // Let Spring handle it
        }
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
                path,
                HttpStatus.INTERNAL_SERVER_ERROR,
                ex.getMessage(),
                LocalDateTime.now()
        );
        return Mono.just(ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(errorResponseDTO));
    }

 */

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponseDto> handleGlobalException(Exception exception,
                                                                  ServerWebExchange exchange) {
        String path = exchange.getRequest().getPath().value();
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
                path,
                HttpStatus.INTERNAL_SERVER_ERROR,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorResponseDto> handleResourceNotFoundException(RuntimeException exception,
                                                                            ServerWebExchange exchange) {
        String path = exchange.getRequest().getPath().value();
        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
               path,
                HttpStatus.NOT_FOUND,
                exception.getMessage(),
                LocalDateTime.now()
        );
        return new ResponseEntity<>(errorResponseDTO, HttpStatus.NOT_FOUND);
    }



//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(Exception exception,
//                                                                                 WebRequest webRequest){
//        ErrorResponseDto errorResponseDTO = new ErrorResponseDto(
//                webRequest.getDescription(false),
//                HttpStatus.BAD_REQUEST,
//                exception.getMessage(),
//                LocalDateTime.now()
//        );
//        return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_REQUEST);
//    }


}