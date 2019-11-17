package whatisnewin.javax.lang.model.element;

import javax.lang.model.element.ModuleElement.ProvidesDirective;
import javax.lang.model.element.TypeElement;
import java.util.List;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ProvidesDirective}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ProvidesDirective} is a completely new class.
 * @since 9
 * @see ProvidesDirective
 */
public final class WhatIsNewInModuleElement$ProvidesDirective
{
  /**
   * Example call to new method {@link ProvidesDirective#getService()}.
   * @since 9
   * @see ProvidesDirective#getService()
   */
  public TypeElement getService()
  {
    ProvidesDirective testee = $$$();

    TypeElement result = testee.getService();
    return result;
  }

  /**
   * Example call to new method {@link ProvidesDirective#getImplementations()}.
   * @since 9
   * @see ProvidesDirective#getImplementations()
   */
  public List<? extends TypeElement> getImplementations()
  {
    ProvidesDirective testee = $$$();

    List<? extends TypeElement> result = testee.getImplementations();
    return result;
  }

  private ProvidesDirective $$$()
  {
    return null;
  }
}
