package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;

public class TokenGenerator {


    Random rand = new Random();


    public void generateToken(int charNumber) throws InputMismatchException {

        ArrayList<Character> symbols = new ArrayList<>();

        for (int i = 0; i < charNumber; i++) {
            int intForChar = rand.nextInt(33, 123);
            while ((intForChar == 34) || (intForChar == 39) || (intForChar > 42 && intForChar < 48) || (intForChar > 57 && intForChar < 64) || (intForChar > 90 && intForChar < 94) || (intForChar > 94 && intForChar < 97)) {
                intForChar = rand.nextInt(33, 123);
            }

            Character symbol = (char) intForChar;
            symbols.add(symbol);
        }
        String token = convertArrayToString(symbols);
        System.out.println("Your token: " + token);

    }


    public static String convertArrayToString(ArrayList<Character> listOfChars) {
        String token = "";
        for (char character : listOfChars) {
            token = token + character;
        }
        return token;
    }


    public static void printInstruction(List<Integer> options) {
        System.out.println("Choose the number of characters in your token: " + options);
    }


    public static void printAlert(List<Integer> options) {
        System.out.println("You can only choose a number from:  " + options + ", please start again. ");
    }

    public static void printAlert2() {
        System.out.println("You can only choose a number, please start again.");
    }


}