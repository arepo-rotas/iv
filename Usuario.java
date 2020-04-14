
public class Usuario {

	String nombre;
	int edad;
	String DNI;
	
	public Usuario() {
		nombre="i";
		edad=1;
		DNI="00000000A";
	}
	
	public Usuario(String nombre, int edad, String DNI){
		this.nombre=nombre;
		this.edad=edad;
		this.DNI=DNI;
		}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	public int getEdad() {
		return edad;
	}
	
	public void setDNI(String DNI) {
		char guion='-';
		int contador=0;
		if (DNI.length() == 9 || DNI.length()==10) {
			for (int i=0; i<8;i++) {
				if(Character.isDigit(DNI.charAt(i))) {contador ++;}
			}
		} 
		if (contador == 8 && ((Character.isLetter(DNI.charAt(8)) && DNI.length()==9) ||
				( DNI.length()==10 && Character.isLetter(DNI.charAt(9)) && DNI.charAt(8)==guion))) {
			this.DNI=DNI;
		}
		else {
			this.DNI=null;
		}
		
	}
	
	public String getDNI() {
		return DNI;
	}
	
	public String toString() {
		if (DNI!=null) {
			return getNombre()+" con edad de "+getEdad()+" y con DNI "+getDNI();
		}
		else {
			return "DNI no valido";
		}
	}
	
}
