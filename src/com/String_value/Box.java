package com.String_value;

class Case {
    private String value;
    public Case() {}
        public Case(String value) {
        this.value = value;
        }
        public String getValue() {
        return value;
        }

    public void setValue(String value) {
        this.value = value;
    }
public static class Box {

    public static void main(String[] args) {
        Case case1 = new Case("Alexandr");
        System.out.println(case1.getValue());
    }
}

}

