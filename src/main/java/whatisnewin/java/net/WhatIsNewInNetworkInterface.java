package whatisnewin.java.net;

import java.net.NetworkInterface;
import java.util.stream.Stream;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link NetworkInterface}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link NetworkInterface} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see NetworkInterface
 */
public final class WhatIsNewInNetworkInterface
{
  /**
   * Example call to new method {@link NetworkInterface#inetAddresses}
   * @since 9
   * @see NetworkInterface#inetAddresses
   */
  public Stream<InetAddress> inetAddresses()
  {
    NetworkInterface testee = $$$();

    Stream<InetAddress> result = testee.inetAddresses();
    return result;
  }

  /**
   * Example call to new method {@link NetworkInterface#subInterfaces}
   * @since 9
   * @see NetworkInterface#subInterfaces
   */
  public Stream<NetworkInterface> subInterfaces()
  {
    NetworkInterface testee = $$$();

    Stream<NetworkInterface> result = testee.subInterfaces();
    return result;
  }

  /**
   * Example call to new method {@link NetworkInterface#networkInterfaces}
   * @since 9
   * @see NetworkInterface#networkInterfaces
   */
  public static Stream<NetworkInterface> networkInterfaces() throws SocketException
  {
    Stream<NetworkInterface> result = NetworkInterface.networkInterfaces();
    return result;
  }

  private NetworkInterface $$$()
  {
    return null;
  }
}
