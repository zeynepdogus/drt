import java.util.*;
public class ShapeList {
	
	ArrayList<Shape> list;
	
	public ShapeList() {
		list = new ArrayList<Shape>();
	}
	
	public void add(Shape s){
		list.add(s);
	}
	
	public Shape largestShape(){
		if ( list.size() == 0)
			return NULL;
		Shape largestShape = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			  if(list.get(i).area() > largestShape.area()){
					largestShape = list.get(i);
			  }
		}
		
		return largestShape;
			
	}

		

	