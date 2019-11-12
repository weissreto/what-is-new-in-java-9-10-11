package whatisnewin.jdk.security.jarsigner;

import jdk.security.jarsigner.JarSigner.Builder;
import java.security.KeyStore.PrivateKeyEntry;
import java.security.PrivateKey;
import java.security.cert.CertPath;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.function.BiConsumer;
import java.net.URI;
import jdk.security.jarsigner.JarSigner;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Builder}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Builder} is a completely new class
 * @since 9
 * @see Builder
 */
public final class WhatIsNewInJarSigner$Builder
{
  /**
   * Example call to new constructor {@link Builder#Builder}
   * @since 9
   * @see Builder#Builder
   */
  public WhatIsNewInJarSigner$Builder(PrivateKeyEntry entry)
  {
    Builder testee = new Builder(entry);
  }

  /**
   * Example call to new constructor {@link Builder#Builder}
   * @since 9
   * @see Builder#Builder
   */
  public WhatIsNewInJarSigner$Builder(PrivateKey privateKey, CertPath certPath)
  {
    Builder testee = new Builder(privateKey, certPath);
  }

  /**
   * Example call to new method {@link Builder#digestAlgorithm}
   * @since 9
   * @see Builder#digestAlgorithm
   */
  public Builder digestAlgorithm(String algorithm) throws NoSuchAlgorithmException
  {
    Builder testee = $$$();

    Builder result = testee.digestAlgorithm(algorithm);
    return result;
  }

  /**
   * Example call to new method {@link Builder#digestAlgorithm}
   * @since 9
   * @see Builder#digestAlgorithm
   */
  public Builder digestAlgorithm(String algorithm, Provider provider) throws NoSuchAlgorithmException
  {
    Builder testee = $$$();

    Builder result = testee.digestAlgorithm(algorithm, provider);
    return result;
  }

  /**
   * Example call to new method {@link Builder#signerName}
   * @since 9
   * @see Builder#signerName
   */
  public Builder signerName(String name)
  {
    Builder testee = $$$();

    Builder result = testee.signerName(name);
    return result;
  }

  /**
   * Example call to new method {@link Builder#signatureAlgorithm}
   * @since 9
   * @see Builder#signatureAlgorithm
   */
  public Builder signatureAlgorithm(String algorithm) throws NoSuchAlgorithmException
  {
    Builder testee = $$$();

    Builder result = testee.signatureAlgorithm(algorithm);
    return result;
  }

  /**
   * Example call to new method {@link Builder#signatureAlgorithm}
   * @since 9
   * @see Builder#signatureAlgorithm
   */
  public Builder signatureAlgorithm(String algorithm, Provider provider) throws NoSuchAlgorithmException
  {
    Builder testee = $$$();

    Builder result = testee.signatureAlgorithm(algorithm, provider);
    return result;
  }

  /**
   * Example call to new method {@link Builder#eventHandler}
   * @since 9
   * @see Builder#eventHandler
   */
  public Builder eventHandler(BiConsumer<String, String> handler)
  {
    Builder testee = $$$();

    Builder result = testee.eventHandler(handler);
    return result;
  }

  /**
   * Example call to new method {@link Builder#tsa}
   * @since 9
   * @see Builder#tsa
   */
  public Builder tsa(URI uri)
  {
    Builder testee = $$$();

    Builder result = testee.tsa(uri);
    return result;
  }

  /**
   * Example call to new method {@link Builder#getDefaultSignatureAlgorithm}
   * @since 9
   * @see Builder#getDefaultSignatureAlgorithm
   */
  public static String getDefaultSignatureAlgorithm(PrivateKey key)
  {
    String result = Builder.getDefaultSignatureAlgorithm(key);
    return result;
  }

  /**
   * Example call to new method {@link Builder#getDefaultDigestAlgorithm}
   * @since 9
   * @see Builder#getDefaultDigestAlgorithm
   */
  public static String getDefaultDigestAlgorithm()
  {
    String result = Builder.getDefaultDigestAlgorithm();
    return result;
  }

  /**
   * Example call to new method {@link Builder#setProperty}
   * @since 9
   * @see Builder#setProperty
   */
  public Builder setProperty(String key, String value)
  {
    Builder testee = $$$();

    Builder result = testee.setProperty(key, value);
    return result;
  }

  /**
   * Example call to new method {@link Builder#build}
   * @since 9
   * @see Builder#build
   */
  public JarSigner build()
  {
    Builder testee = $$$();

    JarSigner result = testee.build();
    return result;
  }

  private Builder $$$()
  {
    return null;
  }
}
