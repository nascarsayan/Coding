public class Factorial
{
  long factorial(int x)
  {
    return (x <= 1) ? 1 : x * factorial(x - 1);
  }
  public static void main(String args[])
  {
    System.out.println(new Factorial().factorial(Integer.parseInt(args[0])));
  }
}
