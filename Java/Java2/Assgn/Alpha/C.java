public class C implements B
{
  public void doSomething()
  {
    System.out.println("Something done");
  }
  public void doSomethingMore()
  {
    System.out.println("Something more done");
  }
  public static void main(String args[])
  {
    C ob = new C();
    ob.doSomething();
    ob.doSomethingMore();
  }
}
