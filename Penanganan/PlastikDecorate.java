package Penanganan;
/**
 * class PlastikDecorate merupakan pengelolaan untuk cadaver covid
 *
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public class PlastikDecorate extends PengelolaanDecorator
{
    /**
     * method constructor untuk membuat objek 
     * @param Pengelolaan
     */
    public PlastikDecorate(Pengelolaan pengelolaan)
    {
        super(pengelolaan);
    }
    
    /**
     * method untuk melakukan pengelolaan secara berurutan
     */
    public String decorate() {
        return super.decorate() +this.decoratePlastik();
    }
    
    /**
     * method untuk menampilan hasil pengelolaan
     */
    public String decoratePlastik(){
        return " dan dibungkus plastik kedap udara sesuai protokol";
    }
}
