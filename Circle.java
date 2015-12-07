public class Circle extends Shape {
   private double radius;   // Private member variable
   
   public Circle(double radius) {  // Constructor 2
	            // invoke superclass' constructor Circle(radius)
	      this.radius = radius;
	   }
   public double getRadius() {
      return radius;
   }
   public void setRadius(double radius) {
      this. radius =  radius;
   }
   public double area() {
      return radius*radius*3;   
   }
}
