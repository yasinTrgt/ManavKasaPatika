import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args) {

        double armut    = 2.14;
        double elma     = 3.67;
        double domates  = 1.11;
        double muz      = 0.95;
        double patlıcan = 5;
        double kgarmut , kgelma, kgdomates, kgmuz, kgpatlıcan;

        double tutar ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :" );
        kgarmut = sc.nextDouble();

        System.out.print("Elma Kaç Kilo ? :");
        kgelma = sc.nextDouble();

        System.out.print("Domates Kaç Kilo ? :");
        kgdomates = sc.nextDouble();

        System.out.print("Muz Kaç Kilo ? :");
        kgmuz = sc.nextDouble();

        System.out.print("Patlıcan Kaç Kilo ? :");
        kgpatlıcan = sc.nextDouble();


        tutar = (kgarmut*armut)+(kgelma*elma)+(kgdomates*domates)+(kgmuz*muz)+(kgpatlıcan*patlıcan);


        System.out.print("Toplam Tutar :" + tutar);







    }
}
