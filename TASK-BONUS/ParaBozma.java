public static void main(String[] args) {
        int para = 278; // örnek tutar
        int yuzluk = para / 100;
        para = para - (yuzluk * 100);

        int ellilik = para / 50;
        para = para - (ellilik * 50);

        int yirmilik = para / 20;
        para = para - (yirmilik * 20);

        int beslik = para / 5;
        para = para - (beslik * 5);

        int ikilik = para / 2;
        para = para - (ikilik * 2);

        int birlik = para; // kalan para 1 TL’liktir

        System.out.println("100 TL: " + yuzluk);
        System.out.println("50 TL: " + ellilik);
        System.out.println("20 TL: " + yirmilik);
        System.out.println("5 TL: " + beslik);
        System.out.println("2 TL: " + ikilik);
        System.out.println("1 TL: " + birlik);
    }
}
