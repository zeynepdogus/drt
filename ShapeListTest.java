import junit.framework.TestCase;
public class ShapeListTest extends TestCase{
	public void testLargestShape(){
		Shape shape1 = new Rectangle(20,30);
		Shape shape2 = new Circle(5);
		
		ShapeList myList= new ShapeList();
		myList.add(shape1);
		myList.add(shape2);
		
		assertTrue(shape1== myList.largestShape());
		
	
	}	
}

    
   
    
   
   