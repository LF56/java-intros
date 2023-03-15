//we need to import scanner to scan for values
import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        //scanner will be capturing information from the system
        Scanner scan = new Scanner(System.in);

        //Here we are firrst printing a question to the console for system to answer
        //then we store the input from the scan as a string

        System.out.println("Hello. What is your name?");
        String name = scan.nextLine();

        //same with this next one, we post a question to the console
        //in the posted question we will input repplys from other questions
        //then we will store the value as a string

        System.out.println("\nHi "+ name +"! I'm Javabot. Where are you from?");
        String home = scan.nextLine();

        System.out.println("\nI hear it's beautiful at "+ home +"! I'm from a place called Oracle");
        System.out.println("How old are you?");
        //since the value will be integer, we use nextInt to store correct value
        int age = scan.nextInt();

         System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + 400/age + " times older than you.");

        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
    
        //adding a nextline so the real one will not be skipped
        scan.nextLine();

        String language = scan.nextLine();

        System.out.println("\n" + language + ", that's great! Nice chatting with you " + name + ". I have to log off now. See ya!");
        
        scan.close();

        // the \n is used to make a new line in the output in java. 

        
    }
}
