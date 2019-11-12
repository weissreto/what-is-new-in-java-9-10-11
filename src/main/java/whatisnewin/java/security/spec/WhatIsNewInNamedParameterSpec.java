package whatisnewin.java.security.spec;

import java.security.spec.NamedParameterSpec;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link NamedParameterSpec}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link NamedParameterSpec} is a completely new class
 * @since 11
 * @see NamedParameterSpec
 */
public final class WhatIsNewInNamedParameterSpec
{
  /**
   * Example usage of the new field {@link NamedParameterSpec#X25519}
   * @since 11
   * @see NamedParameterSpec#X25519
   */
  public static  final NamedParameterSpec X25519 = NamedParameterSpec.X25519;

  /**
   * Example usage of the new field {@link NamedParameterSpec#X448}
   * @since 11
   * @see NamedParameterSpec#X448
   */
  public static  final NamedParameterSpec X448 = NamedParameterSpec.X448;

  /**
   * Example call to new constructor {@link NamedParameterSpec#NamedParameterSpec}
   * @since 11
   * @see NamedParameterSpec#NamedParameterSpec
   */
  public WhatIsNewInNamedParameterSpec(String stdName)
  {
    NamedParameterSpec testee = new NamedParameterSpec(stdName);
  }

  /**
   * Example call to new method {@link NamedParameterSpec#getName}
   * @since 11
   * @see NamedParameterSpec#getName
   */
  public String getName()
  {
    NamedParameterSpec testee = $$$();

    String result = testee.getName();
    return result;
  }

  private NamedParameterSpec $$$()
  {
    return null;
  }
}