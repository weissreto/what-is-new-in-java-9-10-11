package whatisnewin.jdk.nashorn.api.tree;

import jdk.nashorn.api.tree.Parser;
import jdk.nashorn.api.tree.CompilationUnitTree;
import java.io.File;
import jdk.nashorn.api.tree.DiagnosticListener;
import java.io.IOException;
import jdk.nashorn.api.scripting.NashornException;
import java.nio.file.Path;
import java.net.URL;
import java.io.Reader;
import jdk.nashorn.api.scripting.ScriptObjectMirror;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Parser}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Parser} is a completely new class
 * @since 9
 * @see Parser
 */
public final class WhatIsNewInParser
{
  /**
   * Example call to new method {@link Parser#parse}
   * @since 9
   * @see Parser#parse
   */
  public CompilationUnitTree parse(File file, DiagnosticListener listener) throws IOException, NashornException
  {
    Parser testee = $$$();

    CompilationUnitTree result = testee.parse(file, listener);
    return result;
  }

  /**
   * Example call to new method {@link Parser#parse}
   * @since 9
   * @see Parser#parse
   */
  public CompilationUnitTree parse(Path path, DiagnosticListener listener) throws IOException, NashornException
  {
    Parser testee = $$$();

    CompilationUnitTree result = testee.parse(path, listener);
    return result;
  }

  /**
   * Example call to new method {@link Parser#parse}
   * @since 9
   * @see Parser#parse
   */
  public CompilationUnitTree parse(URL url, DiagnosticListener listener) throws IOException, NashornException
  {
    Parser testee = $$$();

    CompilationUnitTree result = testee.parse(url, listener);
    return result;
  }

  /**
   * Example call to new method {@link Parser#parse}
   * @since 9
   * @see Parser#parse
   */
  public CompilationUnitTree parse(String name, Reader reader, DiagnosticListener listener) throws IOException, NashornException
  {
    Parser testee = $$$();

    CompilationUnitTree result = testee.parse(name, reader, listener);
    return result;
  }

  /**
   * Example call to new method {@link Parser#parse}
   * @since 9
   * @see Parser#parse
   */
  public CompilationUnitTree parse(String name, String code, DiagnosticListener listener) throws NashornException
  {
    Parser testee = $$$();

    CompilationUnitTree result = testee.parse(name, code, listener);
    return result;
  }

  /**
   * Example call to new method {@link Parser#parse}
   * @since 9
   * @see Parser#parse
   */
  public CompilationUnitTree parse(ScriptObjectMirror scriptObj, DiagnosticListener listener) throws NashornException
  {
    Parser testee = $$$();

    CompilationUnitTree result = testee.parse(scriptObj, listener);
    return result;
  }

  /**
   * Example call to new method {@link Parser#create}
   * @since 9
   * @see Parser#create
   */
  public static Parser create(String[] options) throws IllegalArgumentException
  {
    Parser result = Parser.create(options);
    return result;
  }

  private Parser $$$()
  {
    return null;
  }
}
