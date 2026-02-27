class  MultipleThreadDemo extends Thread{
  public void run(){
    System.out.println("Running Thread: " + Thread.currentThread().getName());
  }
  public static void main(String[]args){
    MultipleThreadDemo t1=new  MultipleThreadDemo();
    MultipleThreadDemo t2=new  MultipleThreadDemo();
    t1.start();
    t2.start();
  }
}

    