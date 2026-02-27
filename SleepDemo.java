class SleepDemo extends Thread{
  public void run(){
    try{
      System.out.println("thread is going to sleep");
      Thread.sleep(2000);
       System.out.println("thread woke up");
    }
    catch(InterruptedException e){
       System.out.println(e);
    }
  }
  public static void main(String args[]){
    SleepDemo t=new SleepDemo();
    t.start();
  }
}
  