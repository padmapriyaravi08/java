public class StringBufferExample{
  public static void main(String[] args){
    StringBuffer sb=new StringBuffer("hello");
    System.out.println("original Stringbuffer:"+sb);
    sb.append("world");
    System.out.println("after conacatenation:"+sb);
    sb.reverse();
    System.out.println("reverse:"+sb);
    System.out.println(sb.delete(6,8));
    System.out.println(sb.replace (0,3,"hi"));
    System.out.println(sb.deleteCharAt(1));
  }
}