/**
 * <h1 style="font-family:Monaco"><center>Offline Resource</center></h1>
 * The OfflineResource class provides the functional details of an offline resource.
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
abstract public class OfflineResource extends Resource
{
  /**
   * the pubisher of this offline resource
   */
  private String publisher;
  /**
   * the year in which this offline resource was published
   */
  private int year;

  /**
   * A parameterised constructor to initialise the title, {@link #publisher}
   * and {@link #year year of publication} of this offline resource material
   * @param title the title of this resource
   * @param publisher the {@link #publisher} of this resource
   * @param year the {@link #year year of publication} of this resource
   */
  public OfflineResource(String title, String publisher, int year)
  {
    super(title);
    this.publisher = publisher;
    this.year = year;
  }

  /**
   * A getter method to return the {@link #publisher} of this offline resource material
   * @return the {@link #publisher} of this offline resource material
   */
  public String getPublisher()
  {
    return publisher;
  }

  /**
   * A getter method to return the {@link #year year of publication}
   * of the online resource material
   * @return the {@link #year year of publication} of the
   *         online resource material
   */
  public int getYear()
  {
    return year;
  }
}
