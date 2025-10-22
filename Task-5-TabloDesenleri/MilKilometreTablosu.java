public class Main {
    public static void main(String[] args) {
        double[] milDegerleri = {1, 5, 10, 20, 50};
        double cevirimOrani = 1.609;

        System.out.println("Mil\tKilometre");
        

        for (double mil : milDegerleri) {
            double km = mil * cevirimOrani;
            System.out.println(mil + "\t" + km);
        }
    }
}
