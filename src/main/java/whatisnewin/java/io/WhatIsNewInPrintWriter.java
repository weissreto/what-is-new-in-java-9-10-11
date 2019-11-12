package whatisnewin.java.io;

import java.io.PrintWriter;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.io.IOException;
import java.io.File;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link PrintWriter}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link PrintWriter} is an old class but has new fields, constructors or methods
 * @since 1.1
 * @see PrintWriter
 */
public final class WhatIsNewInPrintWriter
{
  /**
   * Example call to new constructor {@link PrintWriter#PrintWriter}
   * @since 10
   * @see PrintWriter#PrintWriter
   */
  public WhatIsNewInPrintWriter(OutputStream out, boolean autoFlush, Charset charset)
  {
    PrintWriter testee = new PrintWriter(out, autoFlush, charset);
  }

  /**
   * Example call to new constructor {@link PrintWriter#PrintWriter}
   * @since 10
   * @see PrintWriter#PrintWriter
   */
  public WhatIsNewInPrintWriter(String fileName, Charset charset) throws IOException
  {
    PrintWriter testee = new PrintWriter(fileName, charset);
  }

  /**
   * Example call to new constructor {@link PrintWriter#PrintWriter}
   * @since 10
   * @see PrintWriter#PrintWriter
   */
  public WhatIsNewInPrintWriter(File file, Charset charset) throws IOException
  {
    PrintWriter testee = new PrintWriter(file, charset);
  }

}
