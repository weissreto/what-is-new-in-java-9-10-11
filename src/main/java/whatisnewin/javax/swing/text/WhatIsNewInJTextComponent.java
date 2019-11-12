package whatisnewin.javax.swing.text;

import javax.swing.text.JTextComponent;
import java.awt.geom.Rectangle2D;
import javax.swing.text.BadLocationException;
import java.awt.geom.Point2D;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link JTextComponent}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link JTextComponent} is an old class but has new fields, constructors or methods
 * @since UNDEFINED
 * @see JTextComponent
 */
public final class WhatIsNewInJTextComponent
{
  /**
   * Example call to new method {@link JTextComponent#modelToView2D}
   * @since 9
   * @see JTextComponent#modelToView2D
   */
  public Rectangle2D modelToView2D(int pos) throws BadLocationException
  {
    JTextComponent testee = $$$();

    Rectangle2D result = testee.modelToView2D(pos);
    return result;
  }

  /**
   * Example call to new method {@link JTextComponent#viewToModel2D}
   * @since 9
   * @see JTextComponent#viewToModel2D
   */
  public int viewToModel2D(Point2D pt)
  {
    JTextComponent testee = $$$();

    int result = testee.viewToModel2D(pt);
    return result;
  }

  private JTextComponent $$$()
  {
    return null;
  }
}