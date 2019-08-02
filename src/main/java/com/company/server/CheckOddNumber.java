package com.company.server;

import com.company.exception.ExceptionForOddNumber;

import java.util.Scanner;

public class CheckOddNumber extends ExceptionForOddNumber {
    public CheckOddNumber(String message) {
        super(message);
    }

    public void checkNumberOdd() throws ExceptionForOddNumber {
        Scanner in=new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER: ");
        int a=in.nextInt();
        System.out.println("GIVEN NUMBER IS: "+a);

            if (a%2 ==0 && a<100) {
                System.out.println("NUMBER IS PAIR \n");
            }
            else {
                throw new ExceptionForOddNumber("Error : number is not pair or number <100 \n");
            }

    }
}
