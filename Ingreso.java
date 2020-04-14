
public class Ingreso extends Dinero{
	
	public Ingreso(double ingreso, String description) {
		super.dinero=ingreso;
		super.description=description;
	}
	public Ingreso() {
		super.dinero=0;
		super.description="";
	}
	
	public String toString() {
		return getDinero() + getDescription();
	}

}
