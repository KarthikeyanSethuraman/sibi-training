package in.karefo.variable;

public class GlobalVariable {
    String globalVariable = "Hello Local Varaible";

    public void printHello(){
        System.out.println(globalVariable);
    }

    public static void main(String[] args) {
        GlobalVariable globalInstance = new GlobalVariable();
        System.out.println(globalInstance.globalVariable);
        StaticVariable.staticVar = "hello dynamically changed";
        System.out.println(StaticVariable.staticVar);

    }
}
