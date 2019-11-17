package whatisnewin.javax.lang.model.element;

import javax.lang.model.element.ModuleElement.OpensDirective;
import java.util.List;
import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.PackageElement;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link OpensDirective}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link OpensDirective} is a completely new class.
 * @since 9
 * @see OpensDirective
 */
public final class WhatIsNewInModuleElement$OpensDirective
{
  /**
   * Example call to new method {@link OpensDirective#getTargetModules()}.
   * @since 9
   * @see OpensDirective#getTargetModules()
   */
  public List<? extends ModuleElement> getTargetModules()
  {
    OpensDirective testee = $$$();

    List<? extends ModuleElement> result = testee.getTargetModules();
    return result;
  }

  /**
   * Example call to new method {@link OpensDirective#getPackage()}.
   * @since 9
   * @see OpensDirective#getPackage()
   */
  public PackageElement getPackage()
  {
    OpensDirective testee = $$$();

    PackageElement result = testee.getPackage();
    return result;
  }

  private OpensDirective $$$()
  {
    return null;
  }
}
