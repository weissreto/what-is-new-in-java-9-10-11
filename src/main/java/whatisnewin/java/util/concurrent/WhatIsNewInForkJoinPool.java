package whatisnewin.java.util.concurrent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinPool.ForkJoinWorkerThreadFactory;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.function.Predicate;
import java.util.concurrent.TimeUnit;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ForkJoinPool}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ForkJoinPool} is an old class but has new fields, constructors or methods
 * @since 1.7
 * @see ForkJoinPool
 */
public final class WhatIsNewInForkJoinPool
{
  /**
   * Example call to new constructor {@link ForkJoinPool#ForkJoinPool}
   * @since 9
   * @see ForkJoinPool#ForkJoinPool
   */
  public WhatIsNewInForkJoinPool(int parallelism, ForkJoinWorkerThreadFactory factory, UncaughtExceptionHandler handler, boolean asyncMode, int corePoolSize, int maximumPoolSize, int minimumRunnable, Predicate<? super ForkJoinPool> saturate, long keepAliveTime, TimeUnit unit)
  {
    ForkJoinPool testee = new ForkJoinPool(parallelism, factory, handler, asyncMode, corePoolSize, maximumPoolSize, minimumRunnable, saturate, keepAliveTime, unit);
  }

}