package whatisnewin.java.nio.channels;

import java.nio.channels.Selector;
import java.util.function.Consumer;
import java.nio.channels.SelectionKey;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Selector}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Selector} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see Selector
 */
public final class WhatIsNewInSelector
{
  /**
   * Example call to new method {@link Selector#select(Consumer, long)}.
   * @since 11
   * @see Selector#select(Consumer, long)
   */
  public int select(Consumer<SelectionKey> action, long timeout) throws IOException
  {
    Selector testee = $$$();

    int result = testee.select(action, timeout);
    return result;
  }

  /**
   * Example call to new method {@link Selector#select(Consumer)}.
   * @since 11
   * @see Selector#select(Consumer)
   */
  public int select(Consumer<SelectionKey> action) throws IOException
  {
    Selector testee = $$$();

    int result = testee.select(action);
    return result;
  }

  /**
   * Example call to new method {@link Selector#selectNow(Consumer)}.
   * @since 11
   * @see Selector#selectNow(Consumer)
   */
  public int selectNow(Consumer<SelectionKey> action) throws IOException
  {
    Selector testee = $$$();

    int result = testee.selectNow(action);
    return result;
  }

  private Selector $$$()
  {
    return null;
  }
}
