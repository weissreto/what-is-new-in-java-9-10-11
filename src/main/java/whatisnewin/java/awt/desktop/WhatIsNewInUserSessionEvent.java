package whatisnewin.java.awt.desktop;

import java.awt.desktop.UserSessionEvent;
import java.awt.desktop.UserSessionEvent.Reason;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link UserSessionEvent}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link UserSessionEvent} is a completely new class.
 * @since 9
 * @see UserSessionEvent
 */
public final class WhatIsNewInUserSessionEvent
{
  /**
   * Example call to new constructor {@link UserSessionEvent#UserSessionEvent(Reason)}.
   * @since 9
   * @see UserSessionEvent#UserSessionEvent(Reason)
   */
  public WhatIsNewInUserSessionEvent(Reason reason)
  {
    UserSessionEvent testee = new UserSessionEvent(reason);
  }

  /**
   * Example call to new method {@link UserSessionEvent#getReason()}.
   * @since 9
   * @see UserSessionEvent#getReason()
   */
  public Reason getReason()
  {
    UserSessionEvent testee = $$$();

    Reason result = testee.getReason();
    return result;
  }

  private UserSessionEvent $$$()
  {
    return null;
  }
}
