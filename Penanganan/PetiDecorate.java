package Penanganan;
/**
 * Class PetiDecorate merupakan salah satu jenis pengelolaan cadaver
 *
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public class PetiDecorate extends PengelolaanDecorator
{
    /**
     * method constructor untuk membuat objek 
     * @param Pengelolaan
     */
    public PetiDecorate(Pengelolaan pengelolaan)
    {
        super(pengelolaan);
    }
    
    /**
     * method untuk melakukan pengelolaan secara berurutan
     */
    public String decorate() {
        return super.decorate() +this.decoratePeti();
    }
    
    /**
     * method untuk menampilan hasil pengelolaan
     */
    public String decoratePeti(){
        return " serta dimasukkan ke peti jenazah\n\n";
    }
}
