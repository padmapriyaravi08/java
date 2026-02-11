import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String n = sc.next();

        System.out.print("Enter your Account no: ");
        int a = sc.nextInt();

        System.out.print("Enter your Bank balance: ");
        int balance = sc.nextInt();

       customer cust = new customer(n, a, balance);

        cust.deposit(1000);
        cust.disp();

        cust.withdraw(600);
        cust.disp();
    }
}

class customer {
    String name;
    int accountno;
    int balance;

    customer(String n, int a, int b) {   
        name = n;
        accountno = a;
        balance = b;
    }

    public void deposit(int d) {
        balance = balance + d;
    }

    public void withdraw(int w) {
        balance = balance - w;
    }

    public void disp() {
        System.out.println("Name: " + name);
        System.out.println("Account no: " + accountno);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }
}

    
    
    
    
    
    