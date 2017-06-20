
public class Methods {

	public static void main(String[] args) {
		// TODO Show the difference between Overriding and Overloading
		Methods A = new Methods();
		SquareMethods B = new SquareMethods();
		A.add();
		A.add(5);
		B.add();
	}
	//Using private variables to control their accessibility via getter methods
	private int x = 2;
	private int y = 3;
	
	public int getX() {
		return x;
	}	
	public int getY() {
		return y;
	}
	
	//Method to be overloaded and overridden 
	void add() {
		System.out.println("The sum of x and y is " +(x+y));
	}

	//Overloads add() since it has a different signature (more parameters).
	//Because the signature is different, when 'add' is called with an integer parameter
	//the compiler will know this is the 'add' method it wants.
	void add(int z) { 
		System.out.println("The sum of x, y and z is " +(x+y+z));		
	}

}

//Overriding can only happen through inheritance because Compiler wont allow
//it in the same class.
class SquareMethods extends Methods{
	
	/*Overrides add() in parent class since it has same signature
	*(same parameters which happens to be none)
	*when an instance of SquareMethods calls 'add()' without parameters,
	*this method will be used instead of it's parent's (Method) 'add()'
	*/
	void add(){
		int x= getX();
		int y= getY();
		System.out.println("The sum of x^2 and y^2 is " +(Math.pow(x, 2) + Math.pow(y, 2)));		
	}
}