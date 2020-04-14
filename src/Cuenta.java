import java.util.ArrayList;

public class Cuenta {

	double saldo=0;
	Usuario usuario = new Usuario();
	ArrayList<String> gastos = new ArrayList<String>();
	ArrayList<String> ingresos = new ArrayList<String>();
	Gasto gasto1 = new Gasto();
	Ingreso ingreso1 = new Ingreso();
	
	public Cuenta(Usuario usuario) {
		this.usuario=usuario;
		this.saldo=0;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario=usuario;
	}
	
	public double addIngresos(String description, double cantidad){
		this.saldo=this.saldo+cantidad;
		ingresos.add(description + " " +cantidad);
		return this.saldo;
		
		
	}
	public double addGastos(String description, double cantidad) {
			try {
			if (this.saldo<cantidad) { throw new GastoException();
			
			}
			else {
			this.saldo=this.saldo-cantidad;
			gastos.add(description+" "+cantidad);
			
			}
		}
		catch(GastoException er) {
			System.out.println(er.error());
		}
		
		return this.saldo;	
	}
	public ArrayList<String> getIngresos(){
		return ingresos;
	}
	public ArrayList<String> getGastos(){
		return gastos;
	}
	
	public String toString() {
		return usuario.toString() + " tiene un saldo de " + saldo;
	}
	
}
