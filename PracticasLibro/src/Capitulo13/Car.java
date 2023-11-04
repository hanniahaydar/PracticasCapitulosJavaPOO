package Capitulo13;

public class Car {
	************************************************
	* Car.java
	* Dean & Dean
	*
	* Esto define y compara automóviles.
	************************************************/
	public class Car
	{
	 private String make; // modelo del automóvil
	 private int year; // año de lista del automóvil
	 private String color; // color del automóvil
	 //*********************************************
	 public Car(String make, int year, String color)
	 {
	 this.make = make;
	 this.year = year;
	 this.color = color;
	 } // end Car constructor
	 //*********************************************
	 public boolean equals(Car otherCar)
	 {
	 return otherCar != null &&
	 make.equals(otherCar.make) &&
	 year == otherCar.year &&
	 color.equals(otherCar.color);
	 } // end equals
	} // end class Car
}
