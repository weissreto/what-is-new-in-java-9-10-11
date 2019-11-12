package whatisnewin.java.lang.management;

import java.lang.management.RuntimeMXBean;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link RuntimeMXBean}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link RuntimeMXBean} is an old class but has new fields, constructors or methods
 * @since 1.5
 * @see RuntimeMXBean
 */
public final class WhatIsNewInRuntimeMXBean
{
  /**
   * Example call to new method {@link RuntimeMXBean#getPid}
   * @since 10
   * @see RuntimeMXBean#getPid
   */
  public long getPid()
  {
    RuntimeMXBean testee = $$$();

    long result = testee.getPid();
    return result;
  }

  private RuntimeMXBean $$$()
  {
    return null;
  }
}