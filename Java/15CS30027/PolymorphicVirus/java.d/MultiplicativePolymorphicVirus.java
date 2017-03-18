/**
 * <h1 style="font-family:Monaco"><center>Multiplicative Polymorphic Virus</center></h1>
 * The multiplicative polymorphic virus generates new values of
 * x<sub>i</sub> and y<sub>i</sub> such that <p><center><code>
 *     x<sub>i</sub> * y<sub>i</sub> = {@link #x x} + {@link #y y}
 * </code></center></p>
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class MultiplicativePolymorphicVirus extends PolymorphicVirus
{
  /**
   * the array storing the factors <code>f</code>
   * such that {@code f <= sqrt({@link #x x} + {@link #y y})}
   */
  protected int arr[];
  /**
   * integer to store the number of factors {@code f | f <= sqrt({@link #x x} + {@link #y y})}
   */
  protected int half_fac;
  /**
   * A parameterised constructor to initialise the values of {@link #x x} and {@link #y y}.
   * <br>The constructor also generates the fields {@link #arr} and {@link #half_fac}
   * from the values of x and y
   *
   * @param x integer to initialise {@link #x x}
   * @param y integer to initialise {@link #y y}
   */
  public MultiplicativePolymorphicVirus(int x, int y)
  {
    super(x, y);
    int i, t1 = 0;
    half_fac = 0;
    for(i = 1; i * i <= x + y; i++)
      if((x + y) % i == 0)
        half_fac++;
    arr = new int[half_fac];
    for(i = 1; i * i <= x + y; i++)
      if((x + y) % i == 0)
        arr[t1 ++] = i;
  }

  /**
   * A method which demonstrates a possible pair <code>
   *     (x<sub>i</sub>, y<sub>i</sub>)</code>
   * such that <p><code>
   *     x<sub>i</sub> * y<sub>i</sub> = {@link #x x} + {@link #y y}</p></code>
   * @return a string demonstrating multiplicative polymorphic virus
   */
  protected String execute()
  {
    int sum = x + y, x1, y1, nd = (int)(Math.log10(sum));
    x1 = arr[(int)(Math.random()*half_fac)];
    y1 = sum / x1;
    return String.format("%d = %" + nd + "d * %" + nd + "d\n", sum, x1, y1);
  }
}
