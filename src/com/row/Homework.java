package com.row;

class Home {
    private String a;
    private int b;
    public Home() {}
    public Home(String a, int b) {
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


class Training {


    public static void main(String[] args) {
        Home home1 = new Home("Alex", 25);
        Home home2 = new Home();
        home2.setB(5);
        System.out.println(home1.getA() + home2.getB());
    }
}