import java.util.Scanner;
public class menudriven{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int choice;
    do{
      System.out.println("say hello");
      System.out.println("say bye");
      System.out.println("say exit");
      System.out.println("enter your choice:");
      choice=sc.nextInt();
      switch(choice){
        case 1:
          System.out.println("hello");
          break;
        case 2:
          System.out.println("bye");
          break;
        case 3:
          System.out.println("exiting");
          break;
        default:
          System.out.println("invalid choice");
      }
    }
    while (choice!=3);
  }
}
          