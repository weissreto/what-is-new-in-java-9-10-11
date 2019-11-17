package whatisnewin.com.sun.jdi;

import com.sun.jdi.ModuleReference;
import com.sun.jdi.ClassLoaderReference;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ModuleReference}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ModuleReference} is a completely new class.
 * @since 9
 * @see ModuleReference
 */
public final class WhatIsNewInModuleReference
{
  /**
   * Example call to new method {@link ModuleReference#name()}.
   * @since 9
   * @see ModuleReference#name()
   */
  public String name()
  {
    ModuleReference testee = $$$();

    String result = testee.name();
    return result;
  }

  /**
   * Example call to new method {@link ModuleReference#classLoader()}.
   * @since 9
   * @see ModuleReference#classLoader()
   */
  public ClassLoaderReference classLoader()
  {
    ModuleReference testee = $$$();

    ClassLoaderReference result = testee.classLoader();
    return result;
  }

  private ModuleReference $$$()
  {
    return null;
  }
}
