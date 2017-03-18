 

class TestStatic {
	static int i;
	int j;

	// start of static block
	static {
		i = 10;
		System.out.println("static block called ");
	}
	// end of static block
}

class StaticBlock {
	public static void main(String args[]) {

		// Although we don't have an object of TestStatic, static block is
		// called because i is being accessed in following statement.
		System.out.println(TestStatic.i);
	}
}