import java.util.ArrayList;
public class ArrayListDemo
{
  public static void main(String args[])
  {
    int i;
    ArrayList<Integer> arr = new ArrayList<Integer>();
    for(i = 1; i <= 10; i++)
      arr.add((i * i));
    System.out.println("Elements :");
    for(i = 0; i < 10; i++)
      System.out.print(arr.get(i) + " ");
    System.out.println("\nSize = " + arr.size());
      arr.clear();
    System.out.println("Array is empty : " + arr.isEmpty());
  }
}
