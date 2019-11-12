package whatisnewin.jdk.javadoc.doclet;

import jdk.javadoc.doclet.Reporter;
import javax.tools.Diagnostic.Kind;
import com.sun.source.util.DocTreePath;
import javax.lang.model.element.Element;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Reporter}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Reporter} is a completely new class
 * @since 9
 * @see Reporter
 */
public final class WhatIsNewInReporter
{
  /**
   * Example call to new method {@link Reporter#print}
   * @since 9
   * @see Reporter#print
   */
  public void print(Kind kind, String msg)
  {
    Reporter testee = $$$();

    testee.print(kind, msg);
  }

  /**
   * Example call to new method {@link Reporter#print}
   * @since 9
   * @see Reporter#print
   */
  public void print(Kind kind, DocTreePath path, String msg)
  {
    Reporter testee = $$$();

    testee.print(kind, path, msg);
  }

  /**
   * Example call to new method {@link Reporter#print}
   * @since 9
   * @see Reporter#print
   */
  public void print(Kind kind, Element e, String msg)
  {
    Reporter testee = $$$();

    testee.print(kind, e, msg);
  }

  private Reporter $$$()
  {
    return null;
  }
}
