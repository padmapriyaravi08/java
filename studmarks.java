import java.util.Scanner;

public class studmarks{
      public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your rollno:");
        int c=sc.nextInt();
        System.out.print("enter your name");
        String d=sc.next();
        System.out.print("enter your mark1");
        int m1=sc.nextInt();
        System.out.print("enter your mark2");
        int m2=sc.nextInt();
        System.out.print("enter your mark3");
        int m3=sc.nextInt();        
        stud s=new stud(c,d,m1,m2,m3);
        s.cal();
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
  
  
  public void cal(){
    total=m1+m2+m3;
  }

    
  public void disp()  {   
      System.out.println("Register no:"+sno);
      System.out.println("Name:"+name);
    }
  }