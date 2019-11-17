package whatisnewin.jdk.jshell.spi;

import jdk.jshell.spi.ExecutionEnv;
import java.util.List;
import java.io.PrintStream;
import java.io.InputStream;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ExecutionEnv}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ExecutionEnv} is a completely new class.
 * @since 9
 * @see ExecutionEnv
 */
public final class WhatIsNewInExecutionEnv
{
  /**
   * Example call to new method {@link ExecutionEnv#closeDown()}.
   * @since 9
   * @see ExecutionEnv#closeDown()
   */
  public void closeDown()
  {
    ExecutionEnv testee = $$$();

    testee.closeDown();
  }

  /**
   * Example call to new method {@link ExecutionEnv#extraRemoteVMOptions()}.
   * @since 9
   * @see ExecutionEnv#extraRemoteVMOptions()
   */
  public List<String> extraRemoteVMOptions()
  {
    ExecutionEnv testee = $$$();

    List<String> result = testee.extraRemoteVMOptions();
    return result;
  }

  /**
   * Example call to new method {@link ExecutionEnv#userOut()}.
   * @since 9
   * @see ExecutionEnv#userOut()
   */
  public PrintStream userOut()
  {
    ExecutionEnv testee = $$$();

    PrintStream result = testee.userOut();
    return result;
  }

  /**
   * Example call to new method {@link ExecutionEnv#userErr()}.
   * @since 9
   * @see ExecutionEnv#userErr()
   */
  public PrintStream userErr()
  {
    ExecutionEnv testee = $$$();

    PrintStream result = testee.userErr();
    return result;
  }

  /**
   * Example call to new method {@link ExecutionEnv#userIn()}.
   * @since 9
   * @see ExecutionEnv#userIn()
   */
  public InputStream userIn()
  {
    ExecutionEnv testee = $$$();

    InputStream result = testee.userIn();
    return result;
  }

  private ExecutionEnv $$$()
  {
    return null;
  }
}
