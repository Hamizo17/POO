package POO;

public class Cuenta {
	private String nombre_titular;
	private double saldo;
	
	public Cuenta(String n_tit, double sald ){
		 
		
		this.nombre_titular=n_tit;
		this.saldo=sald;
	}
	public Cuenta(String n_tit ) {
		this.nombre_titular=n_tit;
		this.saldo=0;
		
	}
		
		 public double getSaldo(){
			 return this.saldo;
			
		}
		 public String getNombre_titular(){
			 return this.nombre_titular;
			 
		}
		 
		 public void deposito(double sald){
			 
			 this.saldo=saldo+sald;
			 
			 
		 }
		 public void retiro( double cantidad){
			 if (cantidad>saldo) {
			 
			System.out.println("error");}
			 
			else {
				this.saldo=this.saldo-cantidad;
			}
			 
			 }
			 
		 public void mostrar(){
			 
			 System.out.println("El nombre del titular de la cuenta es: "+ this.nombre_titular+ " y su saldo es de: "+ this.saldo);
			 
			 }
		 
		 

}
