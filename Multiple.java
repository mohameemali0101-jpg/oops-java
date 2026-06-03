package com.tcs.prep;

interface A {
    void displayA();
}

interface B {
    void displayB();
}

// This matches your filename Multiple.java (ignoring case, though it should match exactly)
class multiple implements A, B {

    public void displayA() {
        System.out.println("Interface A");
    }

    public void displayB() {
        System.out.println("Interface B");
    }

    // Move the main method here!
    public static void main(String[] args) {
        multiple m = new multiple();
        m.displayA();
        m.displayB();
    }
}