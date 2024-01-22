package oefening2;

public class Test {
    public static void main(String[] args) {
        Member m1 = new Member("Anna", "ALF");
        Member m2 = new Member("Ibrahim", "ALF");
        Member m3 = new Member("Sara", "ALF");


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        Lector l1 = new Lector("Marc", "Thomas More");
        Lector l2 = new Lector("Rodrigue", "Thomas More");
        System.out.println(l1);
        System.out.println(l2);
    }
}
