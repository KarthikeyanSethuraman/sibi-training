package in.karefo.accessMod;

public class CallerAM {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.def);
//        System.out.println(accessModifier.priv);
        System.out.println(accessModifier.pub);
        System.out.println(accessModifier.prot);
    }
}
