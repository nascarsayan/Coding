/**
 * <h1 style="font-family:Monaco"><center>Employee</center></h1>
 * The Manager class implements the characteristics and behaviour
 * of a generic manager in the <code>Company X</code>.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */

public class Manager extends Employee
{
  /**
   * number of subordinate employees of this manager
   */
  protected int numSub;

  /**
   * A parameterised constructor to initialise the {@link #name name},
   * {@link #id id} and the {@link #numSub number of subordinates}
   * of this manager
   * @param name the {@link #name name} of this manager
   * @param numSub the {@link #numSub number of subordinates}
   *               of this manager
   */
  public Manager(String name, int numSub)
  {
    super(name);
    this.numSub = numSub;
  }

  /**
   * A getter method to return the salary of this manager
   * @return the salary of this manager
   */
  public double getSalary()
  {
    return Math.log(1 + numSub) * super.getSalary();
  }
}
