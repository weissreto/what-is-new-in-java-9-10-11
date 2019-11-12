package whatisnewin.java.util.logging;

import java.util.logging.FileHandler;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link FileHandler}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link FileHandler} is an old class but has new fields, constructors or methods
 * @since 1.4
 * @see FileHandler
 */
public final class WhatIsNewInFileHandler
{
  /**
   * Example call to new constructor {@link FileHandler#FileHandler}
   * @since 9
   * @see FileHandler#FileHandler
   */
  public WhatIsNewInFileHandler(String pattern, long limit, int count, boolean append) throws IOException
  {
    FileHandler testee = new FileHandler(pattern, limit, count, append);
  }

}
