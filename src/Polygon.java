//instance variables
//default constructor
//overload cont
//accessors
//mutators
//

public class Polygon {
   private int NumSides;
   private double SideLength;
   private String ShapeType;


   public Polygon(){
       NumSides = 3;
       SideLength = 1;
       ShapeType = "Triangle";
   }

   public Polygon(int NS, double SL){
       NumSides = NS;
       SideLength = SL;
       if(NS <= 2){
           NS = 3;
       }
       if(SL <= 0){
           SL = 1;
       }
   }
   public double getSideLength(){
       return SideLength;
   }
   public int getNumSides(){
       return NumSides;
   }
   public String getShapeType(){
       return ShapeType;
   }
}