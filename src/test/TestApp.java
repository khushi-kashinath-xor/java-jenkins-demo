package test;

public class TestApp {

    public static void main(String[] args) {
        System.out.println("Running test case...");

        int expected = 2;
        int actual = 1 + 1;

        if (expected != actual) {
            System.out.println("TEST FAILED");
            System.exit(1); // fail build
        }

        System.out.println("TEST PASSED");
    }
}