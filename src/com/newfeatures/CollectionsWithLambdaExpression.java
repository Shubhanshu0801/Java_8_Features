package com.newfeatures;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*Comparator interface contains only compare method.
public int compare(Object obj1, Object obj2).
   1. returns -ve iff obj1 has to come before obj2
   2. returns +ve iff obj1 has to come after obj2.
   3. returns 0 iff obj1 and obj2 are equal.
*/

public class CollectionsWithLambdaExpression {

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(25);
        l.add(0);
        l.add(15);
        l.add(5);
        System.out.println(l);
        Comparator<Integer> c = (I1, I2)-> (I1<I2)?-1:(I1>I2)?1:0;
        Collections.sort(l, c);
        System.out.println(l);
    }

}


