package whatisnewin.jdk.jshell;

import jdk.jshell.JShell;
import java.util.stream.Stream;
import jdk.jshell.DeclarationSnippet;
import jdk.jshell.MethodSnippet;
import java.util.List;
import jdk.jshell.SnippetEvent;
import jdk.jshell.Snippet;
import jdk.jshell.VarSnippet;
import jdk.jshell.TypeDeclSnippet;
import jdk.jshell.ImportSnippet;
import jdk.jshell.SourceCodeAnalysis;
import jdk.jshell.JShell.Subscription;
import java.util.function.Consumer;
import jdk.jshell.Diag;
import jdk.jshell.Snippet.Status;
import jdk.jshell.JShell.Builder;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link JShell}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link JShell} is a completely new class.
 * @since 9
 * @see JShell
 */
public final class WhatIsNewInJShell
{
  /**
   * Example call to new method {@link JShell#unresolvedDependencies(DeclarationSnippet)}.
   * @since 9
   * @see JShell#unresolvedDependencies(DeclarationSnippet)
   */
  public Stream<String> unresolvedDependencies(DeclarationSnippet snippet)
  {
    JShell testee = $$$();

    Stream<String> result = testee.unresolvedDependencies(snippet);
    return result;
  }

  /**
   * Example call to new method {@link JShell#methods()}.
   * @since 9
   * @see JShell#methods()
   */
  public Stream<MethodSnippet> methods()
  {
    JShell testee = $$$();

    Stream<MethodSnippet> result = testee.methods();
    return result;
  }

  /**
   * Example call to new method {@link JShell#drop(Snippet)}.
   * @since 9
   * @see JShell#drop(Snippet)
   */
  public List<SnippetEvent> drop(Snippet snippet) throws IllegalStateException
  {
    JShell testee = $$$();

    List<SnippetEvent> result = testee.drop(snippet);
    return result;
  }

  /**
   * Example call to new method {@link JShell#variables()}.
   * @since 9
   * @see JShell#variables()
   */
  public Stream<VarSnippet> variables()
  {
    JShell testee = $$$();

    Stream<VarSnippet> result = testee.variables();
    return result;
  }

  /**
   * Example call to new method {@link JShell#types()}.
   * @since 9
   * @see JShell#types()
   */
  public Stream<TypeDeclSnippet> types()
  {
    JShell testee = $$$();

    Stream<TypeDeclSnippet> result = testee.types();
    return result;
  }

  /**
   * Example call to new method {@link JShell#imports()}.
   * @since 9
   * @see JShell#imports()
   */
  public Stream<ImportSnippet> imports()
  {
    JShell testee = $$$();

    Stream<ImportSnippet> result = testee.imports();
    return result;
  }

  /**
   * Example call to new method {@link JShell#sourceCodeAnalysis()}.
   * @since 9
   * @see JShell#sourceCodeAnalysis()
   */
  public SourceCodeAnalysis sourceCodeAnalysis()
  {
    JShell testee = $$$();

    SourceCodeAnalysis result = testee.sourceCodeAnalysis();
    return result;
  }

  /**
   * Example call to new method {@link JShell#onSnippetEvent(Consumer)}.
   * @since 9
   * @see JShell#onSnippetEvent(Consumer)
   */
  public Subscription onSnippetEvent(Consumer<SnippetEvent> listener) throws IllegalStateException
  {
    JShell testee = $$$();

    Subscription result = testee.onSnippetEvent(listener);
    return result;
  }

  /**
   * Example call to new method {@link JShell#addToClasspath(String)}.
   * @since 9
   * @see JShell#addToClasspath(String)
   */
  public void addToClasspath(String path)
  {
    JShell testee = $$$();

    testee.addToClasspath(path);
  }

  /**
   * Example call to new method {@link JShell#stop()}.
   * @since 9
   * @see JShell#stop()
   */
  public void stop()
  {
    JShell testee = $$$();

    testee.stop();
  }

  /**
   * Example call to new method {@link JShell#unsubscribe(Subscription)}.
   * @since 9
   * @see JShell#unsubscribe(Subscription)
   */
  public void unsubscribe(Subscription token)
  {
    JShell testee = $$$();

    testee.unsubscribe(token);
  }

  /**
   * Example call to new method {@link JShell#snippets()}.
   * @since 9
   * @see JShell#snippets()
   */
  public Stream<Snippet> snippets()
  {
    JShell testee = $$$();

    Stream<Snippet> result = testee.snippets();
    return result;
  }

  /**
   * Example call to new method {@link JShell#onShutdown(Consumer)}.
   * @since 9
   * @see JShell#onShutdown(Consumer)
   */
  public Subscription onShutdown(Consumer<JShell> listener) throws IllegalStateException
  {
    JShell testee = $$$();

    Subscription result = testee.onShutdown(listener);
    return result;
  }

  /**
   * Example call to new method {@link JShell#diagnostics(Snippet)}.
   * @since 9
   * @see JShell#diagnostics(Snippet)
   */
  public Stream<Diag> diagnostics(Snippet snippet)
  {
    JShell testee = $$$();

    Stream<Diag> result = testee.diagnostics(snippet);
    return result;
  }

  /**
   * Example call to new method {@link JShell#eval(String)}.
   * @since 9
   * @see JShell#eval(String)
   */
  public List<SnippetEvent> eval(String input) throws IllegalStateException
  {
    JShell testee = $$$();

    List<SnippetEvent> result = testee.eval(input);
    return result;
  }

  /**
   * Example call to new method {@link JShell#varValue(VarSnippet)}.
   * @since 9
   * @see JShell#varValue(VarSnippet)
   */
  public String varValue(VarSnippet snippet) throws IllegalStateException
  {
    JShell testee = $$$();

    String result = testee.varValue(snippet);
    return result;
  }

  /**
   * Example call to new method {@link JShell#close()}.
   * @since 9
   * @see JShell#close()
   */
  public void close()
  {
    JShell testee = $$$();

    testee.close();
  }

  /**
   * Example call to new method {@link JShell#status(Snippet)}.
   * @since 9
   * @see JShell#status(Snippet)
   */
  public Status status(Snippet snippet)
  {
    JShell testee = $$$();

    Status result = testee.status(snippet);
    return result;
  }

  /**
   * Example call to new method {@link JShell#builder()}.
   * @since 9
   * @see JShell#builder()
   */
  public static Builder builder()
  {
    Builder result = JShell.builder();
    return result;
  }

  /**
   * Example call to new method {@link JShell#create()}.
   * @since 9
   * @see JShell#create()
   */
  public static JShell create() throws IllegalStateException
  {
    JShell result = JShell.create();
    return result;
  }

  private JShell $$$()
  {
    return null;
  }
}
