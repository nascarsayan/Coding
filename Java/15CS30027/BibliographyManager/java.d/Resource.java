/**
 * <h1 style="font-family:Monaco"><center>Resource</center></h1>
 * The Resource class provides the functional details of the various
 * components of the bibliography manager
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
abstract public class Resource
{
  /**
   * the title of this resource
   */
  private String title;

  /**
   * Parameterised constructor to initialise the {@link #title} of this resource
   * @param title the {@link #title} of this resource
   */
  public Resource(String title)
  {
    this.title = title;
  }

  /**
   * A getter method to return the {@link #title} of this resource
   * @return the {@link #title} of the resource
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * A method to print the information about this resource material
   * @return a string with the infrmation about this resource material
   */
  public abstract String print();
}
