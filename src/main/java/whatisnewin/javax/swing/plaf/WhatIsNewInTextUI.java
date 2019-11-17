package whatisnewin.javax.swing.plaf;

import javax.swing.plaf.TextUI;
import java.awt.geom.Rectangle2D;
import javax.swing.text.JTextComponent;
import javax.swing.text.Position.Bias;
import javax.swing.text.BadLocationException;
import java.awt.geom.Point2D;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link TextUI}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link TextUI} is an old class but has new fields, constructors or methods.
 * @since UNDEFINED
 * @see TextUI
 */
public final class WhatIsNewInTextUI
{
  /**
   * Example call to new method {@link TextUI#modelToView2D(JTextComponent, int, Bias)}.
   * @since 9
   * @see TextUI#modelToView2D(JTextComponent, int, Bias)
   */
  public Rectangle2D modelToView2D(JTextComponent t, int pos, Bias bias) throws BadLocationException
  {
    TextUI testee = $$$();

    Rectangle2D result = testee.modelToView2D(t, pos, bias);
    return result;
  }

  /**
   * Example call to new method {@link TextUI#viewToModel2D(JTextComponent, Point2D, javax.swing.text.Position.Bias[])}.
   * @since 9
   * @see TextUI#viewToModel2D(JTextComponent, Point2D, javax.swing.text.Position.Bias[])
   */
  public int viewToModel2D(JTextComponent t, Point2D pt, Bias[] biasReturn)
  {
    TextUI testee = $$$();

    int result = testee.viewToModel2D(t, pt, biasReturn);
    return result;
  }

  private TextUI $$$()
  {
    return null;
  }
}
