package com.example.carservice.exception;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Singular;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Data
public class ApiError {

	@Builder.Default
	private String timestamp = DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(LocalDateTime.now());
	private HttpStatus status;
	private String message;
	private List<String> errors;

	public ApiError(HttpStatus status, String message, List<String> errors) {
		this.status = status;
		this.message = message;
		this.errors = errors;
	}

	public ApiError(HttpStatus status) {
		this.status = status;
	}
}
