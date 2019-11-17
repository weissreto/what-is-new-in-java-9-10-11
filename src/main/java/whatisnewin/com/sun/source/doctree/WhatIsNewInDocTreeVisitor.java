package whatisnewin.com.sun.source.doctree;

import com.sun.source.doctree.DocTreeVisitor;
import com.sun.source.doctree.DocTypeTree;
import com.sun.source.doctree.HiddenTree;
import com.sun.source.doctree.IndexTree;
import com.sun.source.doctree.ProvidesTree;
import com.sun.source.doctree.SummaryTree;
import com.sun.source.doctree.UsesTree;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DocTreeVisitor}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link DocTreeVisitor} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see DocTreeVisitor
 */
public final class WhatIsNewInDocTreeVisitor<R, P>
{
  /**
   * Example call to new method {@link DocTreeVisitor#visitDocType(DocTypeTree, Object)}.
   * @since 10
   * @see DocTreeVisitor#visitDocType(DocTypeTree, Object)
   */
  public R visitDocType(DocTypeTree node, P p)
  {
    DocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitDocType(node, p);
    return result;
  }

  /**
   * Example call to new method {@link DocTreeVisitor#visitHidden(HiddenTree, Object)}.
   * @since 9
   * @see DocTreeVisitor#visitHidden(HiddenTree, Object)
   */
  public R visitHidden(HiddenTree node, P p)
  {
    DocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitHidden(node, p);
    return result;
  }

  /**
   * Example call to new method {@link DocTreeVisitor#visitIndex(IndexTree, Object)}.
   * @since 9
   * @see DocTreeVisitor#visitIndex(IndexTree, Object)
   */
  public R visitIndex(IndexTree node, P p)
  {
    DocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitIndex(node, p);
    return result;
  }

  /**
   * Example call to new method {@link DocTreeVisitor#visitProvides(ProvidesTree, Object)}.
   * @since 9
   * @see DocTreeVisitor#visitProvides(ProvidesTree, Object)
   */
  public R visitProvides(ProvidesTree node, P p)
  {
    DocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitProvides(node, p);
    return result;
  }

  /**
   * Example call to new method {@link DocTreeVisitor#visitSummary(SummaryTree, Object)}.
   * @since 10
   * @see DocTreeVisitor#visitSummary(SummaryTree, Object)
   */
  public R visitSummary(SummaryTree node, P p)
  {
    DocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitSummary(node, p);
    return result;
  }

  /**
   * Example call to new method {@link DocTreeVisitor#visitUses(UsesTree, Object)}.
   * @since 9
   * @see DocTreeVisitor#visitUses(UsesTree, Object)
   */
  public R visitUses(UsesTree node, P p)
  {
    DocTreeVisitor<R, P> testee = $$$();

    R result = testee.visitUses(node, p);
    return result;
  }

  private DocTreeVisitor $$$()
  {
    return null;
  }
}
