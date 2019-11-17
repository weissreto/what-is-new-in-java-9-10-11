package whatisnewin.javax.lang.model.element;

import javax.lang.model.element.ModuleElement.DirectiveVisitor;
import javax.lang.model.element.ModuleElement.Directive;
import javax.lang.model.element.ModuleElement.RequiresDirective;
import javax.lang.model.element.ModuleElement.ExportsDirective;
import javax.lang.model.element.ModuleElement.OpensDirective;
import javax.lang.model.element.ModuleElement.UsesDirective;
import javax.lang.model.element.ModuleElement.ProvidesDirective;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DirectiveVisitor}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link DirectiveVisitor} is a completely new class.
 * @since 9
 * @see DirectiveVisitor
 */
public final class WhatIsNewInModuleElement$DirectiveVisitor<R, P>
{
  /**
   * Example call to new method {@link DirectiveVisitor#visit(Directive)}.
   * @since 9
   * @see DirectiveVisitor#visit(Directive)
   */
  public R visit(Directive d)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visit(d);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visit(Directive, Object)}.
   * @since 9
   * @see DirectiveVisitor#visit(Directive, Object)
   */
  public R visit(Directive d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visit(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitRequires(RequiresDirective, Object)}.
   * @since 9
   * @see DirectiveVisitor#visitRequires(RequiresDirective, Object)
   */
  public R visitRequires(RequiresDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitRequires(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitExports(ExportsDirective, Object)}.
   * @since 9
   * @see DirectiveVisitor#visitExports(ExportsDirective, Object)
   */
  public R visitExports(ExportsDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitExports(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitOpens(OpensDirective, Object)}.
   * @since 9
   * @see DirectiveVisitor#visitOpens(OpensDirective, Object)
   */
  public R visitOpens(OpensDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitOpens(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitUses(UsesDirective, Object)}.
   * @since 9
   * @see DirectiveVisitor#visitUses(UsesDirective, Object)
   */
  public R visitUses(UsesDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitUses(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitProvides(ProvidesDirective, Object)}.
   * @since 9
   * @see DirectiveVisitor#visitProvides(ProvidesDirective, Object)
   */
  public R visitProvides(ProvidesDirective d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitProvides(d, p);
    return result;
  }

  /**
   * Example call to new method {@link DirectiveVisitor#visitUnknown(Directive, Object)}.
   * @since 9
   * @see DirectiveVisitor#visitUnknown(Directive, Object)
   */
  public R visitUnknown(Directive d, P p)
  {
    DirectiveVisitor<R, P> testee = $$$();

    R result = testee.visitUnknown(d, p);
    return result;
  }

  private DirectiveVisitor<R, P> $$$()
  {
    return null;
  }
}
