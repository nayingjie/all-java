import java.util.Scanner;
public class cditls {
  public static void main(String[] args) {
      System.out.print("Testing.");
      System.out.println("OK.");
      Scanner user = new Scanner( System.in );
      String input;
      System.out.println("What was I thinking of again...?");
      String thought = "coding";
      input=user.next();
      if (input.matches(thought)) {
          System.out.println("That's it!");
      } else {
          System.out.println("That's not it...");
      }
  }
}
