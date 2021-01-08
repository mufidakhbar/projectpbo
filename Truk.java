public class Truk extends Kendaraan
{
    private int hargaparkirTruk = 10000;

   publik truk()
   {
   
   }

    public Truk(String merek, String warna, String plat, int jenis)
    {
        super(merek, warna, plat, jenis);
    }

    public void bayarParkirTruk(int hargaparkirTruk)
    {
        this.hargaparkirTruk = super.uangawal - hargaparkirTruk;
    }
    
    public void printdetailtruk()
    {
        super.DisplayKendaraan();
    }
}
