package com.newfeatures;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        SampleInterface i = Sample::new;
        Sample s = i.get("Anshu");
    }
}
class Sample {
    Sample(String s) {
        System.out.println("Sample class constructor executed with argument " + s);
    }
}
interface SampleInterface {
    public Sample get(String s);
}
