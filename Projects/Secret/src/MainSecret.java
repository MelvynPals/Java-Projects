public class MainSecret {
    public static void main (String[] args) {
        Secret s1 = new Secret();
        Secret s2 = new Secret("Milvy", 31, 60, 1.55);

        s1.print();
        s2.print();
    }
}