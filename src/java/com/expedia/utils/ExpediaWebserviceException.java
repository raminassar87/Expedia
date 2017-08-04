/*
 * Copyright (c) Expedia 2017.
 * All Rights Reserved.
 * * ver    Developer          Date        Comments
 * -----  -----------------  ----------  ----------------------------------------
 * 1.00    Rami Nassar       02/08/2017  - File created.
 */
package com.expedia.utils;

/**
 * Expedia Webservice Exception
 * 
 * @author Rami Nassar
 */
public class ExpediaWebserviceException extends RuntimeException {
    
    /*
     * Constructor
     */
    
    public ExpediaWebserviceException() {
        super();
    }

    /**
     * Construct new WebServiceException object.
     *
     * @param msg : Exception error message.
     */
    public ExpediaWebserviceException(String msg) {
        super(msg);
    }

    /**
     * Nest the generated exception inside WebServiceException object.
     *
     * @param nestedException : Generated exception.
     */
    public ExpediaWebserviceException(Throwable nestedException) {
        super(nestedException);
    }

    /**
     * Nest the generated exception inside WebServiceException object.
     *
     * @param msg : Exception error message.
     * @param nestedException : Generated exception.
     */
    public ExpediaWebserviceException(String msg, Throwable nestedException) {
        super(msg, nestedException);
    }
}