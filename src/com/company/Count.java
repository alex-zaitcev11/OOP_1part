package com.company;

class Test {
    private String a;
    private int b;
    public Test() {}
    public Test(String a, int b) {
        this.a = a;
        this.b = b;
    }
    public String getA() {

        return new StringBuilder(a).reverse().toString();
    }
    public void setB(String a) {

        this.a = a;
    }
    public int getB() {
        return b * b;
    }
    public void setB(int b) {
        this.b = b;
    }
}


public class Count {


    public static void main(String[] args) {
    Test test1 = new Test("Alex", 25);
    Test test2 = new Test();
    test2.setB(5);
        System.out.println(test1.getA() + test2.getB());
    }
}
