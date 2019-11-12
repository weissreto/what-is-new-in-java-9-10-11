package whatisnewin.java.nio;

import java.nio.DoubleBuffer;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link DoubleBuffer}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link DoubleBuffer} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see DoubleBuffer
 */
public final class WhatIsNewInDoubleBuffer
{
  /**
   * Example call to new method {@link DoubleBuffer#mismatch}
   * @since 11
   * @see DoubleBuffer#mismatch
   */
  public int mismatch(DoubleBuffer that)
  {
    DoubleBuffer testee = $$$();

    int result = testee.mismatch(that);
    return result;
  }

  private DoubleBuffer $$$()
  {
    return null;
  }
}