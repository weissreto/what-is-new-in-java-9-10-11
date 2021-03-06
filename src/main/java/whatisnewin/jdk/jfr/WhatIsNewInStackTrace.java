package whatisnewin.jdk.jfr;

import jdk.jfr.StackTrace;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link StackTrace}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link StackTrace} is a completely new class.
 * @since 9
 * @see StackTrace
 */
public final class WhatIsNewInStackTrace
{
  /**
   * Example usage of the new field {@link StackTrace#NAME}.
   * @since 9
   * @see StackTrace#NAME
   */
  public static final String NAME = StackTrace.NAME;

  /**
   * Example call to new method {@link StackTrace#value()}.
   * @since 9
   * @see StackTrace#value()
   */
  public boolean value()
  {
    StackTrace testee = $$$();

    boolean result = testee.value();
    return result;
  }

  private StackTrace $$$()
  {
    return null;
  }
}
