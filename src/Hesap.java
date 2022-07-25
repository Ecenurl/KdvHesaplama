import java.util.Scanner;

public class Hesap {
    public static void main(String[] args) {

       //Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.

        double tutar, kdvOran, kdvliTutar,total ;
        Scanner input = new Scanner(System.in);
        System.out.println("Ucret tutarini giriniz : ");
        tutar = input.nextDouble();

        if(0<tutar&& tutar<1000){
            kdvOran=0.18;
        }
        else{
            kdvOran=0.08;
        }

        kdvliTutar = tutar * kdvOran;

        System.out.println(kdvliTutar);

        total = tutar + kdvliTutar;

        System.out.println(total);

    }
}
