/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */
public class Driver {
    
    public static void main (String[] args)
	{
		//se ingresa ("datos","1")->ArrayList, ("datos","2")->Vector, (datos,"3")->List
                Calculadora miCalculadora = new Calculadora("datos","1");
		miCalculadora.guardar();
		int resultado = miCalculadora.operaciones();
		System.out.println(resultado + "");
	}
    
}
