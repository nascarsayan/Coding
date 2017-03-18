/**
 * <h1 style="font-family:Monaco"><center>Polymorphic Virus</center></h1>
 * The <a href="https://www.techopedia.com/definition/4055/polymorphic-virus">
 * Polymorphic Virus</a> class is a base class which defines the behaviour
 * of a a complicated computer virus that affects data types and functions.<p></p>
 * It is a self-encrypted virus designed to avoid detection by a scanner.
 * Upon infection, the polymorphic virus duplicates itself by creating usable,
 * albeit slightly modified, copies of itself.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class PolymorphicVirus
{
  /**
   * the first integer
   */
  protected int x;
  /**
   * the second integer
   */
  protected int y;

  /**
   * A parameterised constructor to initialise the values of {@link #x} and {@link #y}
   *
   * @param x integer to initialise {@link #x}
   * @param y integer to initialise {@link #y}
   */
  public PolymorphicVirus(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  /**
   * A method which shows how the same sum {@link #x} + {@link #y} can be achieved
   *
   * @return a string which shows a possible way to achieve the sum
   * {@link #x} + {@link #y}
   */
  protected String execute()
  {
    int nd = (int)(Math.log10(x + y));
    return String.format("%d = %" + nd +"d + %" + nd + "d\n", x + y, x, y);
  }
}
