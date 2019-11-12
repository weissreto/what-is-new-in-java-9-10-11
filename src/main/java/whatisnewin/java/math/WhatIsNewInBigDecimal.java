package whatisnewin.java.math;

import java.math.BigDecimal;
import java.math.MathContext;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link BigDecimal}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link BigDecimal} is an old class but has new fields, constructors or methods
 * @since 1.1
 * @see BigDecimal
 */
public final class WhatIsNewInBigDecimal
{
  /**
   * Example call to new method {@link BigDecimal#sqrt}
   * @since 9
   * @see BigDecimal#sqrt
   */
  public BigDecimal sqrt(MathContext mc)
  {
    BigDecimal testee = $$$();

    BigDecimal result = testee.sqrt(mc);
    return result;
  }

  private BigDecimal $$$()
  {
    return null;
  }
}