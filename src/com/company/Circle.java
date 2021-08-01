package com.company;

public class Circle {

    double radius=10;

    Circle (){};

    Circle (double radius){
       this.radius=radius;
   }
   double getArea(){
        return Math.pow(this.radius,2.0)*(Math.PI);
   }
}
