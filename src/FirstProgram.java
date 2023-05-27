

public class FirstProgram {

     public void printMyText(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        System.out.println(args[0] +" "+ args[1]);
        FirstProgram sibi = new FirstProgram();
        sibi.printMyText();
    }
}
