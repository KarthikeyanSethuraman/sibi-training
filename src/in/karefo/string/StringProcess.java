package in.karefo.string;

import java.util.ArrayList;
import java.util.List;

public class StringProcess {

    public void StringP(){
        String word = "karth";
        word = word + "ikeyan";
        word = word + " sethuraman";
        System.out.println(word);
        StringBuilder sb = new StringBuilder();
        sb.append("karth");
        sb.append("ikeyan");
        sb.append(" sethuraman");
        System.out.println(sb.toString());
    }


    public void split(){
        String s1 = "Karthikeyan,sethuraman";
        String[] split = s1.split(",");
        for(String s:split){
            System.out.println(s);
        }
    }

    public void printJoinCharacters(String input){
        List<Character> joinCharacters = new ArrayList<Character>();
        joinCharacters.add('ி');
        joinCharacters.add('்');

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char nextChar = input.charAt(i+1);
            if(joinCharacters.contains(nextChar)){
                System.out.println(String.valueOf(currentChar)+
                        String.valueOf(nextChar));
                i=i+1;
            }else{
                System.out.println(currentChar);
            }
        }
    }

    public static void main(String[] args) {
        StringProcess stringProcess = new StringProcess();
        //stringProcess.split();
        //stringProcess.printJoinCharacters("கணினி");
        stringProcess.StringP();
    }
}
