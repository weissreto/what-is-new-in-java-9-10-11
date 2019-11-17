package whatisnewin.jdk.security.jarsigner;

import jdk.security.jarsigner.JarSigner;
import java.util.zip.ZipFile;
import java.io.OutputStream;
import java.net.URI;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link JarSigner}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link JarSigner} is a completely new class.
 * @since 9
 * @see JarSigner
 */
public final class WhatIsNewInJarSigner
{
  /**
   * Example call to new method {@link JarSigner#sign(ZipFile, OutputStream)}.
   * @since 9
   * @see JarSigner#sign(ZipFile, OutputStream)
   */
  public void sign(ZipFile file, OutputStream os)
  {
    JarSigner testee = $$$();

    testee.sign(file, os);
  }

  /**
   * Example call to new method {@link JarSigner#getDigestAlgorithm()}.
   * @since 9
   * @see JarSigner#getDigestAlgorithm()
   */
  public String getDigestAlgorithm()
  {
    JarSigner testee = $$$();

    String result = testee.getDigestAlgorithm();
    return result;
  }

  /**
   * Example call to new method {@link JarSigner#getSignatureAlgorithm()}.
   * @since 9
   * @see JarSigner#getSignatureAlgorithm()
   */
  public String getSignatureAlgorithm()
  {
    JarSigner testee = $$$();

    String result = testee.getSignatureAlgorithm();
    return result;
  }

  /**
   * Example call to new method {@link JarSigner#getTsa()}.
   * @since 9
   * @see JarSigner#getTsa()
   */
  public URI getTsa()
  {
    JarSigner testee = $$$();

    URI result = testee.getTsa();
    return result;
  }

  /**
   * Example call to new method {@link JarSigner#getSignerName()}.
   * @since 9
   * @see JarSigner#getSignerName()
   */
  public String getSignerName()
  {
    JarSigner testee = $$$();

    String result = testee.getSignerName();
    return result;
  }

  /**
   * Example call to new method {@link JarSigner#getProperty(String)}.
   * @since 9
   * @see JarSigner#getProperty(String)
   */
  public String getProperty(String key)
  {
    JarSigner testee = $$$();

    String result = testee.getProperty(key);
    return result;
  }

  private JarSigner $$$()
  {
    return null;
  }
}
