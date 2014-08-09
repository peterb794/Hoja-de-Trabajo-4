/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

public class Calculadora {
    private Archivo miArchivo;
    private AbstractStack<String> miStack;
    private String datos, simbolo;
    private int dato1 = 0, dato2= 0, resultado= 0;
    
   public Calculadora (String texto, int num){
    miArchivo = new Archivo (texto);
    miStack.AbstractStack(num);
    datos = miArchivo.leerArchivo();
	}
   public void guardar(){
      String[] elementos = datos.split("\\s+");
      int i = elementos.length - 1;
      while(i>=0){
         miStack.push(elementos[i]);
         i--;
      }
   }
   
}
