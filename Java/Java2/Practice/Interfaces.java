interface I1
{
  void methodI1();
}
interface I2 extends I1
{
  void methodI2();
}

class A1
{
  public String methodA1()
  {
    String strA1 = "I am methodC1 of class A1";
    return strA1;
  }
  public String toString()
  {
    return "toString() method of class A1";
  }
}

class B1 extends A1 implements I2
{
  public void methodI1()
  {
    System.out.println("I am in methodI1 of class B1");
  }
  public void methodI2()
  {
    System.out.println("I am in methodI2 of class B1");
  }

  public static void main(String args[])
  {
    B1 b1ob = new B1();
    b1ob.methodI1();
    b1ob.methodI2();
    System.out.println(b1ob.methodA1());
    System.out.println(b1ob.toString());
  }
}
