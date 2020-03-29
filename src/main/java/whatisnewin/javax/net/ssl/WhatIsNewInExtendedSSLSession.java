package whatisnewin.javax.net.ssl;

import javax.net.ssl.ExtendedSSLSession;
import java.util.List;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ExtendedSSLSession}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ExtendedSSLSession} is an old class but has new fields, constructors or methods.
 * @since 1.7
 * @see ExtendedSSLSession
 */
public final class WhatIsNewInExtendedSSLSession
{
  /**
   * Example call to new method {@link ExtendedSSLSession#getStatusResponses()}.
   * @since 9
   * @see ExtendedSSLSession#getStatusResponses()
   */
  public List<byte[]> getStatusResponses()
  {
    ExtendedSSLSession testee = $$$();

    List<byte[]> result = testee.getStatusResponses();
    return result;
  }

  private ExtendedSSLSession $$$()
  {
    return null;
  }
}