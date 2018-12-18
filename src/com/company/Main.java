package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many players are there?");
        int p = input.nextInt();
        TokenPass test = new TokenPass(p);
        System.out.println("Here is the starting board:");
        System.out.println(test.getBoard());
        System.out.println("CurrentPlayer is equal to " + test.getCurrentPlayer());
        System.out.println("Testing distributeCurrentPlayerTokens():");
        test.distributeCurrentPlayerTokens();
        System.out.println(test.getBoard());
    }
}
