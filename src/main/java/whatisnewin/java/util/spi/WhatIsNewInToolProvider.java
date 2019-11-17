package whatisnewin.java.util.spi;

import java.util.spi.ToolProvider;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Optional;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ToolProvider}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ToolProvider} is a completely new class.
 * @since 9
 * @see ToolProvider
 */
public final class WhatIsNewInToolProvider
{
  /**
   * Example call to new method {@link ToolProvider#name()}.
   * @since 9
   * @see ToolProvider#name()
   */
  public String name()
  {
    ToolProvider testee = $$$();

    String result = testee.name();
    return result;
  }

  /**
   * Example call to new method {@link ToolProvider#run(PrintWriter, PrintWriter, String...)}.
   * @since 9
   * @see ToolProvider#run(PrintWriter, PrintWriter, String...)
   */
  public int run(PrintWriter out, PrintWriter err, String... args)
  {
    ToolProvider testee = $$$();

    int result = testee.run(out, err, args);
    return result;
  }

  /**
   * Example call to new method {@link ToolProvider#run(PrintStream, PrintStream, String...)}.
   * @since 9
   * @see ToolProvider#run(PrintStream, PrintStream, String...)
   */
  public int run(PrintStream out, PrintStream err, String... args)
  {
    ToolProvider testee = $$$();

    int result = testee.run(out, err, args);
    return result;
  }

  /**
   * Example call to new method {@link ToolProvider#findFirst(String)}.
   * @since 9
   * @see ToolProvider#findFirst(String)
   */
  public static Optional<ToolProvider> findFirst(String name)
  {
    Optional<ToolProvider> result = ToolProvider.findFirst(name);
    return result;
  }

  private ToolProvider $$$()
  {
    return null;
  }
}
