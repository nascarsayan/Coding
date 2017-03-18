/**
 * <h1 style="font-family:Monaco"><center>Polymorphic Virus Test</center></h1>
 * This class is created to demonstrate the characteristics and 
 * behaviour of the PolymorphicVirus class and the classes inherited from it.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class PolymorphicVirusTest
{
  /**
   * The main method creates one instance of each of the classes
   * <ul><li>PolymorphicVirus</li><li>AdditivePolymorphicVirus</li>
   * <li>SubtractivePolymorphicVirus</li>
   * <li>MultiplicativePolymorphicVirus</li></ul>
   * and demonstrates the behaviour of the respective class.
   * @param args the command-line argument string array;<br>
   *             args[0] contains x, args[1] contains y
   */
  public static void main(String args[])
  {
    int x1 = Integer.parseInt(args[0]), x2 = Integer.parseInt(args[1]);
    PolymorphicVirus[] viruses = new PolymorphicVirus[4];
    viruses[0] = new PolymorphicVirus(x1, x2);
    viruses[1] = new AdditivePolymorphicVirus(x1, x2);
    viruses[2] = new SubtractivePolymorphicVirus(x1, x2);
    viruses[3] = new MultiplicativePolymorphicVirus(x1, x2);

    for(PolymorphicVirus v : viruses)
      for(int i = 1; i <= 5; i++)
        System.out.printf(v.execute());
  }
}
