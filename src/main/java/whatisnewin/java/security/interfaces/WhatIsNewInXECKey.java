package whatisnewin.java.security.interfaces;

import java.security.interfaces.XECKey;
import java.security.spec.AlgorithmParameterSpec;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link XECKey}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link XECKey} is a completely new class
 * @since 11
 * @see XECKey
 */
public final class WhatIsNewInXECKey
{
  /**
   * Example call to new method {@link XECKey#getParams}
   * @since 11
   * @see XECKey#getParams
   */
  public AlgorithmParameterSpec getParams()
  {
    XECKey testee = $$$();

    AlgorithmParameterSpec result = testee.getParams();
    return result;
  }

  private XECKey $$$()
  {
    return null;
  }
}