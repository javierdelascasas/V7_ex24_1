package se.javierdlc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EUTrafficLight tls = new EUTrafficLight();
        while (true) {
            tls.tick();
            System.out.println("\r\n\r\n");
            System.out.println("Red: " + tls.getRedLight());
            System.out.println("Yellow: " + tls.getYellowLight());
            System.out.println("Green: " + tls.getGreenLight());
            Scanner sc = new Scanner(System.in);
            sc.nextLine();

        }
    }
}
