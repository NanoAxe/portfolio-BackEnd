package com.spring.boot.api.commons;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

import com.spring.boot.api.entity.Response;

@ControllerAdvice
public class fileUploadExceptionAdvice {

	@ExceptionHandler(MaxUploadSizeExceededException.class)
	public ResponseEntity<Response> handleMaxSizeException(MaxUploadSizeExceededException ex){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Response("El tamaño del archivo excede el permitido"));
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> handleException(Exception ex){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new Response("Verifique el tamaño del archivo"));
	}
	
}
