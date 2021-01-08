import java.util.ArrayList;

public class Parkiran 
{
    private static final int kapasitas = 20;
    private ArrayList <Kendaraan> Parkiran;
    private int uangparkir;
    
    public Parkiran()
    {
        this.Parkiran = new ArrayList<Kendaraan>(kapasitas);     
    }

    public static int getKapasitas()
    {
        return kapasitas;
    }

    public int tempatKosong()
    {
        return this.kapasitas - this.Parkiran.size();
    }

    public int tempatTerisi()
    {
        return this.Parkiran.size();
    }

    public void tambahKendaraan(Kendaraan kendaraan1)
    {
        if(this.tempatKosong()  < 21 && kendaraan1.getJenis() == 1)
        {
            uangparkir += 5000;
            this.Parkiran.add(kendaraan1);
            kendaraan1.DisplayKendaraan();
            System.out.println("Mobil ditambahan");
        }else if (this.tempatKosong() < 21 && kendaraan1.getJenis() == 2)
        {
            uangparkir += 2000;
            this.Parkiran.add(kendaraan1);
            kendaraan1.DisplayKendaraan();
            System.out.println("Motor ditambahan");
        }
        else if (this.tempatKosong() < 21 && kendaraan1.getJenis() == 3)
        {
            uangparkir += 10000;
            this.Parkiran.add(kendaraan1);
            kendaraan1.DisplayKendaraan();
            System.out.println("truk ditambahan");
        }
        else
        {
            System.out.println("Parkiran penuh !");
        }
    }

    public boolean keluarkanKendaraan(String plat)
    {
        for (int i = 0; i <= Parkiran.size(); i++) 
        {
            if (plat.equals(Parkiran.get(i).getPlat())) 
            {
                Parkiran.remove(i);
                System.out.println("kendaraan Dikeluarkan !");
                return Parkiran.equals(plat);
            } 
            else 
            {
                System.out.println("kendaraan Tidak ditemukan !");
                return false;
            }
        }
        return Parkiran.equals(plat);
    }
    
    public void tampilkandiparkiran() 
    {
        for(Kendaraan kendaraan : this.Parkiran){       
            if(kendaraan.getJenis() == 1){
                System.out.println("jenis Kendaraan : Mobil");
            }else if(kendaraan.getJenis() == 2){
                System.out.println("jenis Kendaraan : Motor");
            }else{
                System.out.println("jenis Kendaraan : truk");
            }
            kendaraan.DisplayKendaraan();
            System.out.println("total uanngparkiran : " +  uangparkir);
        }
        
        if(Parkiran.isEmpty() == true){
            System.out.println("Parkiran sedang kosong");
        }else{
            System.out.println("Jumlah terisi : " + tempatTerisi());
        }
    }
}
