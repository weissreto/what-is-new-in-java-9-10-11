package whatisnewin.com.sun.source.doctree;

import com.sun.source.doctree.DocCommentTree;
import java.util.List;
import com.sun.source.doctree.DocTree;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link DocCommentTree}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link DocCommentTree} is an old class but has new fields, constructors or methods
 * @since 1.8
 * @see DocCommentTree
 */
public final class WhatIsNewInDocCommentTree
{
  /**
   * Example call to new method {@link DocCommentTree#getFullBody}
   * @since 9
   * @see DocCommentTree#getFullBody
   */
  public List<? extends DocTree> getFullBody()
  {
    DocCommentTree testee = $$$();

    List<? extends DocTree> result = testee.getFullBody();
    return result;
  }

  /**
   * Example call to new method {@link DocCommentTree#getPreamble}
   * @since 10
   * @see DocCommentTree#getPreamble
   */
  public List<? extends DocTree> getPreamble()
  {
    DocCommentTree testee = $$$();

    List<? extends DocTree> result = testee.getPreamble();
    return result;
  }

  private DocCommentTree $$$()
  {
    return null;
  }
}