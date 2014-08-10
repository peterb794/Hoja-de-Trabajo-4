
import java.util.Scanner;

/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
/**
 *
 * @author andreabarrera
 */
public class Driver {
    
    /**
     *
     * @param args
     */
    public static void main (String[] args)
	{
		//se ingresa ("datos","1")->ArrayList, ("datos","2")->Vector, (datos,"3")->List
            System.out.println("elija el tipo de stack que desea usar:\n1.ArrayList\n2.Vector\n3.Lista\n");
            Scanner s = new Scanner(System.in);
            String num = s.next();
            Calculadora miCalculadora = new Calculadora("datos",num);
		miCalculadora.guardar();
		int resultado = miCalculadora.operaciones();
		System.out.println("el resultado es:" + resultado + "");
	}
    
}
