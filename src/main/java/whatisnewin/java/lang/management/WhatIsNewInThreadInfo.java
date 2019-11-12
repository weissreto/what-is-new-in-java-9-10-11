package whatisnewin.java.lang.management;

import java.lang.management.ThreadInfo;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ThreadInfo}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ThreadInfo} is an old class but has new fields, constructors or methods
 * @since 1.5
 * @see ThreadInfo
 */
public final class WhatIsNewInThreadInfo
{
  /**
   * Example call to new method {@link ThreadInfo#isDaemon}
   * @since 9
   * @see ThreadInfo#isDaemon
   */
  public boolean isDaemon()
  {
    ThreadInfo testee = $$$();

    boolean result = testee.isDaemon();
    return result;
  }

  /**
   * Example call to new method {@link ThreadInfo#getPriority}
   * @since 9
   * @see ThreadInfo#getPriority
   */
  public int getPriority()
  {
    ThreadInfo testee = $$$();

    int result = testee.getPriority();
    return result;
  }

  private ThreadInfo $$$()
  {
    return null;
  }
}
