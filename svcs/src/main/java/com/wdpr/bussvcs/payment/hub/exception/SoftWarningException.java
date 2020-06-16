package com.wdpr.bussvcs.payment.hub.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@SuppressWarnings({ "unchecked", "rawtypes" })
@ControllerAdvice
public class SoftWarningException extends ResponseEntityExceptionHandler {

//    Example to handle expecific exceptions, must be throw it by the application in the same way
//    @ExceptionHandler(ServiceException.class)
//    public final ResponseEntity<Object> serviceException(ServiceException ex, WebRequest request) {
//        ServiceApplicationFault detail = ex.getServiceExceptionDetails().getApplicationErrors().get(0);
//        ErrorResponse error = new ErrorResponse(ex.getMessage(), detail);
//        HttpStatus statusCode = HttpStatus.INTERNAL_SERVER_ERROR;
//        if (detail != null && detail.getApplicationFaultCode() != null
//                && detail.getApplicationFaultCode().isOverridable()) {
//            statusCode = HttpStatus.CONFLICT;      
//        }
//        return new ResponseEntity(error, statusCode);
//    }
}
