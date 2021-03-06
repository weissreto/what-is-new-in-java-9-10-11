package whatisnewin.jdk.javadoc.doclet;

import jdk.javadoc.doclet.Taglet;
import java.util.Set;
import jdk.javadoc.doclet.Taglet.Location;
import jdk.javadoc.doclet.DocletEnvironment;
import jdk.javadoc.doclet.Doclet;
import java.util.List;
import com.sun.source.doctree.DocTree;
import javax.lang.model.element.Element;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Taglet}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Taglet} is a completely new class.
 * @since 9
 * @see Taglet
 */
public final class WhatIsNewInTaglet
{
  /**
   * Example call to new method {@link Taglet#getAllowedLocations()}.
   * @since 9
   * @see Taglet#getAllowedLocations()
   */
  public Set<Location> getAllowedLocations()
  {
    Taglet testee = $$$();

    Set<Location> result = testee.getAllowedLocations();
    return result;
  }

  /**
   * Example call to new method {@link Taglet#isInlineTag()}.
   * @since 9
   * @see Taglet#isInlineTag()
   */
  public boolean isInlineTag()
  {
    Taglet testee = $$$();

    boolean result = testee.isInlineTag();
    return result;
  }

  /**
   * Example call to new method {@link Taglet#getName()}.
   * @since 9
   * @see Taglet#getName()
   */
  public String getName()
  {
    Taglet testee = $$$();

    String result = testee.getName();
    return result;
  }

  /**
   * Example call to new method {@link Taglet#init(DocletEnvironment, Doclet)}.
   * @since 9
   * @see Taglet#init(DocletEnvironment, Doclet)
   */
  public void init(DocletEnvironment env, Doclet doclet)
  {
    Taglet testee = $$$();

    testee.init(env, doclet);
  }

  /**
   * Example call to new method {@link Taglet#toString(List, Element)}.
   * @since 9
   * @see Taglet#toString(List, Element)
   */
  public String toString(List<? extends DocTree> tags, Element element)
  {
    Taglet testee = $$$();

    String result = testee.toString(tags, element);
    return result;
  }

  private Taglet $$$()
  {
    return null;
  }
}
