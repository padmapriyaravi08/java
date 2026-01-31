import java.util.Scanner;
public class cases{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println("enter a character");
    ch=sc.next().charAt(0);
    if(ch >= 'A' && ch <='Z'){
      System.out.println("the character is uppercase");
    }
   else if(ch >= 'a'&& ch <= 'z'){
      System.out.println("the character is lowercase");
    }
   else if(ch >='0'&& ch <='9'){
      System.out.println("it is digit");
    }
   else{
     System.out.println("special character");
   }
  }
}

   
    