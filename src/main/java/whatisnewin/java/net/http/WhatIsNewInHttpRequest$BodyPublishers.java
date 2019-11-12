package whatisnewin.java.net.http;

import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpRequest.BodyPublisher;
import java.util.concurrent.Flow.Publisher;
import java.nio.ByteBuffer;
import java.util.function.Supplier;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.io.FileNotFoundException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link BodyPublishers}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link BodyPublishers} is a completely new class
 * @since 11
 * @see BodyPublishers
 */
public final class WhatIsNewInHttpRequest$BodyPublishers
{
  /**
   * Example call to new method {@link BodyPublishers#fromPublisher}
   * @since 11
   * @see BodyPublishers#fromPublisher
   */
  public static BodyPublisher fromPublisher(Publisher<? extends ByteBuffer> publisher)
  {
    BodyPublisher result = BodyPublishers.fromPublisher(publisher);
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#fromPublisher}
   * @since 11
   * @see BodyPublishers#fromPublisher
   */
  public static BodyPublisher fromPublisher(Publisher<? extends ByteBuffer> publisher, long contentLength)
  {
    BodyPublisher result = BodyPublishers.fromPublisher(publisher, contentLength);
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#ofInputStream}
   * @since 11
   * @see BodyPublishers#ofInputStream
   */
  public static BodyPublisher ofInputStream(Supplier<? extends InputStream> streamSupplier)
  {
    BodyPublisher result = BodyPublishers.ofInputStream(streamSupplier);
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#ofString}
   * @since 11
   * @see BodyPublishers#ofString
   */
  public static BodyPublisher ofString(String body)
  {
    BodyPublisher result = BodyPublishers.ofString(body);
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#ofString}
   * @since 11
   * @see BodyPublishers#ofString
   */
  public static BodyPublisher ofString(String s, Charset charset)
  {
    BodyPublisher result = BodyPublishers.ofString(s, charset);
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#noBody}
   * @since 11
   * @see BodyPublishers#noBody
   */
  public static BodyPublisher noBody()
  {
    BodyPublisher result = BodyPublishers.noBody();
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#ofByteArray}
   * @since 11
   * @see BodyPublishers#ofByteArray
   */
  public static BodyPublisher ofByteArray(byte[] buf)
  {
    BodyPublisher result = BodyPublishers.ofByteArray(buf);
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#ofByteArray}
   * @since 11
   * @see BodyPublishers#ofByteArray
   */
  public static BodyPublisher ofByteArray(byte[] buf, int offset, int length)
  {
    BodyPublisher result = BodyPublishers.ofByteArray(buf, offset, length);
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#ofFile}
   * @since 11
   * @see BodyPublishers#ofFile
   */
  public static BodyPublisher ofFile(Path path) throws FileNotFoundException
  {
    BodyPublisher result = BodyPublishers.ofFile(path);
    return result;
  }

  /**
   * Example call to new method {@link BodyPublishers#ofByteArrays}
   * @since 11
   * @see BodyPublishers#ofByteArrays
   */
  public static BodyPublisher ofByteArrays(Iterable<byte[]> iter)
  {
    BodyPublisher result = BodyPublishers.ofByteArrays(iter);
    return result;
  }

}
