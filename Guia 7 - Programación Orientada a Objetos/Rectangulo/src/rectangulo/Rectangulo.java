package rectangulo;

import static java.lang.reflect.Array.set;
import java.util.Scanner;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo
 * privado base y un atributo privado altura. La clase incluirá un método para
 * crear el rectángulo con los datos del Rectángulo dados por el usuario.
 * También incluirá un método para calcular la superficie del rectángulo y un
 * método para calcular el perímetro del rectángulo. Por último, tendremos un
 * método que dibujará el rectángulo mediante asteriscos usando la base y la
 * altura. Se deberán además definir los métodos getters, setters y
 * constructores correspondientes. 
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 *
 * @author German
 */
public class Rectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Rectangulo1 rec = new Rectangulo1();
        
        rec.datos();
        System.out.println("La superficie es: " + rec.superficie());
        System.out.println("El perrimetro es: " + rec.perimetro());
        System.out.println("");
        rec.dibujo();
    }

}
