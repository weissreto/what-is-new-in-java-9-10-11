package whatisnewin.java.math;

import java.math.BigInteger;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link BigInteger}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link BigInteger} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see BigInteger
 */
public final class WhatIsNewInBigInteger
{
  /**
   * Example usage of the new field {@link BigInteger#TWO}.
   * @since 9
   * @see BigInteger#TWO
   */
  public static final BigInteger TWO = BigInteger.TWO;

  /**
   * Example call to new constructor {@link BigInteger#BigInteger(byte[], int, int)}.
   * @since 9
   * @see BigInteger#BigInteger(byte[], int, int)
   */
  public WhatIsNewInBigInteger(byte[] val, int off, int len)
  {
    BigInteger testee = new BigInteger(val, off, len);
  }

  /**
   * Example call to new constructor {@link BigInteger#BigInteger(int, byte[], int, int)}.
   * @since 9
   * @see BigInteger#BigInteger(int, byte[], int, int)
   */
  public WhatIsNewInBigInteger(int signum, byte[] magnitude, int off, int len)
  {
    BigInteger testee = new BigInteger(signum, magnitude, off, len);
  }

  /**
   * Example call to new method {@link BigInteger#sqrt()}.
   * @since 9
   * @see BigInteger#sqrt()
   */
  public BigInteger sqrt()
  {
    BigInteger testee = $$$();

    BigInteger result = testee.sqrt();
    return result;
  }

  /**
   * Example call to new method {@link BigInteger#sqrtAndRemainder()}.
   * @since 9
   * @see BigInteger#sqrtAndRemainder()
   */
  public BigInteger[] sqrtAndRemainder()
  {
    BigInteger testee = $$$();

    BigInteger[] result = testee.sqrtAndRemainder();
    return result;
  }

  private BigInteger $$$()
  {
    return null;
  }
}
