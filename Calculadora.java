package calculadora;

public class Calculadora {

	private int a;
	private int b;
		
	public void setA(Integer  a){
		this.a=a;
	}
		
	public void setB(Integer  b){
		this.b=b;
	}
		
	public int sumar(){
		return a+b;
	}
	
	public int restar(){
		return a-b;
	}
	
	public int multiplicar(){
		return a*b;
	}
	
	public int divir(){
		return a/b;
	}

}
