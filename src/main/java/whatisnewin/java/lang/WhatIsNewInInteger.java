package whatisnewin.java.lang;


/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Integer}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Integer} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see Integer
 */
public final class WhatIsNewInInteger
{
  /**
   * Example call to new method {@link Integer#parseInt(CharSequence, int, int, int)}.
   * @since 9
   * @see Integer#parseInt(CharSequence, int, int, int)
   */
  public static int parseInt(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException
  {
    int result = Integer.parseInt(s, beginIndex, endIndex, radix);
    return result;
  }

  /**
   * Example call to new method {@link Integer#parseUnsignedInt(CharSequence, int, int, int)}.
   * @since 9
   * @see Integer#parseUnsignedInt(CharSequence, int, int, int)
   */
  public static int parseUnsignedInt(CharSequence s, int beginIndex, int endIndex, int radix) throws NumberFormatException
  {
    int result = Integer.parseUnsignedInt(s, beginIndex, endIndex, radix);
    return result;
  }

}
