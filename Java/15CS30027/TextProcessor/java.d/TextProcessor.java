 /**
 * <h1 style="font-family:Monaco"><center>Text Processor</center></h1>
 * The TextProcessor class implements an application that takes
 * a string as input and prints the words, total number of words
 * and the size of each word in it.
 * <p></p>
 *
 * @author Sayan Naskar
 * @version 1.0
 * @since 2017-03-10
 */
public class TextProcessor
{
  public TextProcessor ob = null;
  private TextProcessor()
  {

  }
  public TextProcessor getInstance()
  {
    if(ob == null)
      ob = new TextProcessor();
    return ob;
  }
  /**
   * To process a string and return the words in the string.
   * @param str the string to be parsed
   * @return array of words present in str
   */
  public String[] getWords(String str)
  {
    String[] wds = str.split(" ");
    return wds;
  }

  /**
   * To process a string and return the number of words.
   * It uses the {@link #getWords(String)} method.
   * @param str the string to be parsed
   * @return number of words in the string str
   */
  public int getWordCount(String str)
  {
    String[] wds = getWords(str);
    return wds.length;
  }

  /**
   * To process a string and return the size of each word
   * in the form of an integer array.
   * It uses the {@link #getWords(String)} method.
   * @param str the string to be parsed
   * @return an array of integers where the i<sup>th</sup> element
   *         represents the size of the i<sup>th</sup> word.
   */
  public int[] getWordLengths(String str)
  {
    int i;
    String[] wds = getWords(str);
    int[] szarr = new int[wds.length];
    for(i = 0; i < wds.length; i++)
      szarr[i] = wds[i].length();
    return szarr;
  }

  /**
   * The main method which demonstrates the behaviour of the
   * {@link #getWords(String)}, {@link #getWordCount(String)}
   * and {@link #getWordLengths(String)} methods.
   * @param args the command-line argument string array; args[0]
   *             stores the input string.
   * @exception ArrayIndexOutOfBoundsException on input error
   */
  public static void main(String args[])
  {
    TextProcessor ob = new TextProcessor();
    String str = args[0];
    String wds[] = ob.getWords(str);
    int nwds = ob.getWordCount(str);
    int[] szarr = ob.getWordLengths(str);
    System.out.println("+++ Printing the words in the string : ");
    for(String s : wds)
      System.out.println(s);
    System.out.print("\n+++ Total number of words : ");
    System.out.println(nwds);
    System.out.println("+++ The size of each word : ");
      for(int i = 0; i < szarr.length; i++)
        System.out.println(wds[i] + " --> " + szarr[i]);
  }
}
