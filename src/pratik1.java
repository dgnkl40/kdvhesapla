import java.util.Scanner;

public class pratik1 {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notu: ");
        mat = inp.nextInt();
        System.out.print("Fizik Notu: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notu: ");
        kimya = inp.nextInt();
        System.out.print("Türkçe Notu: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notu: ");
        tarih = inp.nextInt();
        System.out.print("Müzik Notu: ");
        muzik = inp.nextInt();
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6;
        System.out.print("Ortalama: "+ sonuc);
        String durum = (sonuc >= 50) ? " Sınıfı Geçtin " :  " Sınıfta Kaldın " ;
        System.out.println(durum);


    }
}
