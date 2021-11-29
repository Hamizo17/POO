package POO;

public class Punto {

	
		
		private int x;//representa la absisa
	    private int y;//representa la ordenada

	    public Punto(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public void setX(int x) {
	        this.x = x;
	    }

	    public void setY(int y) {
	        this.y = y;
	    }
	//Metodo que muestra en que cuadrante se encuentra el punto
	    public int imprimir_cuadrante() {
	        if (this.x > 0 && this.y > 0) {
	            System.out.println("El punto esta en el primer cuadrante");
	            return 1;
	        } else if (this.x < 0 && this.y > 0) {
	            System.out.println("El punto esta en el segundo cuadrante");
	            return 2;
	        } else if (this.x < 0 && this.y < 0) {
	            System.out.println("El punto esta en el tercer cuadrante");
	            return 3;
	        } else {
	            System.out.println("El punto esta en el cuarto cuadrante");
	            return 4; 
	        }
	    }
}
	        
	    
	
	

