import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Parkiran park1 = new Parkiran();
        int ulang = 2;
        while(ulang == 2){
        System.out.println("====== PARKING AREA ======\nMENU :");
        System.out.println("1. Masukkan Kendaraan");
        System.out.println("2. Keluarkan Kendaraan");
        System.out.println("3. Lihat Kendaraan");
        System.out.print("Pilihan : ");
            
            switch(pilihan)
            {
                case 1:
                    System.out.print("Pilih jenis kendaraan(1.mobil 2.motor 3.truk)");
                    int jenis = input.nextInt();
                    System.out.print("Masukan merek : ");
                    String merek = input.next();
                    System.out.print("Masukan warna : ");
                    String warna = input.next();
                    System.out.print("Masukan plat : ");
                    String plat = input.next();
                    System.out.print("================================\n");
                    Kendaraan kendaraan1 = new  Kendaraan( merek,  warna,  plat, jenis);             
                    park1.tambahKendaraan(kendaraan1);           
                    System.out.print("=================================");
                break;               
                case 2:
                    System.out.print("Masukan plat : ");
                    plat = input.next();
                    System.out.println("==========Exit kendaraan=========");
                    park1. keluarkanKendaraan(plat);
                    System.out.print("=================================");
                break;            
                case 3:
                  System.out.println("========isi parkiran===========");
                  park1.tampilkandiparkiran();
                  System.out.print("=================================");
                    break;
                default:
                System.out.println("Menu Tidak Tersedia\n");
                System.out.print("=================================");
                break;
            }
            System.out.println("\nApakah anda ingin keluar? (1. Ya |2. Tidak)");
            System.out.println("Pilihan : ");
            ulang = input.nextInt();
        }
        
    }   
}
