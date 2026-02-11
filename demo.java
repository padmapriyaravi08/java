import java.util.Scanner;

public class demo{
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your rollno:");
        int c=sc.nextInt();
        System.out.print("enter your name");
        String d=sc.next();
        stud s=new stud(c,d);
        s.disp();
        
      }
}
class stud{
  int sno;
  String name;
  stud(int a,String b){
    sno=a;
    name=b;
  }

    
  public void disp()  {   
      System.out.println("Register no:"+sno);
      System.out.println("Name:"+name);
    }
  }



    
        