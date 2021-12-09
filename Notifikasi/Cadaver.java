package Notifikasi;
/**
 * Class ini merupakan class yang mengimplementasi interface Observer 
 * Class ini akan menginisialisasi nama cadaver dan notifikasi hasil tes
 * 
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public class Cadaver implements Observer
{
    //atribut nama cadaver
    private String name;
    
    /**
     * method constructor yang akan menginisialisasi nama cadaver
     * @param name
     */
    public Cadaver(String name)
    {
       this.name = name;
    }
    
    /**
     * method untuk menampilkan nama dari cadaver
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * method untuk menampilkan notifikasi hasil  tes
     * @param hasiltes
     */
    @Override
    public void receiveNotification(String hasiltes) {
       System.out.print("  Selamat pagi keluarga dari " +name+", Hasil tes covid untuk " +name+ " Sudah Keluar");
       System.out.print(hasiltes);
    }
}
