package Penanganan;
/**
 * Abstract class PengelolaanDecorator untuk menambahkan cara pengelolaan cadaver
 *
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public abstract class PengelolaanDecorator implements Pengelolaan{
    
    //objek Pengelolaan
    private Pengelolaan pengelolaan;
    
    /**
     * method constructor untuk membuat objek pengelolaan
     * @param Pengelolaan
     */
    public PengelolaanDecorator(Pengelolaan pengelolaan){
        this.pengelolaan = pengelolaan;
    }
    
    /**
     * method untuk pengelolaan cadaver
     */
    @Override 
    public String decorate(){
        return pengelolaan.decorate();
    }
}
