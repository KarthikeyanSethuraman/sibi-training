public class Fibonacci {

    public void fib(int n){
        int a = 0;
        int b =1;
        for (int i = 0; i < n; i++) {
            int c = a+b;
            System.out.print(c);
            if(i!=0){
                a = b;
                b = c;
            }
            if(i+1!=n){
                System.out.print(",");
            }
        }
        System.out.println("");
    }

    public void printFib(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("# ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        fibonacci.fib(Integer.parseInt(args[0]));
        fibonacci.printFib(Integer.parseInt(args[0]));
    }
}
