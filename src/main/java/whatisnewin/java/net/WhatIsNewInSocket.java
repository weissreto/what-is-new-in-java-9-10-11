package whatisnewin.java.net;

import java.net.Socket;
import java.net.SocketOption;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Socket}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Socket} is an old class but has new fields, constructors or methods.
 * @since 1.0
 * @see Socket
 */
public final class WhatIsNewInSocket
{
  /**
   * Example call to new method {@link Socket#setOption(SocketOption, Object)}.
   * @since 9
   * @see Socket#setOption(SocketOption, Object)
   */
  public <T> Socket setOption(SocketOption<T> name, T value) throws IOException
  {
    Socket testee = $$$();

    Socket result = testee.setOption(name, value);
    return result;
  }

  /**
   * Example call to new method {@link Socket#getOption(SocketOption)}.
   * @since 9
   * @see Socket#getOption(SocketOption)
   */
  public <T> T getOption(SocketOption<T> name) throws IOException
  {
    Socket testee = $$$();

    T result = testee.getOption(name);
    return result;
  }

  private Socket $$$()
  {
    return null;
  }
}
