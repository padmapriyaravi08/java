import java.util.Scanner;
class allexcept{
  public static void main(String args[]){
    try{
      int a=10/0;
    }
    catch(ArithmeticException e){
      System.out.println("arithmetic exception occurred");
    }
    try{
      int arr[]=new int[5];
      arr[10]=100;
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println("index error occurred");
    }
    try{
      int num = Integer.parseInt("abc");
    }
    catch(NumberFormatException e){
       System.out.println("NumberFormatException caught: " + e);
    }
    finally{
      System.out.println("final block excecuted");
    }
  }
}
    
       
           
      
      
      
    
      
      
      
      
    