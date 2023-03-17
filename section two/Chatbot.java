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
        
        //if they are over 70 - print happy retirement
        //if they are under 70 - print you are so old

        getAge(age);


        System.out.println("\nSo you're " + age + ", cool! I'm 400 years old.");
        System.out.println("This means I'm " + 400/age + " times older than you.");

        System.out.println("Enough about me. What's your favourite language? (just don't say Python)");
    
        //adding a nextline so the real one will not be skipped
        scan.nextLine();

        String language = scan.nextLine(); //english
        String greeting = getLanguage(language);
        String languageResponse = "\n" + language + ", that's great! " + greeting + " Nice chatting with you " + name + ". I have to log off now. See ya!";
        System.out.println(languageResponse); //nice to chat
        
        scan.close();
        UserInformation userInformation = new UserInformation();
        userInformation.name = name;
        userInformation.home = home;
        userInformation.age = age;
        userInformation.language = language;

        System.out.println(userInformation.name);

         getProfile(userInformation);

        // the \n is used to make a new line in the output in java. 
    }

    //access return_type method_name(paramter1Type param1Name, paramter2Type param2Name)
    //void means "this method doesn't return anything"

    //This method takes in a langauge as an argument/parameter
    //and returns an appropriate String with the correct language greeting
    static public String getLanguage(String languageResponse){
        if (languageResponse.equals("english")) {
            return "Hello";
        } 
        else if (languageResponse.equals("spanish")) {
            return "Hola";        
        }

        return "";
    }

    static public void getProfile(UserInformation data) {
        System.out.println("This is what I learned about you:");
        System.out.println(data.name);
        System.out.println(data.home); 
        System.out.println(data.age);
        System.out.println(data.language);
    }


    static public void getAge(int age) {

        if(age >= 70) { 
            System.out.println("Happy Retirement!");
        } 
        else if (age <= 70) {
            System.out.println("You are so old");
        }

    }

    static class UserInformation {
        String name;
        String home;
        int age;
        String language;

    }
}
