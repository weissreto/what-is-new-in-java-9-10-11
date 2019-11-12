package whatisnewin.jdk.jshell;

import jdk.jshell.EvalException;
import jdk.jshell.JShellException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link EvalException}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link EvalException} is a completely new class
 * @since 9
 * @see EvalException
 */
public final class WhatIsNewInEvalException
{
  /**
   * Example call to new method {@link EvalException#getExceptionClassName}
   * @since 9
   * @see EvalException#getExceptionClassName
   */
  public String getExceptionClassName()
  {
    EvalException testee = $$$();

    String result = testee.getExceptionClassName();
    return result;
  }

  /**
   * Example call to new method {@link EvalException#getCause}
   * @since 9
   * @see EvalException#getCause
   */
  public JShellException getCause()
  {
    EvalException testee = $$$();

    JShellException result = testee.getCause();
    return result;
  }

  private EvalException $$$()
  {
    return null;
  }
}