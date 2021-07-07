package com.rest.api.advice.exception;

public class CUserCantPutException extends RuntimeException{
    public CUserCantPutException(String msg, Throwable t){
        super(msg, t);
    }

    public CUserCantPutException(String msg){
        super(msg);
    }

    public CUserCantPutException(){
        super();
    }
}
