import java.util.Scanner;
public class character{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String java=sc.next();
    if ("aeiou".contains(java)) {
      System.out.println("it is vowel");
    }
    else{
      System.out.println("it is not vowel");
    }
  }
}