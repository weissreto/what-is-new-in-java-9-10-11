package whatisnewin.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link AtomicLong}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link AtomicLong} is an old class but has new fields, constructors or methods
 * @since 1.5
 * @see AtomicLong
 */
public final class WhatIsNewInAtomicLong
{
  /**
   * Example call to new method {@link AtomicLong#setPlain}
   * @since 9
   * @see AtomicLong#setPlain
   */
  public void setPlain(long newValue)
  {
    AtomicLong testee = $$$();

    testee.setPlain(newValue);
  }

  /**
   * Example call to new method {@link AtomicLong#weakCompareAndSetPlain}
   * @since 9
   * @see AtomicLong#weakCompareAndSetPlain
   */
  public boolean weakCompareAndSetPlain(long expectedValue, long newValue)
  {
    AtomicLong testee = $$$();

    boolean result = testee.weakCompareAndSetPlain(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicLong#compareAndExchangeAcquire}
   * @since 9
   * @see AtomicLong#compareAndExchangeAcquire
   */
  public long compareAndExchangeAcquire(long expectedValue, long newValue)
  {
    AtomicLong testee = $$$();

    long result = testee.compareAndExchangeAcquire(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicLong#compareAndExchange}
   * @since 9
   * @see AtomicLong#compareAndExchange
   */
  public long compareAndExchange(long expectedValue, long newValue)
  {
    AtomicLong testee = $$$();

    long result = testee.compareAndExchange(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicLong#getAcquire}
   * @since 9
   * @see AtomicLong#getAcquire
   */
  public long getAcquire()
  {
    AtomicLong testee = $$$();

    long result = testee.getAcquire();
    return result;
  }

  /**
   * Example call to new method {@link AtomicLong#weakCompareAndSetAcquire}
   * @since 9
   * @see AtomicLong#weakCompareAndSetAcquire
   */
  public boolean weakCompareAndSetAcquire(long expectedValue, long newValue)
  {
    AtomicLong testee = $$$();

    boolean result = testee.weakCompareAndSetAcquire(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicLong#setRelease}
   * @since 9
   * @see AtomicLong#setRelease
   */
  public void setRelease(long newValue)
  {
    AtomicLong testee = $$$();

    testee.setRelease(newValue);
  }

  /**
   * Example call to new method {@link AtomicLong#setOpaque}
   * @since 9
   * @see AtomicLong#setOpaque
   */
  public void setOpaque(long newValue)
  {
    AtomicLong testee = $$$();

    testee.setOpaque(newValue);
  }

  /**
   * Example call to new method {@link AtomicLong#weakCompareAndSetVolatile}
   * @since 9
   * @see AtomicLong#weakCompareAndSetVolatile
   */
  public boolean weakCompareAndSetVolatile(long expectedValue, long newValue)
  {
    AtomicLong testee = $$$();

    boolean result = testee.weakCompareAndSetVolatile(expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicLong#getPlain}
   * @since 9
   * @see AtomicLong#getPlain
   */
  public long getPlain()
  {
    AtomicLong testee = $$$();

    long result = testee.getPlain();
    return result;
  }

  /**
   * Example call to new method {@link AtomicLong#getOpaque}
   * @since 9
   * @see AtomicLong#getOpaque
   */
  public long getOpaque()
  {
    AtomicLong testee = $$$();

    long result = testee.getOpaque();
    return result;
  }

  /**
   * Example call to new method {@link AtomicLong#compareAndExchangeRelease}
   * @since 9
   * @see AtomicLong#compareAndExchangeRelease
   */
  public long compareAndExchangeRelease(long expectedValue, long newValue)
  {
    AtomicLong testee = $$$();

    long result = testee.compareAndExchangeRelease(expectedValue, newValue);
    return result;
  }

  private AtomicLong $$$()
  {
    return null;
  }
}