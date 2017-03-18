public class DynamicArray
{
  private int array[];
  private int tmparray[];
  private int index;
  private int size;
  public DynamicArray()
  {
    size = 10;
    array = new int[size];
    index = - 1;
  }
  public void add(int x)
  {
    int i;
    if(index == size - 1)
      {
        tmparray = new int[size * 2];
        for(i = 0; i < size; i++)
          tmparray[i] = array[i];
        tmparray[i] = x;
        array = tmparray;
        index = size;
        size = size * 2;
      }
    else
      {
        array[++ index] = x;
      }
  }
  public int remove()
  {
    int i;
    int rem = array[index--];
    if(index < size/2)
      {
        tmparray = new int[size / 2];
        for(i = 0; i <= index; i++)
          tmparray[i] = array[i];
        array = tmparray;
        size = size/2;
      }
    return rem;
  }
  public int size()
  {
    return index + 1;
  }
  public void print()
  {
    int i;
    for(i = 0; i <= index; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }
}
