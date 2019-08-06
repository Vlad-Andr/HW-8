package com.company.server;

public class CheckNullValue extends NullPointerException {
  /*  public CheckNullValue(String message) {
        super(message);
    }*/
    public void checkOnNull(Object o) throws NullPointerException {
            if (o == null) {
                throw new NullPointerException("Error : object value is null");
            } else {
                System.out.println("GIVEN VALUE IS NOT NULL \n");
            }
        }
    }