package whatisnewin.java.security;

import java.security.DrbgParameters.Reseed;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Reseed}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Reseed} is a completely new class.
 * @since 9
 * @see Reseed
 */
public final class WhatIsNewInDrbgParameters$Reseed
{
  /**
   * Example call to new method {@link Reseed#getPredictionResistance()}.
   * @since 9
   * @see Reseed#getPredictionResistance()
   */
  public boolean getPredictionResistance()
  {
    Reseed testee = $$$();

    boolean result = testee.getPredictionResistance();
    return result;
  }

  /**
   * Example call to new method {@link Reseed#getAdditionalInput()}.
   * @since 9
   * @see Reseed#getAdditionalInput()
   */
  public byte[] getAdditionalInput()
  {
    Reseed testee = $$$();

    byte[] result = testee.getAdditionalInput();
    return result;
  }

  private Reseed $$$()
  {
    return null;
  }
}
