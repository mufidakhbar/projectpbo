public class Mobil extends Kendaraan
{
    private int hargaparkirmobil = 5000;

    public Mobil()
    {
        
    }

    public Mobil(String merek, String warna, String plat, int jenis)
    {
        super(merek, warna, plat, jenis);
    }

    public int bayarparkirmobil(int hargaparkirmobil)
    {
        this.hargaparkirmobil = super.uangawal - hargaparkirmobil;
        return this.hargaparkirmobil;
    }

    public void printdetailsmobil(){
        super.DisplayKendaraan();
    }
}
