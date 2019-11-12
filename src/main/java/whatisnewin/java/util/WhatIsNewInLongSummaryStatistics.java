package whatisnewin.java.util;

import java.util.LongSummaryStatistics;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link LongSummaryStatistics}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link LongSummaryStatistics} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see LongSummaryStatistics
 */
public final class WhatIsNewInLongSummaryStatistics
{
  /**
   * Example call to new constructor {@link LongSummaryStatistics#LongSummaryStatistics}
   * @since 10
   * @see LongSummaryStatistics#LongSummaryStatistics
   */
  public WhatIsNewInLongSummaryStatistics(long count, long min, long max, long sum) throws IllegalArgumentException
  {
    LongSummaryStatistics testee = new LongSummaryStatistics(count, min, max, sum);
  }

}
