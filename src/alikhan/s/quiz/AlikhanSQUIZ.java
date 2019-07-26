
 package alikhan.s.quiz; bn

import java.util.Scanner;

public class AlikhanSQUIZ{

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rightAnswers = 0;
        
        System.out.println("Here comes a quiz.Answer only with capital letter. No cheating!");
        
        System.out.println("Question 1:What is the capital of Russia?");
        System.out.println("\tA) Saint-Peterburg");
        System.out.println("\tB) Moscow");
        System.out.println("\tC) Kiev");
        System.out.println("\tD) Toliatti");
        String answer1 = keyboard.nextLine();
        if (answer1.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Moscow!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 1 question.");
        
        System.out.println("Question 2: How many states are in USA?");
        System.out.println("\tA) 40");
        System.out.println("\tB) 20");
        System.out.println("\tC) 30");
        System.out.println("\tD) 50");
        String answer2 = keyboard.nextLine();
        if (answer2.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, there are 50 states!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 2 question.");
       
        
        System.out.println("Question 3: Who is the richest person in the world?");
        System.out.println("\tA) Bill Gates");
        System.out.println("\tB) Mark Zuckerberg");
        System.out.println("\tC) Warren Buffet");
        System.out.println("\tD) Jeff Bezos");
        String answer3 = keyboard.nextLine();
        if (answer3.equals("D")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Unlucky, the richest person is Jeff Bezos!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 3 question.");
       
        
        System.out.println("Question 4: Who is the president of USA?");
        System.out.println("\tA) Barack Obama");
        System.out.println("\tB) Donald Trump");
        System.out.println("\tC) Hillary Clinton");
        System.out.println("\tD) John Kennedy");
        String answer4 = keyboard.nextLine();
        if (answer4.equals("B")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the president of USA is Donald Trump!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 4 question.");
        System.out.println("Question 5: Who is the number 1 tennis player?");
        System.out.println("\tA) Rafael Nadal");
        System.out.println("\tB) Roger Federer");
        System.out.println("\tC) Novak Djokovic");
        System.out.println("\tD) Andy Murray");
        String answer5 = keyboard.nextLine();
        if (answer4.equals("C")) {
            System.out.println("That is correct!");
            rightAnswers++;
        }
        else {
            System.out.println("OHHHH, unlucky!Number 1 tennis player is Novak Djokovic!");
        }
        
        
        System.out.println("Your score is " + rightAnswers + " out of 5 question.");
    }
    
    }
    
    
 


    

