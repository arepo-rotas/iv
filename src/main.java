
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		int i=0;
		Scanner teclado = new Scanner(System.in);
		Usuario usuario1 = new Usuario();
		System.out.println("Introduce el nombre del usuario");
		usuario1.setNombre(teclado.nextLine());
		System.out.println("Introduce la edad del usuario");
		usuario1.setEdad(teclado.nextInt());
		teclado.nextLine();
		do {
		System.out.println("Introduce el DNI");
		usuario1.setDNI(teclado.nextLine());
		System.out.println(usuario1.toString());
		}while(usuario1.getDNI()==null);
		
		Cuenta cuenta = new Cuenta(usuario1);
		System.out.println("Usuario creado correctamente");
		
		do {
		System.out.println("Realiza una nueva accion\n1 - Introduce un nuevo gasto\n"
				+ "2 - Introduce un nuevo ingreso\n3 - Mostrar gastos\n4 - Mostrar ingresos\n"
				+ "5 - Mostrar saldo\n0 - Salir");
		
		i = teclado.nextInt();
		
		switch(i) {
		case 1:
			System.out.println("Introduce la descripcion");
			teclado.nextLine();
			String descriptionG=teclado.nextLine();
			System.out.println("Introduce la cantidad");
			double cantidadG=teclado.nextDouble();
			cuenta.addGastos(descriptionG, cantidadG);
			System.out.println("Saldo actual: "+ cuenta.getSaldo());
			break;
		case 2:
			System.out.println("Introduce la descripcion");
			teclado.nextLine();
			String descriptionI=teclado.nextLine();
			System.out.println("Introduce la cantidad");
			double cantidadI=teclado.nextDouble();
			cuenta.addIngresos(descriptionI, cantidadI);
			System.out.println("Saldo actual: "+ cuenta.getSaldo());
			break;
		case 3:
			System.out.println("Lista de gastos de "+usuario1.toString()+":"+ cuenta.getGastos());
			break;
		case 4:
			System.out.println("Lista de ingresos "+usuario1.toString()+":"+ cuenta.getIngresos());
			break;
		case 5:
			System.out.println("Saldo actual de "+usuario1.toString() + " es de: " +cuenta.getSaldo());
			break;
			
		default:
			System.out.println("Opcion no disponible");	
			break;
		
		}
		
		}while(i!=0);
		
		System.out.println("Fin del programa.\nGracias por utilizar la aplicacion.");
		teclado.close();
		
		
		

	}

}
