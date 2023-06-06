package in.karefo.caller;

import in.karefo.cal.Calculation;
import in.karefo.cal.Input;

public class CallingClass {

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        Input input = new Input();
        input.setA(10);
        input.setB(15);
        System.out.println(calculation.add(input));
        input.setB(2);
        System.out.println(calculation.mul(input));
    }
}
