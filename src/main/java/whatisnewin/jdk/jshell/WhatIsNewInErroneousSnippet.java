package whatisnewin.jdk.jshell;

import jdk.jshell.ErroneousSnippet;
import jdk.jshell.Snippet.Kind;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ErroneousSnippet}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ErroneousSnippet} is a completely new class
 * @since 9
 * @see ErroneousSnippet
 */
public final class WhatIsNewInErroneousSnippet
{
  /**
   * Example call to new method {@link ErroneousSnippet#probableKind}
   * @since 9
   * @see ErroneousSnippet#probableKind
   */
  public Kind probableKind()
  {
    ErroneousSnippet testee = $$$();

    Kind result = testee.probableKind();
    return result;
  }

  private ErroneousSnippet $$$()
  {
    return null;
  }
}
