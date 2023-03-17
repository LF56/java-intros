//class in java, think of the blueprint to create objects
public class Learn {
  int x = 5;

  public static void learn(String[] args) {
    // public is the access modifier, meaning this will be publically accessible
    // through this code.

    // here we created an object within the class

    // the class will contain a group of different objects and different methods as
    // well

    Learn myObj = new Learn();
    System.out.println(myObj.x);
  }


  //function is created to determine age
  static public void getAge(int age) {

    if (age >= 20) {
      System.out.println("Have fun in college");
    } else if (age <= 20) {
      System.out.println("Enjoy it while you can");
    }

  }
}
