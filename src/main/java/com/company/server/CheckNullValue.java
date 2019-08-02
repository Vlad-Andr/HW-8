package com.company.server;

import com.company.exception.ExceptionForNullValue;



public class CheckNullValue extends ExceptionForNullValue {
    public CheckNullValue(String message) {
        super(message);
    }

    public void checkobjNULL(Object o) throws ExceptionForNullValue {

            if (o == null) {
                throw new ExceptionForNullValue("Error : object value is null");
            } else {
                System.out.println("GIVEN VALUE IS NOT NULL \n");
            }

        }
    }