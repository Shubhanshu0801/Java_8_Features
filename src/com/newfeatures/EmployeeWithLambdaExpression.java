package com.newfeatures;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeWithLambdaExpression {

    public static void main(String[] args) {

        ArrayList<Employee> l = new ArrayList<>();
        l.add(new Employee("Anshu", 102));
        l.add(new Employee("Ishani", 103));
        l.add(new Employee("Rohit", 101));
        System.out.println(l);
        //sorting according to eno
        Collections.sort(l, (e1, e2)-> (e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
        System.out.println(l);
        //sorting according to name
        Collections.sort(l, (e1,e2)-> (e1.name.compareTo(e2.name)));
        System.out.println(l);

    }

}
class Employee {
    String name;
    int eno;
    Employee(String name, int eno) {
        this.name = name;
        this.eno = eno;
    }
    public String toString() {
        return name + ":" + eno;
    }
}
