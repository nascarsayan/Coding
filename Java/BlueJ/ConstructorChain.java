 

class ConstructorChain {
	// default constructor 1
	// default constructor will call another constructor
	// using this keyword from same class
	ConstructorChain() {
		// calls constructor 2
		this(5);
		System.out.println("The Default constructor");
	}

	// parameterized constructor 2
	ConstructorChain(int x) {
		// calls constructor 3
		this(5, 15);
		System.out.println(x);
	}

	// parameterized constructor 3
	ConstructorChain(int x, int y) {
		System.out.println(x * y);
	}

	public static void main(String args[]) {
		// invokes default constructor first
		new ConstructorChain();
	}
}
