class animal{
  void sound(){
    System.out.println("animals make sound");
  }
}
class dog extends animal{
  void sound(){
    System.out.println("dogs bark");
  }
}
public class overriding{
public static void main(String[] args){
  animal obj=new dog();
  obj.sound();
}
}
    
                     