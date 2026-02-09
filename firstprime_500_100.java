class firstprime_500_100  {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        for (int num = 51; num < 100; num++) {
            if (isPrime(num)) {
                System.out.println(num);
                break;
            }
        }
    }
}
