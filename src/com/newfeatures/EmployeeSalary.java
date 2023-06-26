package com.newfeatures;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeSalary {

    public static void main(String[] args) {

        ArrayList<Employees> l = new ArrayList<>();
        l.add(new Employees(70000));
        l.add(new Employees(50000));
        l.add(new Employees(60000));
        l.add(new Employees(40000));
        l.add(new Employees(20000));
        l.add(new Employees(10000));
        l.add(new Employees(30000));
        System.out.println(l);

        Collections.sort(l, (e1, e2)-> (e1.salary<e2.salary)?-1:(e1.salary>e2.salary)?1:0);
        System.out.println(l);
        for(int i=0; i<l.size(); i++) {

        }

    }

}
class Employees {
    int salary;
    Employees(int salary) {
        this.salary = salary;
    }
    public String toString() {
        return "" + salary;
    }
}

