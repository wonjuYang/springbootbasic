package com.rest.api.advice.exception;

public class CUserCantDeleteException extends RuntimeException{
    public CUserCantDeleteException(String msg, Throwable t){
        super(msg, t);
    }

    public CUserCantDeleteException(String msg){
        super(msg);
    }

    public CUserCantDeleteException(){
        super();
    }

}
