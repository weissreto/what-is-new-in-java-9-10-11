package whatisnewin.jdk.jshell.execution;

import jdk.jshell.execution.RemoteExecutionControl;
import jdk.jshell.execution.LoaderDelegate;
import jdk.jshell.spi.ExecutionControl.ClassBytecodes;
import jdk.jshell.spi.ExecutionControl.ClassInstallException;
import jdk.jshell.spi.ExecutionControl.NotImplementedException;
import jdk.jshell.spi.ExecutionControl.EngineTerminationException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link RemoteExecutionControl}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link RemoteExecutionControl} is a completely new class
 * @since 9
 * @see RemoteExecutionControl
 */
public final class WhatIsNewInRemoteExecutionControl
{
  /**
   * Example call to new constructor {@link RemoteExecutionControl#RemoteExecutionControl}
   * @since 9
   * @see RemoteExecutionControl#RemoteExecutionControl
   */
  public WhatIsNewInRemoteExecutionControl(LoaderDelegate loaderDelegate)
  {
    RemoteExecutionControl testee = new RemoteExecutionControl(loaderDelegate);
  }

  /**
   * Example call to new constructor {@link RemoteExecutionControl#RemoteExecutionControl}
   * @since 9
   * @see RemoteExecutionControl#RemoteExecutionControl
   */
  public WhatIsNewInRemoteExecutionControl()
  {
    RemoteExecutionControl testee = new RemoteExecutionControl();
  }

  /**
   * Example call to new method {@link RemoteExecutionControl#main}
   * @since 9
   * @see RemoteExecutionControl#main
   */
  public static void main(String[] args) throws Exception
  {
    RemoteExecutionControl.main(args);
  }

  /**
   * Example call to new method {@link RemoteExecutionControl#redefine}
   * @since 9
   * @see RemoteExecutionControl#redefine
   */
  public void redefine(ClassBytecodes[] cbcs) throws ClassInstallException, NotImplementedException, EngineTerminationException
  {
    RemoteExecutionControl testee = $$$();

    testee.redefine(cbcs);
  }

  private RemoteExecutionControl $$$()
  {
    return null;
  }
}
