import Notifikasi.*;
import Penanganan.*;

/**
 * Class ini berguna untuk run atau menjalankan program yang telah dibuat
 *
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public class Main{
    
    public static void main(String[] args) {
        
      //Membuat objek baru untuk Observable
      RumahSakit positif = new RumahSakit();
      RumahSakit negatif = new RumahSakit();
      
      //Membuat objek baru untuk observer
      Cadaver pasien1 = new Cadaver("Hauranum");
      Cadaver pasien2 = new Cadaver("Hartono");
      
      //menambahkan data observer (pasien)
      positif.addPasien(pasien1); 
      negatif.addPasien(pasien2);
      
      //memberikan notifikasi hasil tes keluar
      positif.notifyPasien("\n  Hasil tes dinyatakan : Positif Covid \n");
      //pengelolaan cadaver covid
      Pengelolaan covid = new PetiDecorate(new PlastikDecorate(new Jenazah()));
      System.out.print(covid.decorate());
      
      //memberikan notifikasi hasil tes keluar
      negatif.notifyPasien("\n  Hasil tes dinyatakan : Negatif Covid \n");
      //pengelolaan cadaver non covid
      Pengelolaan noncovid = new PetiDecorate(new Jenazah());
      System.out.print(noncovid.decorate());
      
    }
}
