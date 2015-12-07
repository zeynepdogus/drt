
public class Rectangle extends Shape {
   private double width;   // Private member variable
   private double height; 
   
   public Rectangle(double width, double height) {  // Constructor 2
	   	  this.width = width;       // invoke superclass' constructor Circle(radius)
	      this.height = height;
	   }
	   
  public double getWidth() {
      return width;
   }
   public void setWidth(double width) {
      this. width=  width;
   }
   
   
   public double getHeight() {
	      return width;
	   }
	   public void setHeight(double height) {
	      this. height=  height;
	   }
   public double area() {
      return height*width;   
   }
}
