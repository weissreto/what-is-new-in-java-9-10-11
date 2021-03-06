package whatisnewin.jdk.jshell.execution;

import jdk.jshell.execution.StreamingExecutionControl;
import java.io.ObjectOutput;
import java.io.ObjectInput;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link StreamingExecutionControl}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link StreamingExecutionControl} is a completely new class.
 * @since 9
 * @see StreamingExecutionControl
 */
public final class WhatIsNewInStreamingExecutionControl
{
  /**
   * Example call to new constructor {@link StreamingExecutionControl#StreamingExecutionControl(ObjectOutput, ObjectInput)}.
   * @since 9
   * @see StreamingExecutionControl#StreamingExecutionControl(ObjectOutput, ObjectInput)
   */
  public WhatIsNewInStreamingExecutionControl(ObjectOutput out, ObjectInput in)
  {
    StreamingExecutionControl testee = new StreamingExecutionControl(out, in);
  }

  /**
   * Example call to new method {@link StreamingExecutionControl#close()}.
   * @since 9
   * @see StreamingExecutionControl#close()
   */
  public void close()
  {
    StreamingExecutionControl testee = $$$();

    testee.close();
  }

  private StreamingExecutionControl $$$()
  {
    return null;
  }
}
