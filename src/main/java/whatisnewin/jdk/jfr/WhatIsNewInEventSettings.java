package whatisnewin.jdk.jfr;

import jdk.jfr.EventSettings;
import java.time.Duration;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link EventSettings}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link EventSettings} is a completely new class.
 * @since 9
 * @see EventSettings
 */
public final class WhatIsNewInEventSettings
{
  /**
   * Example call to new method {@link EventSettings#withStackTrace()}.
   * @since 9
   * @see EventSettings#withStackTrace()
   */
  public EventSettings withStackTrace()
  {
    EventSettings testee = $$$();

    EventSettings result = testee.withStackTrace();
    return result;
  }

  /**
   * Example call to new method {@link EventSettings#withoutStackTrace()}.
   * @since 9
   * @see EventSettings#withoutStackTrace()
   */
  public EventSettings withoutStackTrace()
  {
    EventSettings testee = $$$();

    EventSettings result = testee.withoutStackTrace();
    return result;
  }

  /**
   * Example call to new method {@link EventSettings#withoutThreshold()}.
   * @since 9
   * @see EventSettings#withoutThreshold()
   */
  public EventSettings withoutThreshold()
  {
    EventSettings testee = $$$();

    EventSettings result = testee.withoutThreshold();
    return result;
  }

  /**
   * Example call to new method {@link EventSettings#withPeriod(Duration)}.
   * @since 9
   * @see EventSettings#withPeriod(Duration)
   */
  public EventSettings withPeriod(Duration duration)
  {
    EventSettings testee = $$$();

    EventSettings result = testee.withPeriod(duration);
    return result;
  }

  /**
   * Example call to new method {@link EventSettings#withThreshold(Duration)}.
   * @since 9
   * @see EventSettings#withThreshold(Duration)
   */
  public EventSettings withThreshold(Duration duration)
  {
    EventSettings testee = $$$();

    EventSettings result = testee.withThreshold(duration);
    return result;
  }

  /**
   * Example call to new method {@link EventSettings#with(String, String)}.
   * @since 9
   * @see EventSettings#with(String, String)
   */
  public EventSettings with(String name, String value)
  {
    EventSettings testee = $$$();

    EventSettings result = testee.with(name, value);
    return result;
  }

  private EventSettings $$$()
  {
    return null;
  }
}
