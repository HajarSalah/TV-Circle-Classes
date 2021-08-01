package com.company;

public class Main {

    public static void main(String[] args) {
	Circle circle1 =new Circle ();
	circle1.radius=1.0;
	Circle circle2=new Circle ();
	Circle circle3= new Circle(125);

	System.out.println(circle1.radius+ " " + circle2.radius +" "+ circle3.radius);

    }
}
