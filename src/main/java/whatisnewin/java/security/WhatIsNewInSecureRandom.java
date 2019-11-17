package whatisnewin.java.security;

import java.security.SecureRandom;
import java.security.SecureRandomParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SecureRandom}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link SecureRandom} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see SecureRandom
 */
public final class WhatIsNewInSecureRandom
{
  /**
   * Example call to new method {@link SecureRandom#getParameters()}.
   * @since 9
   * @see SecureRandom#getParameters()
   */
  public SecureRandomParameters getParameters()
  {
    SecureRandom testee = $$$();

    SecureRandomParameters result = testee.getParameters();
    return result;
  }

  /**
   * Example call to new method {@link SecureRandom#reseed()}.
   * @since 9
   * @see SecureRandom#reseed()
   */
  public void reseed()
  {
    SecureRandom testee = $$$();

    testee.reseed();
  }

  /**
   * Example call to new method {@link SecureRandom#getInstance(String, SecureRandomParameters)}.
   * @since 9
   * @see SecureRandom#getInstance(String, SecureRandomParameters)
   */
  public static SecureRandom getInstance(String algorithm, SecureRandomParameters params) throws NoSuchAlgorithmException
  {
    SecureRandom result = SecureRandom.getInstance(algorithm, params);
    return result;
  }

  /**
   * Example call to new method {@link SecureRandom#getInstance(String, SecureRandomParameters, String)}.
   * @since 9
   * @see SecureRandom#getInstance(String, SecureRandomParameters, String)
   */
  public static SecureRandom getInstance(String algorithm, SecureRandomParameters params, String provider) throws NoSuchAlgorithmException, NoSuchProviderException
  {
    SecureRandom result = SecureRandom.getInstance(algorithm, params, provider);
    return result;
  }

  /**
   * Example call to new method {@link SecureRandom#getInstance(String, SecureRandomParameters, Provider)}.
   * @since 9
   * @see SecureRandom#getInstance(String, SecureRandomParameters, Provider)
   */
  public static SecureRandom getInstance(String algorithm, SecureRandomParameters params, Provider provider) throws NoSuchAlgorithmException
  {
    SecureRandom result = SecureRandom.getInstance(algorithm, params, provider);
    return result;
  }

  /**
   * Example call to new method {@link SecureRandom#nextBytes(byte[], SecureRandomParameters)}.
   * @since 9
   * @see SecureRandom#nextBytes(byte[], SecureRandomParameters)
   */
  public void nextBytes(byte[] bytes, SecureRandomParameters params)
  {
    SecureRandom testee = $$$();

    testee.nextBytes(bytes, params);
  }

  private SecureRandom $$$()
  {
    return null;
  }
}
