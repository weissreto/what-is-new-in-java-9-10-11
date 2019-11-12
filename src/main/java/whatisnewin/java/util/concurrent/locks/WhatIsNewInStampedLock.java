package whatisnewin.java.util.concurrent.locks;

import java.util.concurrent.locks.StampedLock;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link StampedLock}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link StampedLock} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see StampedLock
 */
public final class WhatIsNewInStampedLock
{
  /**
   * Example call to new method {@link StampedLock#isOptimisticReadStamp}
   * @since 10
   * @see StampedLock#isOptimisticReadStamp
   */
  public static boolean isOptimisticReadStamp(long stamp)
  {
    boolean result = StampedLock.isOptimisticReadStamp(stamp);
    return result;
  }

  /**
   * Example call to new method {@link StampedLock#isWriteLockStamp}
   * @since 10
   * @see StampedLock#isWriteLockStamp
   */
  public static boolean isWriteLockStamp(long stamp)
  {
    boolean result = StampedLock.isWriteLockStamp(stamp);
    return result;
  }

  /**
   * Example call to new method {@link StampedLock#isLockStamp}
   * @since 10
   * @see StampedLock#isLockStamp
   */
  public static boolean isLockStamp(long stamp)
  {
    boolean result = StampedLock.isLockStamp(stamp);
    return result;
  }

  /**
   * Example call to new method {@link StampedLock#isReadLockStamp}
   * @since 10
   * @see StampedLock#isReadLockStamp
   */
  public static boolean isReadLockStamp(long stamp)
  {
    boolean result = StampedLock.isReadLockStamp(stamp);
    return result;
  }

}
