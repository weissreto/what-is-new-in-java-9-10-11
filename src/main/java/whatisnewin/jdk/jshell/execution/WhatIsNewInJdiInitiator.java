package whatisnewin.jdk.jshell.execution;

import jdk.jshell.execution.JdiInitiator;
import java.util.List;
import java.util.Map;
import com.sun.jdi.VirtualMachine;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link JdiInitiator}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link JdiInitiator} is a completely new class
 * @since 9
 * @see JdiInitiator
 */
public final class WhatIsNewInJdiInitiator
{
  /**
   * Example call to new constructor {@link JdiInitiator#JdiInitiator}
   * @since 9
   * @see JdiInitiator#JdiInitiator
   */
  public WhatIsNewInJdiInitiator(int port, List<String> remoteVMOptions, String remoteAgent, boolean isLaunch, String host, int timeout, Map<String, String> customConnectorArgs)
  {
    JdiInitiator testee = new JdiInitiator(port, remoteVMOptions, remoteAgent, isLaunch, host, timeout, customConnectorArgs);
  }

  /**
   * Example call to new method {@link JdiInitiator#process}
   * @since 9
   * @see JdiInitiator#process
   */
  public Process process()
  {
    JdiInitiator testee = $$$();

    Process result = testee.process();
    return result;
  }

  /**
   * Example call to new method {@link JdiInitiator#vm}
   * @since 9
   * @see JdiInitiator#vm
   */
  public VirtualMachine vm()
  {
    JdiInitiator testee = $$$();

    VirtualMachine result = testee.vm();
    return result;
  }

  private JdiInitiator $$$()
  {
    return null;
  }
}