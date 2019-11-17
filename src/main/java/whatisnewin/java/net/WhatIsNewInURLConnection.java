package whatisnewin.java.net;

import java.net.URLConnection;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link URLConnection}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link URLConnection} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see URLConnection
 */
public final class WhatIsNewInURLConnection
{
  /**
   * Example call to new method {@link URLConnection#setDefaultUseCaches(String, boolean)}.
   * @since 9
   * @see URLConnection#setDefaultUseCaches(String, boolean)
   */
  public static void setDefaultUseCaches(String protocol, boolean defaultVal)
  {
    URLConnection.setDefaultUseCaches(protocol, defaultVal);
  }

  /**
   * Example call to new method {@link URLConnection#getDefaultUseCaches(String)}.
   * @since 9
   * @see URLConnection#getDefaultUseCaches(String)
   */
  public static boolean getDefaultUseCaches(String protocol)
  {
    boolean result = URLConnection.getDefaultUseCaches(protocol);
    return result;
  }

}
