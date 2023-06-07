package cuentas;

/**
 * 
 * @author Ruben
 * @version 1
 * 
 * 
 * La clase Main es la clase principal que contiene el método main para ejecutar el programa.
 */

public class Main {

	/**
	 * 
	 * La clase Cantidad representa una serie de valores de tipo float.
	 *
	 */
	
    public static class Cantidad {
		public float[] args;

		/**
         * Constructor de la clase Cantidad.
         * 
         * @param args Un arreglo de valores flotantes.
         */
		
		public Cantidad(float[] args) {
			this.args = args;
		}
	}

    /**
     * El método main es el punto de entrada del programa.
     * 
     * @param El metodo recibe parameterObject, un objeto Cantidad que contiene los parámetros necesarios.
     */
    
	public static void main(Cantidad parameterObject) {
        operativa_cuenta();
    }

	/**
     * El método operativa_cuenta realiza operaciones en una cuenta bancaria.
     * Primero se crea un objeto de tipo Cuenta. Se establece a la variable saldoActual el saldo de
     * la cuenta creada.
     * Se hacen dos try catch para manejar situaciones de ingreso de saldo o retiro de saldo controlando
     * Que no se pueda retirar en caso de que la cantidad a retirar sea mayor que el saldo.
     */
	
    private static void operativa_cuenta() {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
