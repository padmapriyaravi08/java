import java.util.Scanner;
public class neg{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    while(true){
      System.out.println("enter a number:");
      int num=sc.nextInt();
      if (num<0){
        break;
      }
    }
    System.out.println("negative number entered");
  }
}