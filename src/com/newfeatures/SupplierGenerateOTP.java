package com.newfeatures;

import java.util.function.Supplier;

public class SupplierGenerateOTP {
    public static void main(String[] args) {
        /*To generate random otp we will use random() of Math class.
          Every time this method give a random number.
          Range of this method- 0<=x<1.
         */
        Supplier<String> supplier = ()-> {
          String otp = "";
          for(int i=0; i<6; i++) {
              otp = otp + (int) (Math.random() * 10);
          }
          return otp;
        };
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
        System.out.println(supplier.get());
    }
}
