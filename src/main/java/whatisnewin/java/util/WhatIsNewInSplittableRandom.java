package whatisnewin.java.util;

import java.util.SplittableRandom;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SplittableRandom}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link SplittableRandom} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see SplittableRandom
 */
public final class WhatIsNewInSplittableRandom
{
  /**
   * Example call to new method {@link SplittableRandom#nextBytes(byte[])}.
   * @since 10
   * @see SplittableRandom#nextBytes(byte[])
   */
  public void nextBytes(byte[] bytes)
  {
    SplittableRandom testee = $$$();

    testee.nextBytes(bytes);
  }

  private SplittableRandom $$$()
  {
    return null;
  }
}
