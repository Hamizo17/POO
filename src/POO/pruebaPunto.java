package POO;

public class pruebaPunto {

	public static void main(String[] args) {
		
		
		    System.out.println("Teclee el valor para X:");
		    int x = Console.readInt();
		    System.out.println("Teclee el valor para y:");
		    int y = Console.readInt();
		    Punto a1 = new Punto(x,y);//valores predefinidos Punto a1
		    Punto a2 = new Punto(5,-7);
		    Segmento s=new Segmento(a1,a2);
		    
		    a1.imprimir_cuadrante();//Imprime cuadrante predefinido punto A
		    a2.imprimir_cuadrante();//Imprime cuadrante definido por el usuario
		    System.out.println(s.calcular_distancia());
		    
		    
	


	}

}
