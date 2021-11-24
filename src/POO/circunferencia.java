package POO;

public class circunferencia {
	
	double radio;
	String color;
	double pi;
	double A;
	double p;
	double isBig;
	
	
	
	public circunferencia(double R, String c, double p){
	
		this.color=c;
		this.pi=p;
		this.radio=R;
		
		
	}
	public  double escribirarea() {
		
		System.out.println("El area es " + this.radio*this.radio*this.pi);
		
		return A;
		
		
	}
	public void printPerimeter() {
		
		p= 2*pi*radio;
		
		System.out.println("El perimetro es " + p);
		
	}
	
	public boolean isBig() {
		
		if(this.escribirarea()>20) {
			System.out.("La circunferencia ");
			return true;
		}
		else {
			return false;
			
		}
			
	}
	public boolean isEqualTo(circunferencia c2){
		if(this.radio==c2.radio && this.color==c2.color) {
			
			return true;
		}
		else {
			return false;
		}
		
		
		
		
		
	}
}
