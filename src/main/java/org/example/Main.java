package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> tokenOptions = Arrays.asList(5, 10, 15);

        Scanner scan = new Scanner(System.in);
        TokenGenerator tokenGenerator = new TokenGenerator();


        try {
            TokenGenerator.printInstruction(tokenOptions);
            int charNumber = scan.nextInt();
            switch (charNumber) {
                case 5 -> tokenGenerator.generateToken(5);
                case 10 -> tokenGenerator.generateToken(10);
                case 15 -> tokenGenerator.generateToken(15);
                default -> TokenGenerator.printAlert(tokenOptions);
            }
        } catch (Exception e) {
            TokenGenerator.printAlert2();
        }

    }
}