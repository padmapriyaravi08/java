public class stringexample{
  public static void main(String[] args){
    String s1="hello";
    System.out.println("original string:"+s1);
    s1=s1+"world";
    System.out.println("after concatenation:"+s1);
    System.out.println("uppercase:"+s1.toUpperCase());
    System.out.println("lowercase:"+s1.toLowerCase());
    System.out.println(s1.replace("l","r"));
    System.out.println(s1.substring(0,3));
    System.out.println(s1.length());
    System.out.println(s1.charAt(1)); 
    System.out.println(s1.concat(" Programming"));
    

  

  }
}
