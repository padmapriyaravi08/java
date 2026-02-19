import java.util.Scanner;
public class stud_details{
  public static void main(String srgs[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter name:");
    String n=sc.next();
    System.out.println("enter register no:");
    int a=sc.nextInt();
    System.out.println("enter department:");
    String b=sc.next();
    System.out.println("enter three subject marks:");
    int mar1=sc.nextInt();
    int mar2=sc.nextInt();
    int mar3=sc.nextInt();
    mark s1 = new mark(n, a, b, mar1, mar2, mar3);
    s1.disp1();
    s1.calculate();
    s1.disp2();
  }
}
class student{
  String name;
  int rollno;
  String department;
  student(String n,int a,String b){
    name=n;
    rollno=a;
    department=b;
  }
    
    void disp1(){
      System.out.println("enter your name:"+name);
      System.out.println("enter your rollno:"+rollno);
      System.out.println("enter your department:"+department);
    }
  }
class mark extends student{
  int mark1,mark2,mark3,total;
  float avg;
  String res;
  mark(String n,int a, String b,int m1,int m2,int m3){
    super(n , a , b);
    mark1=m1;
    mark2=m2;
    mark3=m3;
  }
  public void calculate(){
    total=mark1+mark2+mark3;
    avg=total/3;
    if(mark1>40&&mark2>40&&mark3>40){
      res="pass";
    }
    else{
      res="fail";
    }
  }
  public void disp2(){
    System.out.println("mark1:"+mark1);
    System.out.println("mark2:"+mark2);
    System.out.println("mark3:"+mark3);
    System.out.println("total:"+total);
    System.out.println("average:"+avg);
    System.out.println("result:"+res);
  }
}


      
    
    
    
    
     
    
    
    
    
    
  
      
    
  
  

  
  
  