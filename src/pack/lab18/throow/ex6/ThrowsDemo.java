package pack.lab18.throow.ex6;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner sc = new Scanner(System.in);
        String key = sc.next();
        printDetails(key);
    }

    public void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) {
        if (key.isBlank()) {
            return "empty string";
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo throwsDemo = new ThrowsDemo();
        throwsDemo.printDetails("0");
    }
}