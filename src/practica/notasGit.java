package practica;
import java.util.Scanner;


	/**
	 * notas se ha creado con la intencion de recolectar informacion de las notas, obtener el valor de cada una y dar una nota definitiva 
	 * dando unos parametros para comprobar si se están ingresando de manera correcta. 
	 * @author Mary_Alejandra_Mendoza_leal.
	 * @version 1.0.
	 * 
	 */
	
	
	/**
	 * En notas se han declarado las variables vacias que proporcionaran la informacion de las notas.
	 * las variables  uf1, uf2, uf3, son las encargadas de la recoleccion de las notas
	 * las variables acu1, acu2, acu3, son las que proporcionan el calculo hecho de las notas con las variables anteriores
	 * def, es el valor de la nota final.
	 */
public class notasGit {
	
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	
	
	
	Scanner entrada = new Scanner(System.in);
	
	/**
	 * Utiliza el metodo IngresaNotas para la recoleccion de datos
	 * @param uf1, nos proporciona el valor de la nota 1.
	 * @param uf2, nos proporciona el valor de la nota 2.
	 * @param uf3, nos proporciona el valor de la nota 3.
	 */
	
	
	public void IngresaNotas() {
		
		/**
		 * @see salida en la consola para el ingreso de las notas
		 */
		
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		uf1= entrada.nextDouble();

		System.out.print("ingrese nota 2: ");
		uf2= entrada.nextDouble();
		
		System.out.print("ingrese nota 3: ");
		uf3= entrada.nextDouble();
		
	}
	
	
	/**
	 * Metodo comprobacion, nos asegura el ingreso adecuado de la informacion que se solicita
	 * @throws uf1, se lanza la excepcion para evitar un fallo en la nota1.
	 * @throws uf2, se lanza la excepcion para evitar un fallo en la nota2.
	 * @throws uf3, se lanza la excepcion para evitar un fallo en la nota3.
	 */
	
	public void comprobacion(){
		
			/**
			 * Si la nota1 es la mayor de 10.
			 */
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
			/**
			 * Si la nota2 es la mayor de 10.
			 */
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
			
			/**
			 * Si la nota3 es la mayor de 10.
			 */
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
	}
	
	
	/**
	 * metodo para calcular las notas y el valor final.
	 * @param acu1, proporciona el valor total del calculo de la nota 1
	 * @param acu2, proporciona el valor total del calculo de la nota 2
	 * @param acu3, proporciona el valor total del calculo de la nota 3
	 * @return def, proporciona el total de la suma acu1, acu2, acu3
	 */
	
	
	public void Calculonotas() {
		
		/**
		 * Calculo de la cada nota por el porcentaje correspondiente de cada nota. 
		 */
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		/**
		 * valor final de la nota
		 */
		def = acu1 + acu2+ acu3;
		
		/**
		 * @see tenemos el calculo peor no se está ejecutando aun.
		 */
	}
	
	
	/**
	 *  Metodo usado para mostrar la informacion de la recoleccion de datos
	 *  @return uf1, mostrara el valor de la nota1.
	 * 	@return uf2, mostrara el valor de la nota2.
	 *  @return uf3, mostrara el valor de la nota3.
	 *  @return acu1, mostrara el valor de la nota1 calculada.
	 * 	@return acu2, mostrara el valor de la nota2 calculada.
	 *  @return acu3, mostrara el valor de la nota3 calculada.
	 * @return def, mostrara el valor final  de la nota.
	 */
	
	public void Mostrar() {
	
		/**
		 * Muestra por las consola las notas introducidas.
		 */
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		/**
		 * Muestra el valor de cada nota ya realizado el calculo.
		 */
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		/**
		 * Muestra el valor final de la nota.
		 */
		
		System.out.println(" nota definitiva es = "+ def);
		
	}
	
	
	/**
	 * metodo usado para comprobar si se ha aprobado o no segun las notas. 
	 * @param def, valor definitivo de la nota.
	 * @throws def, excepcion para comprobar el valor de la nota este correctamente ingresado.
	 */

	public void aprobado() {
		
		/**
		 * @see si el valor de la nota es menor a 5 y mayor o igual a 0, ha suspendido.
		 */
			
			if(def<5 && def>=0) {
				System.out.println("suspendido");
			}else {
				
				/**
				 * @see si la nota es mayor o igual a 5 y menor o igual a 1o, ha aprobado.
				 */
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					/**
					 * excepcion indicando el error de la nota final.
					 */
					System.out.println(" error en la notas");
				}
			}
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// creamos mecanismos para llamar a cualquier metodo fuera de la clase
		
				notasGit fc= new notasGit();
				
				/**
				 * @see llamado de metodo @link IngresaNotas para mostrar por consola.
				 */
				fc.IngresaNotas();
				
				/**
				 * @see llamado de metodo comprobacion para verificacion de la informacion ingresada en @link IngresaNotas.
				 */
				
				fc.comprobacion();
				
				/**
				 * @see uso del metodo @link Calculonotas, con @link IngresaNotas para la obtencion de datos.
				 */

				fc.Calculonotas();
				
				/**
				 * @see uso del metodo @link Mostrar, para mostrar por consola los datos de @link IngresaNotas.
				 */
				
				fc.Mostrar();
				
				/**
				 * @see uso del metodo @link Calculonotas, para comprobar @link aprobado.
				 */
				
				fc.aprobado();
				
	}

}
