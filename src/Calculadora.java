/* Andrea Barrera 13655, Peter Benett 13243 */
/* Seccion 20                               */
/* Hoja de trabajo 4                        */

public class Calculadora {
    private Archivo miArchivo;
    private FactoryStack Stack;
    private Stack miStack;
    private String datos, simbolo;
    private int dato1 = 0, dato2= 0, resultado= 0;
    
   public Calculadora (String texto, String num){
    miArchivo = new Archivo (texto);
    Stack = new FactoryStack();
    miStack = Stack.Factory(num);
    datos = miArchivo.leerArchivo();
	}
   public void guardar(){
      String[] elementos = datos.split(" ");
      int i = elementos.length - 1;
      while(i>=0){
         miStack.push(elementos[i]);
         i--;
      }
   }
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
