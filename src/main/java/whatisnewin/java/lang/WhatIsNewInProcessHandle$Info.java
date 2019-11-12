package whatisnewin.java.lang;

import java.lang.ProcessHandle.Info;
import java.util.Optional;
import java.time.Duration;
import java.time.Instant;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Info}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Info} is a completely new class
 * @since 9
 * @see Info
 */
public final class WhatIsNewInProcessHandle$Info
{
  /**
   * Example call to new method {@link Info#totalCpuDuration}
   * @since 9
   * @see Info#totalCpuDuration
   */
  public Optional<Duration> totalCpuDuration()
  {
    Info testee = $$$();

    Optional<Duration> result = testee.totalCpuDuration();
    return result;
  }

  /**
   * Example call to new method {@link Info#arguments}
   * @since 9
   * @see Info#arguments
   */
  public Optional<String[]> arguments()
  {
    Info testee = $$$();

    Optional<String[]> result = testee.arguments();
    return result;
  }

  /**
   * Example call to new method {@link Info#command}
   * @since 9
   * @see Info#command
   */
  public Optional<String> command()
  {
    Info testee = $$$();

    Optional<String> result = testee.command();
    return result;
  }

  /**
   * Example call to new method {@link Info#startInstant}
   * @since 9
   * @see Info#startInstant
   */
  public Optional<Instant> startInstant()
  {
    Info testee = $$$();

    Optional<Instant> result = testee.startInstant();
    return result;
  }

  /**
   * Example call to new method {@link Info#user}
   * @since 9
   * @see Info#user
   */
  public Optional<String> user()
  {
    Info testee = $$$();

    Optional<String> result = testee.user();
    return result;
  }

  /**
   * Example call to new method {@link Info#commandLine}
   * @since 9
   * @see Info#commandLine
   */
  public Optional<String> commandLine()
  {
    Info testee = $$$();

    Optional<String> result = testee.commandLine();
    return result;
  }

  private Info $$$()
  {
    return null;
  }
}