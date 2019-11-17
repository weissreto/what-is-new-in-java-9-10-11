package whatisnewin.java.awt;

import java.awt.Font;
import java.io.InputStream;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.File;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Font}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Font} is an old class but has new fields, constructors or methods.
 * @since UNDEFINED
 * @see Font
 */
public final class WhatIsNewInFont
{
  /**
   * Example call to new method {@link Font#textRequiresLayout(char[], int, int)}.
   * @since 9
   * @see Font#textRequiresLayout(char[], int, int)
   */
  public static boolean textRequiresLayout(char[] chars, int start, int end)
  {
    boolean result = Font.textRequiresLayout(chars, start, end);
    return result;
  }

  /**
   * Example call to new method {@link Font#createFonts(InputStream)}.
   * @since 9
   * @see Font#createFonts(InputStream)
   */
  public static Font[] createFonts(InputStream fontStream) throws FontFormatException, IOException
  {
    Font[] result = Font.createFonts(fontStream);
    return result;
  }

  /**
   * Example call to new method {@link Font#createFonts(File)}.
   * @since 9
   * @see Font#createFonts(File)
   */
  public static Font[] createFonts(File fontFile) throws FontFormatException, IOException
  {
    Font[] result = Font.createFonts(fontFile);
    return result;
  }

}
