package com.company;

public class Main {

    public static void rollASix(){
        int rollDice = 0;
        
        while (rollDice != 6){
            rollDice = (int) (Math.random() * 6 + 1);
            System.out.println("You rolled: " + rollDice);
            
            if(rollDice == 3) {
                break;
            }
        }
        if(rollDice == 6){
            System.out.println("You Win!!!");
        } else {
            System.out.println("You lose");
        }
    }
    public static void chorus() //this is defining chorus as multiple lines of code
	{
	    System.out.println("Once I had a love and it was a gas");
	    System.out.println("Soon found out had a heart of glass");
	    System.out.println("Seemed like the real thing, only to find");
	    System.out.println("Mucho mistrust, love's gone behind");
	    System.out.println("                                  ");
	    System.out.println("Once I had a love and it was divine");
	    System.out.println("Soon found out I was losing my mind");
	    System.out.println("                                  ");
	    System.out.println("...");
	    System.out.println("Once I had a love and it was a gas");
	    System.out.println("Soon found out had a heart of glass");
	    System.out.println("Seemed like the real thing, only to find");
	    System.out.println("Mucho mistrust, love's gone behind");
	}
    public static void countBlocks(int levels) {
        int total = 0;
        for (int i = 1; i <= levels; i++) {
            total = total + (i * i);
        }
        System.out.println(total);
    }
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Outer Loop: " + i);
            for (int j = 0; j < 5; j++) {
                System.out.println("\tInner Loop " + j + ": Hi Everyone!");
            }
        }
        chorus();
        rollASix();
        countBlocks(10);
    }
}



