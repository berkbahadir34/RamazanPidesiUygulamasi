import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] argc) throws InterruptedException {

        //Fırından 1(dahil) ile 10(dahil) arası pide çıkacak. Kuyruktakiler Pideyi Almaya Çalışacak...


        System.out.println("Ramazan Pidesi Uygulaması....");
        Random random=new Random();
        Queue<String> pide_kuyrugu=new LinkedList<String>();

        pide_kuyrugu.offer("Berk");
        pide_kuyrugu.offer("Aybike");
        pide_kuyrugu.offer("Hasan");
        pide_kuyrugu.offer("Ecem");
        pide_kuyrugu.offer("Nedim");
        pide_kuyrugu.offer("Furkan");
        pide_kuyrugu.offer("Burak");
        pide_kuyrugu.offer("Eren");
        pide_kuyrugu.offer("Tito");
        pide_kuyrugu.offer("Gizem");

        int pide_sayisi= 1+random.nextInt(10);
        System.out.println("Pideler Çıkıyor...");
        System.out.println("Çıkan Pide Sayısı : "+pide_sayisi);
        Thread.sleep(3000);
        while(pide_sayisi!=0){
            System.out.println(pide_kuyrugu.poll()+" pideyi aldı...");
            pide_sayisi--;
            Thread.sleep(1000);

        }
        System.out.println("Pide Kalmadı....");
        System.out.print("Pideyi Alamayanlar : ");
        for(String s:pide_kuyrugu){
            System.out.print(s+" ");
        }




    }
}
