package cir;

public class Circle {
	
	private double radius;
	private double result;
	
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return this.radius;
	}
	
	public Circle area(double radius)
	{
		setResult(Math.PI*radius*radius);
		return this;
	}
	public Circle perimiter(double radius)
	{
		setResult(Math.PI*2*radius);
		return this;
	}

}
