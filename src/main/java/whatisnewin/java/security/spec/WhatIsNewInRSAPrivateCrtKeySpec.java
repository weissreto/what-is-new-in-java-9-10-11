package whatisnewin.java.security.spec;

import java.security.spec.RSAPrivateCrtKeySpec;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link RSAPrivateCrtKeySpec}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link RSAPrivateCrtKeySpec} is an old class but has new fields, constructors or methods
 * @since 1.2
 * @see RSAPrivateCrtKeySpec
 */
public final class WhatIsNewInRSAPrivateCrtKeySpec
{
  /**
   * Example call to new constructor {@link RSAPrivateCrtKeySpec#RSAPrivateCrtKeySpec}
   * @since 11
   * @see RSAPrivateCrtKeySpec#RSAPrivateCrtKeySpec
   */
  public WhatIsNewInRSAPrivateCrtKeySpec(BigInteger modulus, BigInteger publicExponent, BigInteger privateExponent, BigInteger primeP, BigInteger primeQ, BigInteger primeExponentP, BigInteger primeExponentQ, BigInteger crtCoefficient, AlgorithmParameterSpec keyParams)
  {
    RSAPrivateCrtKeySpec testee = new RSAPrivateCrtKeySpec(modulus, publicExponent, privateExponent, primeP, primeQ, primeExponentP, primeExponentQ, crtCoefficient, keyParams);
  }

}