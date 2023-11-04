package Capitulo13;

public class Car {

	 private String make; 
	 private int year; 
	 private String color; 
	 
	 public Car(String make, int year, String color)
	 {
	 this.make = make;
	 this.year = year;
	 this.color = color;
	 }
	 public boolean equals(Car otherCar)
	 {
	 return otherCar != null &&
	 make.equals(otherCar.make) &&
	 year == otherCar.year &&
	 color.equals(otherCar.color);
	 } 
}