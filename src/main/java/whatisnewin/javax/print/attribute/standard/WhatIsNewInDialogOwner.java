package whatisnewin.javax.print.attribute.standard;

import javax.print.attribute.standard.DialogOwner;
import java.awt.Window;
import javax.print.attribute.Attribute;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DialogOwner}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link DialogOwner} is a completely new class.
 * @since 11
 * @see DialogOwner
 */
public final class WhatIsNewInDialogOwner
{
  /**
   * Example call to new constructor {@link DialogOwner#DialogOwner()}.
   * @since 11
   * @see DialogOwner#DialogOwner()
   */
  public WhatIsNewInDialogOwner()
  {
    DialogOwner testee = new DialogOwner();
  }

  /**
   * Example call to new constructor {@link DialogOwner#DialogOwner(Window)}.
   * @since 11
   * @see DialogOwner#DialogOwner(Window)
   */
  public WhatIsNewInDialogOwner(Window owner)
  {
    DialogOwner testee = new DialogOwner(owner);
  }

  /**
   * Example call to new method {@link DialogOwner#getOwner()}.
   * @since 11
   * @see DialogOwner#getOwner()
   */
  public Window getOwner()
  {
    DialogOwner testee = $$$();

    Window result = testee.getOwner();
    return result;
  }

  /**
   * Example call to new method {@link DialogOwner#getCategory()}.
   * @since 11
   * @see DialogOwner#getCategory()
   */
  public Class<? extends Attribute> getCategory()
  {
    DialogOwner testee = $$$();

    Class<? extends Attribute> result = testee.getCategory();
    return result;
  }

  /**
   * Example call to new method {@link DialogOwner#getName()}.
   * @since 11
   * @see DialogOwner#getName()
   */
  public String getName()
  {
    DialogOwner testee = $$$();

    String result = testee.getName();
    return result;
  }

  private DialogOwner $$$()
  {
    return null;
  }
}
