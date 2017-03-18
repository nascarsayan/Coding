public class Faculty extends Employee
{
  private String desig;
  public Faculty(String name, int age, int ecno, String doj, String desig)
  {
    super(name, age, ecno, doj);
    this.desig = desig;
  }
  public void printAttr()
  {
    super.printAttr();
    System.out.printf("Designation = %s\n", desig);
  }
}
