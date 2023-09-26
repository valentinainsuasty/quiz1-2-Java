import com.sun.corba.se.spi.orbutil.threadpool.NoSuchThreadPoolException;

/**
 * Clase Celular
 */
public class Celular {
    /***************************************************/
    /******************** Atributos ********************/
    /***************************************************/

    String marca;
    int modelo;
    String color;
    /***************************************************/
    /******************** Métodos ********************/
    /***************************************************/

    /**
     * Constructor de la clase Celular: Inicializa los atributos de mi clase
     *
     * @param marca
     * @param modelo
     * @param color  Complejidad temporal: O(1) Tiempo Constante
     */
    public Celular(String marca, int modelo, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    /**
     * Método que enciende el celular
     *
     * @return boolean: Indica si el celular prendió
     * <p>
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean encender() {
        System.out.println("Me encendí");
        return true;
    }
    /**
     * Método que apaga el celular
     * @return boolean: Indica si el celular se apago
     *
     * Complejidad temporal: O(1) Tiempo Constante
     */
    boolean apagado(){
        System.out.println("Me apagué");
        return true;
    }

}
