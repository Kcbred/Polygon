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

   private double perimeter;


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
       }
       if(SL <= 0){
           SL = 1;
       }
       if(NumSides = 3){
           ShapeType = "Triangle";
       }
       if(NumSides = 4){
           ShapeType = "Square";
       }
       if(NumSides = 5){
           ShapeType = "Pentagon";
       }
       if(NumSides = 6){
           ShapeType = "Hexagon";
       }
       if(NumSides >= 7){
           ShapeType = "Heh...Uh...I don't know"
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

   public double calcPerimeter(){
       perimeter = NumSides*SideLength;
   }

    public double calcArea(){

    }
   ///mutators

    public void setNumSides(int NumSides) {
        this.NumSides = NumSides;
    }

    public void setSideLength(double SideLength){
       this.SideLength = SideLength;
    }
}