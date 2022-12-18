# kdvhesapla
KDV hesaplama 

import java.util.Scanner;

public class kdvhesapla {
    public static void main(String[] args) {

        double tutar ,kdvOrani , kdvOraniBir = 0.18 ,kdvOraniİki = 0.08  , kdvtutari , kdvlitutar ;
        Scanner input = new Scanner(System.in) ;
        System.out.print("Ücret Tutarı: ");

        tutar = input.nextDouble() ;

        // Tutar 1000 liradan fazla ise %8 eğer 1000 liradan az ise %18 KDV uygulanacaktır.

        kdvOrani = tutar <= 1000 ? kdvOraniBir :  kdvOraniİki ;


        kdvtutari = tutar * kdvOrani ;
        kdvlitutar = kdvtutari + tutar ;


        System.out.println("KDV: " + kdvOraniBir);
        System.out.println("KDV: " + kdvOraniİki);
        System.out.println("KDV Tutarı: " + kdvtutari);
        System.out.println("KDVli Tutar: " + kdvlitutar);
    }
    }
