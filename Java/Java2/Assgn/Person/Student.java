public class Student extends Person
{
  private String roll;
  private String branch;
  public Student(String name, int age, String roll, String branch)
  {
    super(name, age);
    this.roll = roll;
    this.branch = branch;
  }
  public void printAttr()
  {
    super.printAttr();
    System.out.printf("Roll No = %s\nBranch = %s\n", roll, branch);
  }
 }
