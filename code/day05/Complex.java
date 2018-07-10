package day05;

public class Complex {
	private double real;
	private double imag;

	public Complex() {
		real = 0;
		imag = 0;
	}
	public Complex(double real, double imag) {
		this.real=real;
		this.imag=imag;
	}

	public void setComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	@Override
	public String toString() {
		return "결과값: " + real + "+(" + imag + "i)";
	}
	public Complex plus(Complex a) {
		Complex result=new Complex();
		result.real=a.real+this.real;
		result.imag=a.imag+this.imag;
		return result;
	}
	public Complex minus(Complex a) {
		Complex result=new Complex();
		result.real=this.real-a.real;
		result.imag=this.imag-a.imag;
		return result;
	}
	public Complex multiple(Complex a) {
		Complex result=new Complex();
		result.real=a.real*this.real;
		result.imag=a.imag*this.imag;
		return result;
	}
	public Complex division(Complex a) {
		Complex result=new Complex();
		result.real=this.real/a.real;
		result.imag=this.imag/a.imag;
		return result;
	}
}
