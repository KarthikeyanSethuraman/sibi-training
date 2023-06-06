package in.karefo.cal;

public class Calculation {

    public int add(Input input){
        return input.getA()+input.getB();
    }

    public int mul(Input input){
        return input.getA()*input.getB();
    }
}
