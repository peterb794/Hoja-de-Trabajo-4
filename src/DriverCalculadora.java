//****************************************************************
// Autores: Andrea Barrera Carne: 13655 Otto Wantland Carne: 13663 Diego Rodriguez Carne: 13111
// Seccion: 20
//Fecha 21/7/14
// Nombre de Archivo: DriverCalculadora.java
// Breve Descripcion: Driver para la clase calculadora
//*****************************************************************

public class DriverCalculadora
{
	public static void main (String[] args)
	{
		Calculadora miCalculadora = new Calculadora("datos");
		miCalculadora.guardar();
		int resultado = miCalculadora.operaciones();
		System.out.println(resultado + "");
	}
}