package Penanganan;
/**
 * Class ini untuk cadaver yang belum dilakukan pengelolaan 
 *
 * @author Choirunisa Romadoni
 * @version 1.0
 */
public class Jenazah implements Pengelolaan
{
    /**
     * method untuk menampilkan informasi tentang cadaver
     */
    @Override 
    public String decorate(){
        return "  Penanganan : Jenazah dikafani";
    }
}
