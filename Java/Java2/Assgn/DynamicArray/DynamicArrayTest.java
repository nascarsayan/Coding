public class DynamicArrayTest
{
  public static void main(String[] args) {
    int i;
    DynamicArray arr = new DynamicArray();
    for(i = 0; i <= 10; i++)
      {
        arr.add(i);
        arr.print();
      }
  }
}
