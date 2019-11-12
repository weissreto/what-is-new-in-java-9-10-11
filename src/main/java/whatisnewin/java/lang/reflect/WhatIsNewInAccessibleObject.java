package whatisnewin.java.lang.reflect;

import java.lang.reflect.AccessibleObject;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link AccessibleObject}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link AccessibleObject} is an old class but has new fields, constructors or methods
 * @since 1.2
 * @see AccessibleObject
 */
public final class WhatIsNewInAccessibleObject
{
  /**
   * Example call to new method {@link AccessibleObject#canAccess}
   * @since 9
   * @see AccessibleObject#canAccess
   */
  public boolean canAccess(Object obj)
  {
    AccessibleObject testee = $$$();

    boolean result = testee.canAccess(obj);
    return result;
  }

  /**
   * Example call to new method {@link AccessibleObject#trySetAccessible}
   * @since 9
   * @see AccessibleObject#trySetAccessible
   */
  public boolean trySetAccessible()
  {
    AccessibleObject testee = $$$();

    boolean result = testee.trySetAccessible();
    return result;
  }

  private AccessibleObject $$$()
  {
    return null;
  }
}