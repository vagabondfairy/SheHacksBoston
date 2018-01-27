package com.example.avlam.weatherbrawl;

/**
 * Created by avlam on 1/27/2018.
 */
import java.util.*;
public class MainBrawl
{
    public static void main (String [] args)
    {
        Scanner kb= new Scanner (System.in);

        int hurricane; //rock
        int earthquake; // paper
        int snowstorm; // scissors

        int computerChoice;
        int yourChoice;

        System.out.println("We are going to play Hurricane, Earthquake, Snowstorm!");
        // Rock Paper Scissors

        computerChoice= (int)(3*Math.random())+1;

        int userCount=0;
        int compCount=0;
        int tieCount=0;

        String answer1;

        do
        {
            System.out.println("Enter 1 for Rock\nEnter 2 for paper\nEnter 3 for scissors");
            yourChoice=kb.nextInt();

            if (yourChoice==1)
            {
                System.out.println("You chose rock");
            }
            else if (yourChoice==2)
            {
                System.out.println("You chose paper");
            }
            else
            {
                System.out.println("You chose scissors");
            }


            if (computerChoice==1)
            {
                System.out.println("The computer chose rock");
            }
            else if (computerChoice==2)
            {
                System.out.println("The computer chose paper");
            }
            else
            {
                System.out.println("The computer chose scissors");
            }


            if (yourChoice==3 &&computerChoice==1)
            {
                System.out.println("You lose");
                compCount++;
            }
            else if ((yourChoice>computerChoice)||(yourChoice==1&&computerChoice==3))
            {
                System.out.println("You win");
                userCount++;
            }
            else if ((computerChoice>yourChoice) || (computerChoice==1 && yourChoice== 3))
            {
                System.out.println("You lose");
                compCount++;
            }
            else if(yourChoice==computerChoice)
            {
                System.out.println("You tied");
                tieCount++;
            }
            else
            {
                System.out.println("You lose");
                compCount++;
            }


            System.out.println("Computer Count at: " + compCount);
            System.out.println("User Count at: " + userCount);
            System.out.println("Tie count at: " + tieCount);

            if (compCount>userCount&&compCount!=1)
            {
                System.out.println("Out of 3, THE COMPUTER WON");
                break;
            }

            else if(userCount>compCount&&userCount!=1)
            {
                System.out.println("Out of 3, YOU WON");
                break;
            }

            else
            {
                System.out.println("No one won best of 3 yet!");
            }

            System.out.println("Do you want to play again? Type yes or no");
            answer1=kb.next();

        }

        while(answer1.equalsIgnoreCase("yes"));

    }
}


