package Notifikasi;
/**
 * interface Observable memuat method untuk hal-hal yang dapat dilakukan oleh observable/subject
 *
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public interface Observable{
    
    /**
     * method untuk menambah data observer
     * @param Cadaver objek cadaver yang akan ditambahkan
     */
    public void addPasien(Cadaver cadaver);
    
    /**
     * method untuk menghapus data observer
     * @param Cadaver objek cadaver yang akan dihapus
     */
    public void removePasien(Cadaver cadaver);
   
    /**
     * method untuk mengirim notifikasi
     * @param hasiltes 
     */
    public void notifyPasien(String hasiltes);
}
