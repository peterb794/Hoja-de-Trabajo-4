//****************************************************************
// Autores: Andrea Barrera Carne: 13655 Otto Wantland Carne: 13663 Diego Rodriguez Carne: 13111
// Seccion: 20
//Fecha 21/7/14
// Nombre de Archivo: Calculadora.java
// Breve Descripcion: Clase que representa una calculadora y hace las operaciones requeridas
//*****************************************************************

public class Calculadora
{
//Atributos
	private Archivo miArchivo;
	private StackVector miVector;
	private String datos, simbolo;
	private int dato1 = 0, dato2= 0, resultado= 0;
	
	//Constructor
	public Calculadora (String texto)
	{
		miArchivo = new Archivo (texto);
		miVector = new StackVector <String>();
		datos = miArchivo.leerArchivo();
	}
	
	//Separa los datos del texto ingresado en partes para almacenar en la pila
	public void guardar()
	{
            String[] elementos = datos.split("\\s+");
            int i = elementos.length - 1;
            while(i>=0){
                    miVector.push(elementos[i]);
                    i--;
            }
    }
	
	public int operaciones()
	{
		while(miVector.size() > 2)
		{
			dato1 = Integer.parseInt((String) miVector.pop());
			dato2 = Integer.parseInt((String) miVector.pop());
			simbolo = (String) miVector.pop();
			if (simbolo == "+")
			{
				resultado = dato1 + dato2;
				miVector.push(resultado);
			}
			if (simbolo == "-")
			{
				resultado = dato1 - dato2;
				miVector.push(resultado);
			}
			if (simbolo == "*")
			{
				resultado = dato1 * dato2;
				miVector.push(resultado);
			}
			if (simbolo == "/")
			{
				resultado = dato1 / dato2;
				miVector.push(resultado);
			}
			
		}
		return resultado;
	}
}
		
		//Tomado a base de lo visto en: 
		//http://stackoverflow.com/questions/24725374/java-postfix-calculator-push-pop-method-with-a-string-array
		//http://stackoverflow.com/questions/7450815/postfix-evaluation-using-stacks
		