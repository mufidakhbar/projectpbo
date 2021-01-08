public class Motor extends Kendaraan
{
    private int hargaparkirmotor = 2000;

    public Motor()
    {
        
    }

    public Motor(String merek, String warna, String plat, int jenis)
    {
        super(merek, warna, plat, jenis);
    }

    public void bayarparkirmotor(int hargaparkirmotor)
    {
        this.hargaparkirmotor = super.uangawal - hargaparkirmotor;
    }
}
