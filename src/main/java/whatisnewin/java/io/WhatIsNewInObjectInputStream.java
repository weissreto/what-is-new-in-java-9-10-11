package whatisnewin.java.io;

import java.io.ObjectInputStream;
import java.io.ObjectInputFilter;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ObjectInputStream}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ObjectInputStream} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see ObjectInputStream
 */
public final class WhatIsNewInObjectInputStream
{
  /**
   * Example call to new method {@link ObjectInputStream#getObjectInputFilter()}.
   * @since 9
   * @see ObjectInputStream#getObjectInputFilter()
   */
  public ObjectInputFilter getObjectInputFilter()
  {
    ObjectInputStream testee = $$$();

    ObjectInputFilter result = testee.getObjectInputFilter();
    return result;
  }

  private ObjectInputStream $$$()
  {
    return null;
  }
}
