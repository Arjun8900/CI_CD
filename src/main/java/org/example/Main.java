package org.example;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Hello world! from arjun");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}