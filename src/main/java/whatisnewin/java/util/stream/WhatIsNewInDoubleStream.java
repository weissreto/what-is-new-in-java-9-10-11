package whatisnewin.java.util.stream;

import java.util.stream.DoubleStream;
import java.util.function.DoublePredicate;
import java.util.function.DoubleUnaryOperator;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DoubleStream}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link DoubleStream} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see DoubleStream
 */
public final class WhatIsNewInDoubleStream
{
  /**
   * Example call to new method {@link DoubleStream#iterate(double, DoublePredicate, DoubleUnaryOperator)}.
   * @since 9
   * @see DoubleStream#iterate(double, DoublePredicate, DoubleUnaryOperator)
   */
  public static DoubleStream iterate(double seed, DoublePredicate hasNext, DoubleUnaryOperator next)
  {
    DoubleStream result = DoubleStream.iterate(seed, hasNext, next);
    return result;
  }

  /**
   * Example call to new method {@link DoubleStream#takeWhile(DoublePredicate)}.
   * @since 9
   * @see DoubleStream#takeWhile(DoublePredicate)
   */
  public DoubleStream takeWhile(DoublePredicate predicate)
  {
    DoubleStream testee = $$$();

    DoubleStream result = testee.takeWhile(predicate);
    return result;
  }

  /**
   * Example call to new method {@link DoubleStream#dropWhile(DoublePredicate)}.
   * @since 9
   * @see DoubleStream#dropWhile(DoublePredicate)
   */
  public DoubleStream dropWhile(DoublePredicate predicate)
  {
    DoubleStream testee = $$$();

    DoubleStream result = testee.dropWhile(predicate);
    return result;
  }

  private DoubleStream $$$()
  {
    return null;
  }
}
