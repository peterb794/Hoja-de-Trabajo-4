/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

/**
 *
 * @author andreabarrera
 * @author peterbennett
 */
public class Calculadora {
    private Archivo miArchivo;
    private FactoryStack<String> Stack;
    private Stack<String> miStack;
    private String datos, simbolo;
    private int dato1 = 0, dato2= 0, resultado= 0;
    
    /**
     *
     * @param texto
     * @param num
     */
    public Calculadora (String texto, String num){
    miArchivo = new Archivo (texto);
    Stack = new FactoryStack<String>();
    miStack = Stack.Factory(num);
    datos = miArchivo.leerArchivo();
	}
    /**
     *
     */
    public void guardar(){
      String[] elementos = datos.split(" ");
      int i = elementos.length - 1;
      while(i>=0){
         miStack.push(elementos[i]);
         i--;
      }
   }
    /**
     *
     * @return
     */
    public int operaciones()
	{
		while(miStack.size() > 2)
		{
			dato1 = Integer.parseInt((String) miStack.pop());
			dato2 = Integer.parseInt((String) miStack.pop());
			simbolo = (String) miStack.pop();
			if ("+".equals(simbolo))
			{
				resultado = dato1 + dato2;
				miStack.push(resultado+"");
			}
			if ("-".equals(simbolo))
			{
				resultado = dato1 - dato2;
				miStack.push(resultado+"");
			}
			if ("*".equals(simbolo))
			{
				resultado = dato1 * dato2;
				miStack.push(resultado+"");
			}
			if ("/".equals(simbolo))
			{
				resultado = dato1 / dato2;
				miStack.push(resultado+"");
			}
			
		}
		return resultado;
	}
}

//Tomado a base de lo visto en: 
		//http://stackoverflow.com/questions/24725374/java-postfix-calculator-push-pop-method-with-a-string-array
		//http://stackoverflow.com/questions/7450815/postfix-evaluation-using-stacks