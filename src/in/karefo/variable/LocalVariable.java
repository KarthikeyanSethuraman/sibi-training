package in.karefo.variable;

public class LocalVariable {

    public void printHello(){
        String localVariable = "Hello Local Varaible";
        System.out.println(localVariable);
    }

    public static void main(String[] args) {
        LocalVariable localVariable = new LocalVariable();
        localVariable.printHello();
    }
}
