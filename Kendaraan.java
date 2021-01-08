public class Kendaraan
{
    private String merek;
    private String warna;
    private String plat;
    private int jenis;
    protected int uangawal = 100000;
    
    public Kendaraan()
    {
        
    }
    
    public Kendaraan(String merek, String warna, String plat, int jenis)
    {
        this.merek = merek;
        this.warna = warna;
        this.plat = plat;
        this.jenis = jenis;
    }

    public String getMerek()
    {
        return merek;
    }
    
    public int getJenis()
    {
        return jenis;
    }

    public String getWarna()
    {
        return warna;
    }

    public String getPlat()
    {
        return plat;
    }
    
    public void DisplayKendaraan()
    {
        System.out.println("jenis Kendaraan : " + jenis);
        System.out.println("warna Kendaraan : " + this.warna);
        System.out.println("merek Kendaraan : " + this.merek);
        System.out.println("nomot plat : "+ this.plat);
    }
}
