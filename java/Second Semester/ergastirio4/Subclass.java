package klironomikotita;


public class Subclass extends Superclass {
    Subclass(String g1, int a1)
    {
        super(g1,a1);
    }
    public static void main(String args[])
    {
        Subclass s = new Subclass("Andreas", 40);
        s.getGenderAndAge();
    }
}  
