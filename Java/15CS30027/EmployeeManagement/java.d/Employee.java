/**
 * <h1 style="font-family:Monaco"><center>Employee</center></h1>
 * The Employee class implements the characteristics and behaviour
 * of a generic employee in the <code>Company X</code>.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */

public class Employee
{
  /**
   * the name of this employee
   */
  protected String name;
  /**
   * the id of this employee
   */
  protected int id;
  /**
   * the id of the last registered employee, used to initialise {@link #id}
   */
  private static int idcom = 1000;
  /**
   * the salary of a normal employee which is Rs. {@value #empSalary}
   */
  final public int empSalary = 30000;

  /**
   * A parameterised constructor to initialise the {@link #name}
   * and {@link #id} fields of this employee.
   *
   * @param name the {@link #name} to be given to the new employee
   */
  public Employee(String name)
  {
    this.name = name;
    id = ++idcom;
  }

  /**
   * A getter method to return the {@link #empSalary salary}
   * of this employee
   * @return the {@link #empSalary salary} of this employee
   */
  public double getSalary()
  {
    return empSalary;
  }

  /**
   * A getter mathod to return the {@link #name} of this employee
   * @return the {@link #name} of this employee
   */
  public String getName()
  {
    return name;
  }
  /**
   * A getter method to return the {@link #id} of this employee
   * @return the {@link #id} of this employee
   */
  public int getId()
  {
    return id;
  }
}
