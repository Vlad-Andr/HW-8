package com.company.server;
import com.company.exception.OddNumberException;

import java.util.Scanner;

public class CheckOddNumber extends OddNumberException {
    public CheckOddNumber(String message) {
        super(message);
    }

    public void checkNumberOdd(int a) throws OddNumberException {


        System.out.println("GIVEN NUMBER IS: "+a);

        if (a%2 ==0 && a<100) {
            System.out.println("NUMBER IS PAIR \n");
        }
        else {
            throw new OddNumberException("Error : number is not pair or number <100 \n");
        }

    }
}
