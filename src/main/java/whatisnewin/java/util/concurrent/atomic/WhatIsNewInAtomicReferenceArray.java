package whatisnewin.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link AtomicReferenceArray}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link AtomicReferenceArray} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see AtomicReferenceArray
 */
public final class WhatIsNewInAtomicReferenceArray<E>
{
  /**
   * Example call to new method {@link AtomicReferenceArray#weakCompareAndSetPlain(int, Object, Object)}.
   * @since 9
   * @see AtomicReferenceArray#weakCompareAndSetPlain(int, Object, Object)
   */
  public boolean weakCompareAndSetPlain(int i, E expectedValue, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    boolean result = testee.weakCompareAndSetPlain(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#getPlain(int)}.
   * @since 9
   * @see AtomicReferenceArray#getPlain(int)
   */
  public E getPlain(int i)
  {
    AtomicReferenceArray<E> testee = $$$();

    E result = testee.getPlain(i);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#setPlain(int, Object)}.
   * @since 9
   * @see AtomicReferenceArray#setPlain(int, Object)
   */
  public void setPlain(int i, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    testee.setPlain(i, newValue);
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#getOpaque(int)}.
   * @since 9
   * @see AtomicReferenceArray#getOpaque(int)
   */
  public E getOpaque(int i)
  {
    AtomicReferenceArray<E> testee = $$$();

    E result = testee.getOpaque(i);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#setOpaque(int, Object)}.
   * @since 9
   * @see AtomicReferenceArray#setOpaque(int, Object)
   */
  public void setOpaque(int i, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    testee.setOpaque(i, newValue);
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#getAcquire(int)}.
   * @since 9
   * @see AtomicReferenceArray#getAcquire(int)
   */
  public E getAcquire(int i)
  {
    AtomicReferenceArray<E> testee = $$$();

    E result = testee.getAcquire(i);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#setRelease(int, Object)}.
   * @since 9
   * @see AtomicReferenceArray#setRelease(int, Object)
   */
  public void setRelease(int i, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    testee.setRelease(i, newValue);
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#compareAndExchange(int, Object, Object)}.
   * @since 9
   * @see AtomicReferenceArray#compareAndExchange(int, Object, Object)
   */
  public E compareAndExchange(int i, E expectedValue, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    E result = testee.compareAndExchange(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#compareAndExchangeAcquire(int, Object, Object)}.
   * @since 9
   * @see AtomicReferenceArray#compareAndExchangeAcquire(int, Object, Object)
   */
  public E compareAndExchangeAcquire(int i, E expectedValue, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    E result = testee.compareAndExchangeAcquire(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#compareAndExchangeRelease(int, Object, Object)}.
   * @since 9
   * @see AtomicReferenceArray#compareAndExchangeRelease(int, Object, Object)
   */
  public E compareAndExchangeRelease(int i, E expectedValue, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    E result = testee.compareAndExchangeRelease(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#weakCompareAndSetVolatile(int, Object, Object)}.
   * @since 9
   * @see AtomicReferenceArray#weakCompareAndSetVolatile(int, Object, Object)
   */
  public boolean weakCompareAndSetVolatile(int i, E expectedValue, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    boolean result = testee.weakCompareAndSetVolatile(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#weakCompareAndSetAcquire(int, Object, Object)}.
   * @since 9
   * @see AtomicReferenceArray#weakCompareAndSetAcquire(int, Object, Object)
   */
  public boolean weakCompareAndSetAcquire(int i, E expectedValue, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    boolean result = testee.weakCompareAndSetAcquire(i, expectedValue, newValue);
    return result;
  }

  /**
   * Example call to new method {@link AtomicReferenceArray#weakCompareAndSetRelease(int, Object, Object)}.
   * @since 9
   * @see AtomicReferenceArray#weakCompareAndSetRelease(int, Object, Object)
   */
  public boolean weakCompareAndSetRelease(int i, E expectedValue, E newValue)
  {
    AtomicReferenceArray<E> testee = $$$();

    boolean result = testee.weakCompareAndSetRelease(i, expectedValue, newValue);
    return result;
  }

  private AtomicReferenceArray<E> $$$()
  {
    return null;
  }
}
