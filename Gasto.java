
public class Gasto extends Dinero{

	public Gasto(double gasto, String description) {
		super.dinero=gasto;
		super.description=description;
	}
	public Gasto() {
		super.dinero=0;
		super.description="";
	}
	
	
	public String toString() {
		return getDinero()+getDescription();
	}
	
}
