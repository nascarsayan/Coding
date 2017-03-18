/**
 * <h1 style="font-family:Monaco"><center>Employee Management Test</center></h1>
 * This class is created to demonstrate the characteristics and
 * behaviour of the employees of the <code>Company X</code>
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class EmployeeManagement
{
  /**
   * The main method creates two instances of each of the classes
   * <ul>
   *     <li>Employee</li>
   *     <li>Manager</li>
   *     <li>OnsiteManager</li>
   *     <li>TechArch</li>
   * </ul>
   * and demonstrates the behaviour of the respective class.
   * @param args unused
   */
  public static void main(String args[])
  {
    double total = 0, t = 0;
    Employee earr[] = new Employee[8];
    earr[0] = new Employee("Employee 1");
    earr[1] = new Employee("Employee 2");
    earr[2] = new Manager("Manager 1", 10);
    earr[3] = new Manager("Manager 2", 20);
    earr[4] = new OnsiteManager("Onsite Manager 1", 30, 2);
    earr[5] = new OnsiteManager("Onsite Manager 2", 40, 4);
    earr[6] = new TechArch("Technical Architect 1", 50);
    earr[7] = new TechArch("Technical Architect 2", 60);
    System.out.printf("%-20s %-20s %-20s\n\n", "Unique ID", "Name", "Salary");
    for (Employee e : earr)
      {
        System.out.printf("%-20d %-25s %-15.2f\n", e.getId(), e.getName(), t = e.getSalary());
        total += t;
      }
    System.out.printf("\nTotal = %.2f\n", total);
  }
}
