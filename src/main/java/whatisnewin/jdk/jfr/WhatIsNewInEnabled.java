package whatisnewin.jdk.jfr;

import jdk.jfr.Enabled;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Enabled}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Enabled} is a completely new class.
 * @since 9
 * @see Enabled
 */
public final class WhatIsNewInEnabled
{
  /**
   * Example usage of the new field {@link Enabled#NAME}.
   * @since 9
   * @see Enabled#NAME
   */
  public static final String NAME = Enabled.NAME;

  /**
   * Example call to new method {@link Enabled#value()}.
   * @since 9
   * @see Enabled#value()
   */
  public boolean value()
  {
    Enabled testee = $$$();

    boolean result = testee.value();
    return result;
  }

  private Enabled $$$()
  {
    return null;
  }
}
