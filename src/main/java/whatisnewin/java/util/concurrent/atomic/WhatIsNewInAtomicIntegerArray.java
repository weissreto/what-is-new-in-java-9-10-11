package whatisnewin.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link AtomicIntegerArray}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link AtomicIntegerArray} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see AtomicIntegerArray
 */
public final class WhatIsNewInAtomicIntegerArray
{
  /**
   * Example call to new method {@link AtomicIntegerArray#weakCompareAndSetPlain(int, int, int)}.
   * @since 9
   * @see AtomicIntegerArray#weakCompareAndSetPlain(int, int, int)
   */
  public boolean weakCompareAndSetPlain(int i, int expectedValue, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    boolean result = testee.weakCompareAndSetPlain(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#getPlain(int)}.
   * @since 9
   * @see AtomicIntegerArray#getPlain(int)
   */
  public int getPlain(int i)
  {
    AtomicIntegerArray testee = $$$();

    int result = testee.getPlain(i);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#setPlain(int, int)}.
   * @since 9
   * @see AtomicIntegerArray#setPlain(int, int)
   */
  public void setPlain(int i, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    testee.setPlain(i, newValue);
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#getOpaque(int)}.
   * @since 9
   * @see AtomicIntegerArray#getOpaque(int)
   */
  public int getOpaque(int i)
  {
    AtomicIntegerArray testee = $$$();

    int result = testee.getOpaque(i);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#setOpaque(int, int)}.
   * @since 9
   * @see AtomicIntegerArray#setOpaque(int, int)
   */
  public void setOpaque(int i, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    testee.setOpaque(i, newValue);
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#getAcquire(int)}.
   * @since 9
   * @see AtomicIntegerArray#getAcquire(int)
   */
  public int getAcquire(int i)
  {
    AtomicIntegerArray testee = $$$();

    int result = testee.getAcquire(i);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#setRelease(int, int)}.
   * @since 9
   * @see AtomicIntegerArray#setRelease(int, int)
   */
  public void setRelease(int i, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    testee.setRelease(i, newValue);
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#compareAndExchange(int, int, int)}.
   * @since 9
   * @see AtomicIntegerArray#compareAndExchange(int, int, int)
   */
  public int compareAndExchange(int i, int expectedValue, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    int result = testee.compareAndExchange(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#compareAndExchangeAcquire(int, int, int)}.
   * @since 9
   * @see AtomicIntegerArray#compareAndExchangeAcquire(int, int, int)
   */
  public int compareAndExchangeAcquire(int i, int expectedValue, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    int result = testee.compareAndExchangeAcquire(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#compareAndExchangeRelease(int, int, int)}.
   * @since 9
   * @see AtomicIntegerArray#compareAndExchangeRelease(int, int, int)
   */
  public int compareAndExchangeRelease(int i, int expectedValue, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    int result = testee.compareAndExchangeRelease(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#weakCompareAndSetVolatile(int, int, int)}.
   * @since 9
   * @see AtomicIntegerArray#weakCompareAndSetVolatile(int, int, int)
   */
  public boolean weakCompareAndSetVolatile(int i, int expectedValue, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    boolean result = testee.weakCompareAndSetVolatile(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#weakCompareAndSetAcquire(int, int, int)}.
   * @since 9
   * @see AtomicIntegerArray#weakCompareAndSetAcquire(int, int, int)
   */
  public boolean weakCompareAndSetAcquire(int i, int expectedValue, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    boolean result = testee.weakCompareAndSetAcquire(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicIntegerArray#weakCompareAndSetRelease(int, int, int)}.
   * @since 9
   * @see AtomicIntegerArray#weakCompareAndSetRelease(int, int, int)
   */
  public boolean weakCompareAndSetRelease(int i, int expectedValue, int newValue)
  {
    AtomicIntegerArray testee = $$$();

    boolean result = testee.weakCompareAndSetRelease(i, expectedValue, newValue);
    return result;
  }

  private AtomicIntegerArray $$$()
  {
    return null;
  }
}
