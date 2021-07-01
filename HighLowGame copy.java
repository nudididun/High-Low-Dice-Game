/*
Purpose: This Program simulates a high/low Dice game between the user and the computer
Name: Didunoluwa
Major: Computer Science
Date: 11th February, 2021
 */

import java.util.*;
public class HighLowGame {
    public static void main (String [] args)
    {
   s
    //Introduction
    Random randGen = new Random ();
    Scanner keyboard = new Scanner(System.in);
    String prompt =  "\nWELCOME TO HIGH/LOW DICE GAME\nYou are Player 1, Computer is Player 2\n";
           prompt += "\nYou will be prompted to enter any integers between 1 and 6 ONLY, representing each of five die rolls.\n";
           prompt += "\nIf you want to roll a 2, simply type in 2 and hit enter to input your next value. \n";
           prompt += "\nThe computer will then randomly generate it's own 5 values. The summation of your five die rolls will then be "
                   + "compared to that of the computer's.\n";
           prompt += "\nNext, you will be asked to guess if your total value will be Higher or Lower than the computer's total\n";
           prompt += "\nIf you guess correctly, you will be the winner of the game. \n";
           prompt += "\nnb: you can repeat values as long as they remain WITHIN THE RANGE OF 1 - 6\n\n\n";
           System.out.print(prompt);
  
    // ASCII dice Art  
    System.out.print ("\t\t\tThe game is now starting!\t\t\n");  
    System.out.print("\t+------+\n");
    System.out.print(" "+" "+" "+" "+" "+" "+" "+"/" + " "+ " "+" "+" "+"* "+"/"+ "|"+"\n");
    System.out.print(" "+" "+" "+" "+" "+" "+"/" + " *"+ " "+" "+" "+" "+"/"+ " "+"|"+"\n");
    System.out.print(" "+ " "+" "+" "+" "+"+------+" + " "+ " |" +"\n");
    System.out.print(" "+ " "+" "+" "+" "+"|"+"*"+ " "+" "+" "+" " +"*"+"|"+" *" + "|" + "\n");
    System.out.print(" "+ " "+" "+" "+" "+"|"+" "+ " "+" *"+""+" " +" "+"|"+ " " + " /"+"\n");
    System.out.print(" "+ " "+" "+" "+" "+"|"+"*"+ " "+" "+" "+" " +"*"+"|"+ " /"+"\n");
    System.out.print(" "+ " "+" "+" "+" "+"+------+\n");
    
          
    System.out.print ("Player 1, it is your turn!\n");
    System.out.print("die roll 1-->");
    int a = keyboard.nextInt();
    System.out.print("die roll 2-->");
    int b = keyboard.nextInt();
    System.out.print("die roll 3-->");
    int c = keyboard.nextInt();
    System.out.print("die roll 4-->");
    int d = keyboard.nextInt();
    System.out.print("die roll 5-->");
    int e = keyboard.nextInt();                 
    
    int users_total_rolls = a+b+c+d+e;
    System.out.print(users_total_rolls+ " is your total value\n");
    
  System.out.print ("Enter H if you think your roll will be higher than the computer's, or "
                    + "L if you think your roll will be lower--->");
  String users_guess = keyboard.next();
               
   //Random Generator for computer's values  
    int f = randGen.nextInt(5)+1;
    int g = randGen.nextInt(5)+1;
    int h = randGen.nextInt(5)+1;
    int i = randGen.nextInt(5)+1;
    int j = randGen.nextInt(5)+1;
    
    System.out.print ("\nPlayer 2, it is your turn!\n");
    System.out.print ("die roll 1 --->" +f+"\n");
    System.out.print ("die roll 2 --->" +g+"\n");
    System.out.print ("die roll 3 --->" +h+"\n");
    System.out.print ("die roll 4 --->" +i+"\n");
    System.out.print ("die roll 5 --->" +j+"\n");
    
    int computers_total_rolls = f+g+h+i+j;
    System.out.print ("\n\nYou rolled a total of: "+users_total_rolls+ " while the computer rolled a total of: "+computers_total_rolls +"\n");
    
    
    if (users_guess.equalsIgnoreCase("H") )
        if (users_total_rolls>computers_total_rolls)
            System.out.print("You guessed 'Higher' Correctly. YOU WIN!\n");
        else
            System.out.print ("You guessed 'Higher' Incorrectly. Computer Wins\n");
    else if (users_guess.equalsIgnoreCase ("L"))
        if (users_total_rolls<computers_total_rolls)
            System.out.print ("You guessed 'Lower' Correctly. YOU WIN!\n");
        else
            System.out.print ("You guessed 'Lower' Incorrectly. Computer Wins \n");
            String End = "\n\nThis program is now terminating!\n";
            End += "Thank you for playing :)) \n";
            System.out.print (End);
        
    
                    
        
    
    
   
       
    
}
}