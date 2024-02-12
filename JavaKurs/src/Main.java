import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Product product = new Product();
        product.name="Laptop";
        product.id=2;
        product.description="Bilgisayar";

        ProductManager productManager= new ProductManager();
        productManager.Add(product);

        System.out.println();

        String[] yerler = {"Ankara", "İstanbul", "Eskişehir", "Bursa"};

        //foreach
        for(String sehir: yerler){
            System.out.println(sehir);
        }

        System.out.println();

        //for
        for (int i=0; i< yerler.length; i++){
            System.out.println(yerler[i]);
        }

        System.out.println();

        //while
        int i=0;
        while(i< yerler.length){
            System.out.println(yerler[i]);
            i++;
        }
        System.out.println();

        int sayi1=10;
        int sayi2=20;
        sayi1=sayi2;
        sayi2=100;

        System.out.println("Sayi1: "+ sayi1); //Çıktı: 20 değer tiplerde atamalar değer yapılır ve bağlantı kopartılır. ondan dolayı 100 değilde 20 oldu

        System.out.println();

        int[] sayilar1={1,2,3,4};
        int[] sayilar2={10,20,30,40};
        sayilar1=sayilar2;
        sayilar2[0]=100;
        System.out.println(sayilar1[0]); //Çıktı: 100 arrayler referans tiplerdir onların tutulma şekli değişir.

        System.out.println();



        double[] sayilar= {1.1,2.5,3.4,5.6};
        double total=0;
        double max= sayilar[0];

        for (Double sayi: sayilar){
            if(max<sayi)
                max=sayi;
            total+=sayi;
            System.out.println("Sayılar: " + sayi);
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("Toplam: " + total);





    }
}