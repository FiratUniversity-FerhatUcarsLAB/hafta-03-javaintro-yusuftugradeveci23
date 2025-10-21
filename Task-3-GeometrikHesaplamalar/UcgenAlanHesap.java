public static void main(String[] args) {
        // Üçgenin kenar uzunlukları
        double a = 3;
        double b = 4;
        double c = 5;

        // Yarı çevreyi hesaplama
        double s = (a + b + c) / 2;

        // Heron formülü ile alanı hesaplama
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Adım adım ekrana yazdırma
        System.out.println("Üçgenin Kenarları: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Yarı çevre (s) = (a + b + c)/2 = " + s);
        System.out.println("Alan = √[s * (s - a) * (s - b) * (s - c)]");
        System.out.println("Alan = √[" + s + " * (" + s + " - " + a + ") * (" + s + " - " + b + ") * (" + s + " - " + c + ")]");
        System.out.println("Üçgenin Alanı = " + alan);
    }
}
