public class Truk extends Kendaraan
{
    private int hargaparkirTruk = 10000;

    public Truk()
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
}
