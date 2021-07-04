import java.util.Scanner;


public class OrtalamaHesaplama {
    public static void main(String[] args) {

        int mat,fizik,tarih,muzik,kimya,turkce;

    Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Matematik Notunuzu Giriniz:");
        mat = inp.nextInt();




        System.out.print("Lütfen Fizik Notunuzu Giriniz:");
        fizik = inp.nextInt();


        System.out.print("Lütfen Kimya Notunuzu Giriniz:");
        kimya = inp.nextInt();


        System.out.print("Lütfen Turkce Notunuzu Giriniz:");
        turkce = inp.nextInt();


        System.out.print("Lütfen Tarih Notunuzu Giriniz:");
        tarih = inp.nextInt();


        System.out.print("Lütfen Muzik Notunuzu Giriniz:");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik );

        double sonuc = toplam / 6;
        System.out.println("Ortalamanız: " + sonuc);



        boolean durum;
        durum = sonuc >= 70;


        String gecme = durum ? "Gectiniz" : "Kaldiniz" ;
        System.out.println(gecme);


    }
}
