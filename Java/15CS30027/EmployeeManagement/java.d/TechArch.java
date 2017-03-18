/**
 * <h1 style="font-family:Monaco"><center>Employee</center></h1>
 * The TechArch class implements the characteristics and behaviour
 * of a generic technical architect in the <code>Company X</code>.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class TechArch extends Manager
{
  /**
   * A parameterised constructor to initialise the {@link #name name},
   * {@link #id id} and the {@link #numSub number of subordinates}
   * of this technical architect
   * @param name the {@link #name name} of this technical architect
   * @param numSub the {@link #numSub number of subordinates}
   *               of this technical architect
   */
  public TechArch(String name, int numSub)
  {
    super(name, numSub);
  }

  /**
   * A getter method to return the salary of the
   * technical architect
   * @return the salary of this technical architect
   */
  public double getSalary()
  {
    return 1.5 * super.getSalary();
  }
}
