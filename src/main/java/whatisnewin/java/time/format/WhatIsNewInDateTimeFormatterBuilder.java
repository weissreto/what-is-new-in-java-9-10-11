package whatisnewin.java.time.format;

import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.util.Set;
import java.time.ZoneId;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link DateTimeFormatterBuilder}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link DateTimeFormatterBuilder} is an old class but has new fields, constructors or methods.
 * @since 1.8
 * @see DateTimeFormatterBuilder
 */
public final class WhatIsNewInDateTimeFormatterBuilder
{
  /**
   * Example call to new method {@link DateTimeFormatterBuilder#appendGenericZoneText(TextStyle)}.
   * @since 9
   * @see DateTimeFormatterBuilder#appendGenericZoneText(TextStyle)
   */
  public DateTimeFormatterBuilder appendGenericZoneText(TextStyle textStyle)
  {
    DateTimeFormatterBuilder testee = $$$();

    DateTimeFormatterBuilder result = testee.appendGenericZoneText(textStyle);
    return result;
  }

  /**
   * Example call to new method {@link DateTimeFormatterBuilder#appendGenericZoneText(TextStyle, Set)}.
   * @since 9
   * @see DateTimeFormatterBuilder#appendGenericZoneText(TextStyle, Set)
   */
  public DateTimeFormatterBuilder appendGenericZoneText(TextStyle textStyle, Set<ZoneId> preferredZones)
  {
    DateTimeFormatterBuilder testee = $$$();

    DateTimeFormatterBuilder result = testee.appendGenericZoneText(textStyle, preferredZones);
    return result;
  }

  private DateTimeFormatterBuilder $$$()
  {
    return null;
  }
}
