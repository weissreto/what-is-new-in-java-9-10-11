package whatisnewin.jdk.jshell.execution;

import jdk.jshell.execution.DirectExecutionControl;
import jdk.jshell.execution.LoaderDelegate;
import jdk.jshell.spi.ExecutionControl.EngineTerminationException;
import jdk.jshell.spi.ExecutionControl.InternalException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link DirectExecutionControl}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link DirectExecutionControl} is a completely new class
 * @since 9
 * @see DirectExecutionControl
 */
public final class WhatIsNewInDirectExecutionControl
{
  /**
   * Example call to new constructor {@link DirectExecutionControl#DirectExecutionControl}
   * @since 9
   * @see DirectExecutionControl#DirectExecutionControl
   */
  public WhatIsNewInDirectExecutionControl(LoaderDelegate loaderDelegate)
  {
    DirectExecutionControl testee = new DirectExecutionControl(loaderDelegate);
  }

  /**
   * Example call to new constructor {@link DirectExecutionControl#DirectExecutionControl}
   * @since 9
   * @see DirectExecutionControl#DirectExecutionControl
   */
  public WhatIsNewInDirectExecutionControl()
  {
    DirectExecutionControl testee = new DirectExecutionControl();
  }

  /**
   * Example call to new method {@link DirectExecutionControl#stop}
   * @since 9
   * @see DirectExecutionControl#stop
   */
  public void stop() throws EngineTerminationException, InternalException
  {
    DirectExecutionControl testee = $$$();

    testee.stop();
  }

  private DirectExecutionControl $$$()
  {
    return null;
  }
}