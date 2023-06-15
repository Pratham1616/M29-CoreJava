package org.tnsif.annotations;
//parent class
class Car{
	public void speed(int speed) {
		System.out.println("Speed is: " + speed + " km/hr");
	}
}
//child class
/*child class is inheriting the 
 * properties of parent class*/
class Lamborghini extends Car{
	/*Below annotation ensures that child class method is inheriting 
	 * parent class*/
	//it should be speed(int speed)
	//if we do Speed(int speed) we get error
	@Override
	public void speed(int speed) {
		System.out.println("Speed is: " + speed + " km/hr");
	}
}
public class OverrideAnnotationExample {

	public static void main(String[] args) {
		Lamborghini l = new Lamborghini();
		l.speed(90);

	}

}