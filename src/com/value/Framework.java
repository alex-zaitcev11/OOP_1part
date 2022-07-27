package com.value;

class Work {
        private String value;
        public Work() {
        }
        public Work(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }

        public static class Situation {

            public static void main(String[] args) {
                Work work1 = new Work();
                work1.setValue("Hello everyone");
                System.out.println(work1.getValue());
            }
        }
    }

