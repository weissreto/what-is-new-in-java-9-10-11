package whatisnewin.jdk.jshell;

import jdk.jshell.JShell.Builder;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.function.Supplier;
import java.util.function.BiFunction;
import jdk.jshell.Snippet;
import jdk.jshell.spi.ExecutionControlProvider;
import java.util.Map;
import java.util.function.Function;
import javax.tools.StandardJavaFileManager;
import jdk.jshell.JShell;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Builder}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Builder} is a completely new class.
 * @since 9
 * @see Builder
 */
public final class WhatIsNewInJShell$Builder
{
  /**
   * Example call to new method {@link Builder#in(InputStream)}.
   * @since 9
   * @see Builder#in(InputStream)
   */
  public Builder in(InputStream in)
  {
    Builder testee = $$$();

    Builder result = testee.in(in);
    return result;
  }

  /**
   * Example call to new method {@link Builder#out(PrintStream)}.
   * @since 9
   * @see Builder#out(PrintStream)
   */
  public Builder out(PrintStream out)
  {
    Builder testee = $$$();

    Builder result = testee.out(out);
    return result;
  }

  /**
   * Example call to new method {@link Builder#err(PrintStream)}.
   * @since 9
   * @see Builder#err(PrintStream)
   */
  public Builder err(PrintStream err)
  {
    Builder testee = $$$();

    Builder result = testee.err(err);
    return result;
  }

  /**
   * Example call to new method {@link Builder#tempVariableNameGenerator(Supplier)}.
   * @since 9
   * @see Builder#tempVariableNameGenerator(Supplier)
   */
  public Builder tempVariableNameGenerator(Supplier<String> generator)
  {
    Builder testee = $$$();

    Builder result = testee.tempVariableNameGenerator(generator);
    return result;
  }

  /**
   * Example call to new method {@link Builder#idGenerator(BiFunction)}.
   * @since 9
   * @see Builder#idGenerator(BiFunction)
   */
  public Builder idGenerator(BiFunction<Snippet, Integer, String> generator)
  {
    Builder testee = $$$();

    Builder result = testee.idGenerator(generator);
    return result;
  }

  /**
   * Example call to new method {@link Builder#remoteVMOptions(String...)}.
   * @since 9
   * @see Builder#remoteVMOptions(String...)
   */
  public Builder remoteVMOptions(String... options)
  {
    Builder testee = $$$();

    Builder result = testee.remoteVMOptions(options);
    return result;
  }

  /**
   * Example call to new method {@link Builder#compilerOptions(String...)}.
   * @since 9
   * @see Builder#compilerOptions(String...)
   */
  public Builder compilerOptions(String... options)
  {
    Builder testee = $$$();

    Builder result = testee.compilerOptions(options);
    return result;
  }

  /**
   * Example call to new method {@link Builder#executionEngine(String)}.
   * @since 9
   * @see Builder#executionEngine(String)
   */
  public Builder executionEngine(String executionControlSpec)
  {
    Builder testee = $$$();

    Builder result = testee.executionEngine(executionControlSpec);
    return result;
  }

  /**
   * Example call to new method {@link Builder#executionEngine(ExecutionControlProvider, Map)}.
   * @since 9
   * @see Builder#executionEngine(ExecutionControlProvider, Map)
   */
  public Builder executionEngine(ExecutionControlProvider executionControlProvider, Map<String, String> executionControlParameters)
  {
    Builder testee = $$$();

    Builder result = testee.executionEngine(executionControlProvider, executionControlParameters);
    return result;
  }

  /**
   * Example call to new method {@link Builder#fileManager(Function)}.
   * @since 9
   * @see Builder#fileManager(Function)
   */
  public Builder fileManager(Function<StandardJavaFileManager, StandardJavaFileManager> mapping)
  {
    Builder testee = $$$();

    Builder result = testee.fileManager(mapping);
    return result;
  }

  /**
   * Example call to new method {@link Builder#build()}.
   * @since 9
   * @see Builder#build()
   */
  public JShell build() throws IllegalStateException
  {
    Builder testee = $$$();

    JShell result = testee.build();
    return result;
  }

  private Builder $$$()
  {
    return null;
  }
}
