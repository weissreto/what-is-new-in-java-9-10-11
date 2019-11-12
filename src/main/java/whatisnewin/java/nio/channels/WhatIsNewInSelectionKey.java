package whatisnewin.java.nio.channels;

import java.nio.channels.SelectionKey;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link SelectionKey}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link SelectionKey} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see SelectionKey
 */
public final class WhatIsNewInSelectionKey
{
  /**
   * Example call to new method {@link SelectionKey#interestOpsOr}
   * @since 11
   * @see SelectionKey#interestOpsOr
   */
  public int interestOpsOr(int ops)
  {
    SelectionKey testee = $$$();

    int result = testee.interestOpsOr(ops);
    return result;
  }

  /**
   * Example call to new method {@link SelectionKey#interestOpsAnd}
   * @since 11
   * @see SelectionKey#interestOpsAnd
   */
  public int interestOpsAnd(int ops)
  {
    SelectionKey testee = $$$();

    int result = testee.interestOpsAnd(ops);
    return result;
  }

  private SelectionKey $$$()
  {
    return null;
  }
}
