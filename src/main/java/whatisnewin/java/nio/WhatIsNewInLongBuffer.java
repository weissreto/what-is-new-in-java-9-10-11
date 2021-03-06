package whatisnewin.java.nio;

import java.nio.LongBuffer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link LongBuffer}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link LongBuffer} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see LongBuffer
 */
public final class WhatIsNewInLongBuffer
{
  /**
   * Example call to new method {@link LongBuffer#mismatch(LongBuffer)}.
   * @since 11
   * @see LongBuffer#mismatch(LongBuffer)
   */
  public int mismatch(LongBuffer that)
  {
    LongBuffer testee = $$$();

    int result = testee.mismatch(that);
    return result;
  }

  private LongBuffer $$$()
  {
    return null;
  }
}
