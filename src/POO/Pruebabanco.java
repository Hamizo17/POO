package POO;

public class Pruebabanco {

	public static void main(String[] args) {
		
		Cuenta n1=new Cuenta ("Marco", 2100);
		n1.deposito(1000);
		n1.mostrar();
		n1.retiro(4000);
		n1.retiro(2000);
		n1.mostrar();
		
		
		 System.out.println(n1.getNombre_titular()+ " tiene " + n1.getSaldo() + "€");
		
		
		
		
		
		
		
			
	}

}
