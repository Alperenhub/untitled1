public class Metods {
    public static void Metods() {
        System.out.println(toplam(4, 2));

        yuzdeOn(4, 2);
    }

    public static int toplam(int a, int b) {

        return a + b;
    }

    public static void yuzdeOn(int a, int b) {
        double hesap = toplam(a, b);
        double sonuc = hesap * 10 / 100;
        System.out.println(sonuc);


    }
}