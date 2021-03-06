package whatisnewin.javax.lang.model.util;

import javax.lang.model.util.AbstractElementVisitor6;
import javax.lang.model.element.ModuleElement;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link AbstractElementVisitor6}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link AbstractElementVisitor6} is an old class but has new fields, constructors or methods.
 * @since 1.6
 * @see AbstractElementVisitor6
 */
public final class WhatIsNewInAbstractElementVisitor6<R, P>
{
  /**
   * Example call to new method {@link AbstractElementVisitor6#visitModule(ModuleElement, Object)}.
   * @since 9
   * @see AbstractElementVisitor6#visitModule(ModuleElement, Object)
   */
  public R visitModule(ModuleElement e, P p)
  {
    AbstractElementVisitor6<R, P> testee = $$$();

    R result = testee.visitModule(e, p);
    return result;
  }

  private AbstractElementVisitor6<R, P> $$$()
  {
    return null;
  }
}
