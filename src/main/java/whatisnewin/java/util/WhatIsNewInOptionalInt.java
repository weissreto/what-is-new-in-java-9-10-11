package whatisnewin.java.util;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.function.IntConsumer;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link OptionalInt}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link OptionalInt} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see OptionalInt
 */
public final class WhatIsNewInOptionalInt
{
  /**
   * Example call to new method {@link OptionalInt#stream}
   * @since 9
   * @see OptionalInt#stream
   */
  public IntStream stream()
  {
    OptionalInt testee = $$$();

    IntStream result = testee.stream();
    return result;
  }

  /**
   * Example call to new method {@link OptionalInt#ifPresentOrElse}
   * @since 9
   * @see OptionalInt#ifPresentOrElse
   */
  public void ifPresentOrElse(IntConsumer action, Runnable emptyAction)
  {
    OptionalInt testee = $$$();

    testee.ifPresentOrElse(action, emptyAction);
  }

  /**
   * Example call to new method {@link OptionalInt#orElseThrow}
   * @since 10
   * @see OptionalInt#orElseThrow
   */
  public int orElseThrow()
  {
    OptionalInt testee = $$$();

    int result = testee.orElseThrow();
    return result;
  }

  /**
   * Example call to new method {@link OptionalInt#isEmpty}
   * @since 11
   * @see OptionalInt#isEmpty
   */
  public boolean isEmpty()
  {
    OptionalInt testee = $$$();

    boolean result = testee.isEmpty();
    return result;
  }

  private OptionalInt $$$()
  {
    return null;
  }
}