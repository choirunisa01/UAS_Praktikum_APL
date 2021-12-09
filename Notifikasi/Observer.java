package Notifikasi;
/**
 * interface Observer memuat method untuk hal-hal yang dapat dilakukan oleh observer
 *
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public interface Observer{
    
    /**
     * method untuk menerima notifikasi
     * @param hasiltes
     */
    public void receiveNotification(String hasiltes);
}
