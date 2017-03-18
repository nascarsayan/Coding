class BaseClass
{
  public int x = 10;
  private int y = 10;
  protected int z = 10;
  int a = 10;

  public int getX()
  {
    return x;
  }
  public void setX(int x)
  {
    this.x = x;
  }
  public int getY()
  {
    return y;
  }
  public void setY(int y)
  {
    this.y = y;
  }
  protected int getZ()
  {
    return z;
  }
  protected void setZ(int z)
  {
    this.z = z;
  }
  int getA()
  {
    return a;
  }
  void setA(int a)
  {
    this.a = a;
  }
}

public class SubclassInSamePackage extends BaseClass
{
  public static void main(String[] args)
  {
    BaseClass rr = new BaseClass();
    rr.z = 0;
    SubclassInSamePackage subclassObj = new SubclassInSamePackage();

    System.out.println("Value of x is : " + subclassObj.x);
    subclassObj.setX(20);
    System.out.println("Value of x is : " + subclassObj.x);
    //System.out.println("Value of y is : " + subclassObj.y);
    subclassObj.setY(20);
    //System.out.println("Value of y is : " + subclassObj.y);

    System.out.println("Value of z is : " + subclassObj.z);
    subclassObj.setZ(30);
    System.out.println("Value of z is : " + subclassObj.z);

    System.out.println("Value of a is : " + subclassObj.a);
    subclassObj.setA(20);
    System.out.println("Value of a is : " + subclassObj.a);
  }
}
