package Notifikasi;
import java.util.ArrayList;

/**
 * Class ini merupakan class yang mengimplementasi interface Observable
 * subject dapat menambah, menghapus serta mengirim notifikasi kepada observer
 * 
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public class RumahSakit implements Observable 
{
  //menyimpan observer kedalam arraylist
  ArrayList <Cadaver> pasien = new ArrayList<>();

  /**
   * method untuk menambahkan observer(pasien) ke arraylist
   * @param Cadaver objek cadaver yang akan ditambah
   */
  @Override
  public void addPasien(Cadaver cadaver) {
    pasien.add(cadaver);
  }

  /**
   * method untuk menghapus observer(pasien) dari arraylist 
   * @param Cadaver objek cadaver yang akan dihapus
   */
  @Override
  public void removePasien(Cadaver cadaver) {
    pasien.remove(cadaver);
  }

  /**
   * method untuk mengirim notifikasi kepada observer
   * @param hasiltes
   */
  @Override
  public void notifyPasien(String hasiltes) {
    System.out.println("==Notifikasi Baru dari Rumah Sakit==");
    for(Cadaver cadaver : pasien) {
      cadaver.receiveNotification(hasiltes);
    }
  }
}
