package whatisnewin.java.nio;

import java.nio.ShortBuffer;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ShortBuffer}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ShortBuffer} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see ShortBuffer
 */
public final class WhatIsNewInShortBuffer
{
  /**
   * Example call to new method {@link ShortBuffer#mismatch(ShortBuffer)}.
   * @since 11
   * @see ShortBuffer#mismatch(ShortBuffer)
   */
  public int mismatch(ShortBuffer that)
  {
    ShortBuffer testee = $$$();

    int result = testee.mismatch(that);
    return result;
  }

  private ShortBuffer $$$()
  {
    return null;
  }
}
