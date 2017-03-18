/**
 * <h1 style="font-family:Monaco"><center>Subtractive Polymorphic Virus</center></h1>
 * The subtractive polymorphic virus generates new values of
 * x<sub>i</sub> and y<sub>i</sub> such that <p><center><code>
 *     x<sub>i</sub> - y<sub>i</sub> = {@link #x x} + {@link #y y}
 * </code></center></p>
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class SubtractivePolymorphicVirus extends PolymorphicVirus
{
  /**
   * A parameterised constructor to initialise the values of {@link #x x} and {@link #y y}
   *
   * @param x integer to initialise {@link #x x}
   * @param y integer to initialise {@link #y y}
   */
  public SubtractivePolymorphicVirus(int x, int y)
  {
    super(x, y);
  }

  /**
   * A method which demonstrates a possible pair <code>
   *     (x<sub>i</sub>, y<sub>i</sub>)</code>
   * such that <p><code>
   *     x<sub>i</sub> + y<sub>i</sub> = {@link #x x} + {@link #y y}</p></code>
   * @return a string demonstrating subtractive polymorphic virus
   */
  protected String execute()
  {
    int sum = x + y, x1, y1, nd = (int)(Math.log10(sum));
    x1 = (int) (sum + Math.random() * sum);
    y1 = x1 - sum;
    return String.format("%d = %" + nd + "d - %" + nd + "d\n", x1 - y1, x1, y1);
  }
}
