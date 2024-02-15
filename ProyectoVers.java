package controlversion;

public class ProyectoVers {
	
	private double answer;
	private double a;
	private double b;
	
	public ProyectoVers (double a, double b, double answer) {
		this.a=a;
		this.b=b;
		this.answer=answer;
	}
	public double suma() {
		double suma = a+b;
		answer = suma;
		return answer;
	}
	public double resta() {
		double resta = a-b;
		answer = resta;
		return answer;
	}
	public double producto() {
		double produc = a*b;
		answer = produc;
		return answer;
	}
	public int divEntera() {
		int divi = (int)(a/b);
		answer =divi;
		return (int)answer;
	}
	public int resto() {
		int aInt = (int)a;
		int bInt= (int)b;
		int modulo = bInt%aInt;
		answer = modulo;
		return (int)answer;
	}
	public double divReal() {
		double cociente = a/b;
		answer = cociente;
		return answer;
	}
	public double potReal(int a, int b) {
		double potencia = Math.pow(a, b);
		answer = potencia;
		return answer;
	}
	public int potEntera(int a, int b) {
		int potenciaInt = (int) Math.pow(a, b);
		answer = potenciaInt;
		return (int)answer;
	}
	public void clear () {
		answer=0;
	}
	public double getAnswer() {
		return answer;
	}
	public void setA(double a) {
		this.a=a;
	}
    public void setB(double b) {
		this.b=b;
	}
	@Override
	public String toString() {
		return "ProyectoVers answer = " + answer + ", a = " + a + ", b = " + b + ", suma() = " + suma() + ", resta() = "
				+ resta() + ", producto() = " + producto() + ", divEntera() = " + divEntera() + ", resto() = " + resto()
				+ ", divReal() = " + divReal() + ", getAnswer() = " + getAnswer() + "";
	}
    
    
	
}