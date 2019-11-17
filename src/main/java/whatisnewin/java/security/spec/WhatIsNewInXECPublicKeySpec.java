package whatisnewin.java.security.spec;

import java.security.spec.XECPublicKeySpec;
import java.security.spec.AlgorithmParameterSpec;
import java.math.BigInteger;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link XECPublicKeySpec}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link XECPublicKeySpec} is a completely new class.
 * @since 11
 * @see XECPublicKeySpec
 */
public final class WhatIsNewInXECPublicKeySpec
{
  /**
   * Example call to new constructor {@link XECPublicKeySpec#XECPublicKeySpec(AlgorithmParameterSpec, BigInteger)}.
   * @since 11
   * @see XECPublicKeySpec#XECPublicKeySpec(AlgorithmParameterSpec, BigInteger)
   */
  public WhatIsNewInXECPublicKeySpec(AlgorithmParameterSpec params, BigInteger u)
  {
    XECPublicKeySpec testee = new XECPublicKeySpec(params, u);
  }

  /**
   * Example call to new method {@link XECPublicKeySpec#getU()}.
   * @since 11
   * @see XECPublicKeySpec#getU()
   */
  public BigInteger getU()
  {
    XECPublicKeySpec testee = $$$();

    BigInteger result = testee.getU();
    return result;
  }

  /**
   * Example call to new method {@link XECPublicKeySpec#getParams()}.
   * @since 11
   * @see XECPublicKeySpec#getParams()
   */
  public AlgorithmParameterSpec getParams()
  {
    XECPublicKeySpec testee = $$$();

    AlgorithmParameterSpec result = testee.getParams();
    return result;
  }

  private XECPublicKeySpec $$$()
  {
    return null;
  }
}
