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
	 * La clase Cantidad representa una cantidad de valores flotantes.
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
     * @param parameterObject Un objeto Cantidad que contiene los parámetros necesarios.
     */
    
	public static void main(Cantidad parameterObject) {
        operativa_cuenta();
    }

	/**
     * El método operativa_cuenta realiza operaciones en una cuenta bancaria.
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
