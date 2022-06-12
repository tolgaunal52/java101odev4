import java.util.Scanner;

public class odev4 {
    public static void main(String[] args) {
        double yol, oran = 2.20, miktar, fiyat, acilis = 10 ;

        Scanner input = new Scanner(System.in);

        System.out.println("Taksimetre Hesaplama Aracına Hosgeldiniz \n");
        System.out.print("Lutfen Gidenlen Yol Miktarini KM Olarak Giriniz : ");
        yol = input.nextDouble();

        miktar = acilis + (yol * oran) ;

        fiyat = miktar <= 20  ?  20 : miktar;

        System.out.println("\nToplam Borcunuz : " + fiyat + "TL'dir");



    }
}
