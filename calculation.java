import java.util.Scanner;
public class calculation{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    Double num1,num2;
    char operator;
    System.out.println("enter first number:");
    num1=sc.nextDouble();
    System.out.println("enter second number:");
    num2=sc.nextDouble();
    System.out.println("enter operator:");
    operator=sc.next().charAt(0);
    switch(operator){
      case '+':
        System.out.println("result="+(num1+num2));
        break;
        case '-':
        System.out.println("result="+(num1-num2));
        break;
        case '*':
        System.out.println("result="+(num1*num2));
        break;
        case '/':
        System.out.println("result="+(num1/num2));
        break;
      default:
        System.out.println("invalid operator");
    }
  }
}
        
    
    
    