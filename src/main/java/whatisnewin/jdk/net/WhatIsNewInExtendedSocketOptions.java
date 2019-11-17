package whatisnewin.jdk.net;

import jdk.net.ExtendedSocketOptions;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ExtendedSocketOptions}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ExtendedSocketOptions} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see ExtendedSocketOptions
 */
public final class WhatIsNewInExtendedSocketOptions
{
  /**
   * Example usage of the new field {@link ExtendedSocketOptions#TCP_QUICKACK}.
   * @since 10
   * @see ExtendedSocketOptions#TCP_QUICKACK
   */
  public static final java.net.SocketOption<Boolean> TCP_QUICKACK = ExtendedSocketOptions.TCP_QUICKACK;

  /**
   * Example usage of the new field {@link ExtendedSocketOptions#TCP_KEEPIDLE}.
   * @since 11
   * @see ExtendedSocketOptions#TCP_KEEPIDLE
   */
  public static final java.net.SocketOption<Integer> TCP_KEEPIDLE = ExtendedSocketOptions.TCP_KEEPIDLE;

  /**
   * Example usage of the new field {@link ExtendedSocketOptions#TCP_KEEPINTERVAL}.
   * @since 11
   * @see ExtendedSocketOptions#TCP_KEEPINTERVAL
   */
  public static final java.net.SocketOption<Integer> TCP_KEEPINTERVAL = ExtendedSocketOptions.TCP_KEEPINTERVAL;

}
