/**
 * <h1 style="font-family:Monaco"><center>Employee</center></h1>
 * The Employee class implements the characteristics and behaviour
 * of a generic onsite manager in the <code>Company X</code>.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */

public class OnsiteManager extends Manager
{
  /**
   * number of months at onsite
   */
  private int numOns;

  /**
   * A parameterised constructor to initialise the {@link #name name},
   * {@link #id id}, the {@link #numSub number of subordinates} and
   * the {@link #numOns number of months at onsite} of this onsite manager
   * @param name {@link #name name} of this onsite manager
   * @param numSub {@link #numSub number of subordinates} of this onsite manager
   * @param numOns {@link #numOns number of months at onsite} of this onsite manager
   */
  public OnsiteManager(String name, int numSub, int numOns)
  {
    super(name, numSub);
    this.numOns = numOns;
  }

  /**
   * A getter method to return the salary of this onsite manager
   * @return the salary of this onsite manager
   */
  public double getSalary()
  {
    return Math.log(1 + numOns) * super.getSalary();
  }
}
