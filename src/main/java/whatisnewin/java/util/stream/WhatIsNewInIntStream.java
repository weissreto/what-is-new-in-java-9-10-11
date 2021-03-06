package whatisnewin.java.util.stream;

import java.util.stream.IntStream;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link IntStream}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link IntStream} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see IntStream
 */
public final class WhatIsNewInIntStream
{
  /**
   * Example call to new method {@link IntStream#takeWhile(IntPredicate)}.
   * @since 9
   * @see IntStream#takeWhile(IntPredicate)
   */
  public IntStream takeWhile(IntPredicate predicate)
  {
    IntStream testee = $$$();

    IntStream result = testee.takeWhile(predicate);
    return result;
  }

  /**
   * Example call to new method {@link IntStream#dropWhile(IntPredicate)}.
   * @since 9
   * @see IntStream#dropWhile(IntPredicate)
   */
  public IntStream dropWhile(IntPredicate predicate)
  {
    IntStream testee = $$$();

    IntStream result = testee.dropWhile(predicate);
    return result;
  }

  /**
   * Example call to new method {@link IntStream#iterate(int, IntPredicate, IntUnaryOperator)}.
   * @since 9
   * @see IntStream#iterate(int, IntPredicate, IntUnaryOperator)
   */
  public static IntStream iterate(int seed, IntPredicate hasNext, IntUnaryOperator next)
  {
    IntStream result = IntStream.iterate(seed, hasNext, next);
    return result;
  }

  private IntStream $$$()
  {
    return null;
  }
}
