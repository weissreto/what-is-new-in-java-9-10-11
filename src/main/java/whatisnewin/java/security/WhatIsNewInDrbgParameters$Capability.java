package whatisnewin.java.security;

import java.security.DrbgParameters.Capability;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Capability}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Capability} is a completely new class
 * @since 9
 * @see Capability
 */
public final class WhatIsNewInDrbgParameters$Capability
{
  /**
   * Example usage of the new field {@link Capability#PR_AND_RESEED}
   * @since 9
   * @see Capability#PR_AND_RESEED
   */
  public static  final Capability PR_AND_RESEED = Capability.PR_AND_RESEED;

  /**
   * Example usage of the new field {@link Capability#RESEED_ONLY}
   * @since 9
   * @see Capability#RESEED_ONLY
   */
  public static  final Capability RESEED_ONLY = Capability.RESEED_ONLY;

  /**
   * Example usage of the new field {@link Capability#NONE}
   * @since 9
   * @see Capability#NONE
   */
  public static  final Capability NONE = Capability.NONE;

  /**
   * Example call to new method {@link Capability#values}
   * @since 9
   * @see Capability#values
   */
  public static Capability[] values()
  {
    Capability[] result = Capability.values();
    return result;
  }

  /**
   * Example call to new method {@link Capability#valueOf}
   * @since 9
   * @see Capability#valueOf
   */
  public static Capability valueOf(String name)
  {
    Capability result = Capability.valueOf(name);
    return result;
  }

  /**
   * Example call to new method {@link Capability#supportsReseeding}
   * @since 9
   * @see Capability#supportsReseeding
   */
  public boolean supportsReseeding()
  {
    Capability testee = $$$();

    boolean result = testee.supportsReseeding();
    return result;
  }

  /**
   * Example call to new method {@link Capability#supportsPredictionResistance}
   * @since 9
   * @see Capability#supportsPredictionResistance
   */
  public boolean supportsPredictionResistance()
  {
    Capability testee = $$$();

    boolean result = testee.supportsPredictionResistance();
    return result;
  }

  private Capability $$$()
  {
    return null;
  }
}
