package whatisnewin.java.nio.file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.OpenOption;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Files}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Files} is an old class but has new fields, constructors or methods.
 * @since 1.7
 * @see Files
 */
public final class WhatIsNewInFiles
{
  /**
   * Example call to new method {@link Files#readString(Path)}.
   * @since 11
   * @see Files#readString(Path)
   */
  public static String readString(Path path) throws IOException
  {
    String result = Files.readString(path);
    return result;
  }

  /**
   * Example call to new method {@link Files#readString(Path, Charset)}.
   * @since 11
   * @see Files#readString(Path, Charset)
   */
  public static String readString(Path path, Charset cs) throws IOException
  {
    String result = Files.readString(path, cs);
    return result;
  }

  /**
   * Example call to new method {@link Files#writeString(Path, CharSequence, OpenOption...)}.
   * @since 11
   * @see Files#writeString(Path, CharSequence, OpenOption...)
   */
  public static Path writeString(Path path, CharSequence csq, OpenOption... options) throws IOException
  {
    Path result = Files.writeString(path, csq, options);
    return result;
  }

  /**
   * Example call to new method {@link Files#writeString(Path, CharSequence, Charset, OpenOption...)}.
   * @since 11
   * @see Files#writeString(Path, CharSequence, Charset, OpenOption...)
   */
  public static Path writeString(Path path, CharSequence csq, Charset cs, OpenOption... options) throws IOException
  {
    Path result = Files.writeString(path, csq, cs, options);
    return result;
  }

}
