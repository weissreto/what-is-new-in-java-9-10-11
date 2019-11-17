package whatisnewin.java.security;

import java.security.DrbgParameters.Instantiation;
import java.security.DrbgParameters.Capability;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Instantiation}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Instantiation} is a completely new class.
 * @since 9
 * @see Instantiation
 */
public final class WhatIsNewInDrbgParameters$Instantiation
{
  /**
   * Example call to new method {@link Instantiation#getStrength()}.
   * @since 9
   * @see Instantiation#getStrength()
   */
  public int getStrength()
  {
    Instantiation testee = $$$();

    int result = testee.getStrength();
    return result;
  }

  /**
   * Example call to new method {@link Instantiation#getCapability()}.
   * @since 9
   * @see Instantiation#getCapability()
   */
  public Capability getCapability()
  {
    Instantiation testee = $$$();

    Capability result = testee.getCapability();
    return result;
  }

  /**
   * Example call to new method {@link Instantiation#getPersonalizationString()}.
   * @since 9
   * @see Instantiation#getPersonalizationString()
   */
  public byte[] getPersonalizationString()
  {
    Instantiation testee = $$$();

    byte[] result = testee.getPersonalizationString();
    return result;
  }

  private Instantiation $$$()
  {
    return null;
  }
}
