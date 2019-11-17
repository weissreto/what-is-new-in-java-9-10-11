package whatisnewin.java.lang;

import java.util.stream.IntStream;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link StringBuffer}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link StringBuffer} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see StringBuffer
 */
public final class WhatIsNewInStringBuffer
{
  /**
   * Example call to new method {@link StringBuffer#chars()}.
   * @since 9
   * @see StringBuffer#chars()
   */
  public IntStream chars()
  {
    StringBuffer testee = $$$();

    IntStream result = testee.chars();
    return result;
  }

  /**
   * Example call to new method {@link StringBuffer#compareTo(StringBuffer)}.
   * @since 11
   * @see StringBuffer#compareTo(StringBuffer)
   */
  public int compareTo(StringBuffer another)
  {
    StringBuffer testee = $$$();

    int result = testee.compareTo(another);
    return result;
  }

  private StringBuffer $$$()
  {
    return null;
  }
}
