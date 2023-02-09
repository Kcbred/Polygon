//instance variables
//default constructor
//overload cont
//accessors
//mutators
//

import java.awt.*;

public class Polygon {
   private int NumSides;
   private double SideLength;
   private String ShapeType;

   private double perimeter;

   private boolean valid;


   public Polygon(){
       NumSides = 3;
       SideLength = 1;
       ShapeType = "Triangle";
   }

   public Polygon(int NS, double SL , String type){
       NumSides = NS;
       SideLength = SL;
       ShapeType = type;
       if(NS <= 2){
           NS = 3;
           valid = false;
       }
       if(SL <= 0){
           SL = 1;
           valid = false;
       }
       if(NumSides == 3){
           ShapeType = "Triangle";
       }
       if(NumSides == 4){
           ShapeType = "Square";
       }
       if(NumSides == 5){
           ShapeType = "Pentagon";
       }
       if(NumSides == 6){
           ShapeType = "Hexagon";
       }
       if(NumSides >= 7){
           ShapeType = "Heh...Uh...I don't know";
       }
   }
   //accessors
   public double getSideLength(){
       return SideLength;
   }
   public int getNumSides(){
       return NumSides;
   }
   public String getShapeType(){
       return ShapeType;
   }

   public double getPerimeter(){
       return perimeter;
   }

//mutators
   public void calculatePerimeter(double perimeter){
       perimeter = Math.round(((SideLength*1000.0)*NumSides)/1000.0);
   }



    public void setNumSides(int NumSides) {
        this.NumSides = NumSides;
        if(NumSides <= 2){
            NumSides = 3;
            valid = false;
        }
    }

    public void setSideLength(double SideLength){

       this.SideLength = SideLength;
       if(SideLength <= 0){
           SideLength = 1;
           valid = false;
       }
    }


    public String toString(){
       if(valid = false){

           return "The polygon you returned was invalid, it has reset to a equilateral triangle with the side lengths of zero";

       }
       return "Your shape is called " +ShapeType +"\nIt has a side length of " +SideLength +"\n As a " +ShapeType +" it has " +NumSides +" sides.";
    }

}