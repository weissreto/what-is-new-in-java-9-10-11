package whatisnewin.javax.net.ssl;

import javax.net.ssl.SSLEngine;
import java.util.function.BiFunction;
import java.util.List;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SSLEngine}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link SSLEngine} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see SSLEngine
 */
public final class WhatIsNewInSSLEngine
{
  /**
   * Example call to new method {@link SSLEngine#getHandshakeApplicationProtocol()}.
   * @since 9
   * @see SSLEngine#getHandshakeApplicationProtocol()
   */
  public String getHandshakeApplicationProtocol()
  {
    SSLEngine testee = $$$();

    String result = testee.getHandshakeApplicationProtocol();
    return result;
  }

  /**
   * Example call to new method {@link SSLEngine#getApplicationProtocol()}.
   * @since 9
   * @see SSLEngine#getApplicationProtocol()
   */
  public String getApplicationProtocol()
  {
    SSLEngine testee = $$$();

    String result = testee.getApplicationProtocol();
    return result;
  }

  /**
   * Example call to new method {@link SSLEngine#setHandshakeApplicationProtocolSelector(BiFunction)}.
   * @since 9
   * @see SSLEngine#setHandshakeApplicationProtocolSelector(BiFunction)
   */
  public void setHandshakeApplicationProtocolSelector(BiFunction<SSLEngine, List<String>, String> selector)
  {
    SSLEngine testee = $$$();

    testee.setHandshakeApplicationProtocolSelector(selector);
  }

  private SSLEngine $$$()
  {
    return null;
  }
}
