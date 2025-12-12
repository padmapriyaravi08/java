import java.util.Scanner;
public class student{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String name=sc.next();
    int rollno=sc.nextInt();
    int mark1=sc.nextInt();
    int mark2=sc.nextInt();
    int mark3=sc.nextInt();
    System.out.println("name"+name);
    System.out.println("rollno"+rollno);
    System.out.println("mark1"+mark1);
    System.out.println("mark2"+mark2);
    System.out.println("mark3"+mark3);
    int total;
    total=mark1+mark2+mark3;
    System.out.println("total"+total);
  }
}
    
    