package whatisnewin.java.security.spec;

import java.security.spec.PKCS8EncodedKeySpec;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link PKCS8EncodedKeySpec}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link PKCS8EncodedKeySpec} is an old class but has new fields, constructors or methods
 * @since 1.2
 * @see PKCS8EncodedKeySpec
 */
public final class WhatIsNewInPKCS8EncodedKeySpec
{
  /**
   * Example call to new constructor {@link PKCS8EncodedKeySpec#PKCS8EncodedKeySpec}
   * @since 9
   * @see PKCS8EncodedKeySpec#PKCS8EncodedKeySpec
   */
  public WhatIsNewInPKCS8EncodedKeySpec(byte[] encodedKey, String algorithm)
  {
    PKCS8EncodedKeySpec testee = new PKCS8EncodedKeySpec(encodedKey, algorithm);
  }

}