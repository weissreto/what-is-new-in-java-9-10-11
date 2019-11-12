package whatisnewin.java.security.spec;

import java.security.spec.RSAMultiPrimePrivateCrtKeySpec;
import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;
import java.security.spec.AlgorithmParameterSpec;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link RSAMultiPrimePrivateCrtKeySpec}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link RSAMultiPrimePrivateCrtKeySpec} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see RSAMultiPrimePrivateCrtKeySpec
 */
public final class WhatIsNewInRSAMultiPrimePrivateCrtKeySpec
{
  /**
   * Example call to new constructor {@link RSAMultiPrimePrivateCrtKeySpec#RSAMultiPrimePrivateCrtKeySpec}
   * @since 11
   * @see RSAMultiPrimePrivateCrtKeySpec#RSAMultiPrimePrivateCrtKeySpec
   */
  public WhatIsNewInRSAMultiPrimePrivateCrtKeySpec(BigInteger modulus, BigInteger publicExponent, BigInteger privateExponent, BigInteger primeP, BigInteger primeQ, BigInteger primeExponentP, BigInteger primeExponentQ, BigInteger crtCoefficient, RSAOtherPrimeInfo[] otherPrimeInfo, AlgorithmParameterSpec keyParams)
  {
    RSAMultiPrimePrivateCrtKeySpec testee = new RSAMultiPrimePrivateCrtKeySpec(modulus, publicExponent, privateExponent, primeP, primeQ, primeExponentP, primeExponentQ, crtCoefficient, otherPrimeInfo, keyParams);
  }

}
