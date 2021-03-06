package whatisnewin.java.lang;

import java.util.List;
import java.io.IOException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ProcessBuilder}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ProcessBuilder} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see ProcessBuilder
 */
public final class WhatIsNewInProcessBuilder
{
  /**
   * Example call to new method {@link ProcessBuilder#startPipeline(List)}.
   * @since 9
   * @see ProcessBuilder#startPipeline(List)
   */
  public static List<Process> startPipeline(List<ProcessBuilder> builders) throws IOException
  {
    List<Process> result = ProcessBuilder.startPipeline(builders);
    return result;
  }

}
