package in.karefo.accessMod;

public class AccessModifier {
    private String priv = "test Private";
    public String pub ="test Pub";
    String def="test default";
    protected String prot = "test Protected";

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        System.out.println(accessModifier.def);
        System.out.println(accessModifier.priv);
        System.out.println(accessModifier.pub);
        System.out.println(accessModifier.prot);
    }
}
