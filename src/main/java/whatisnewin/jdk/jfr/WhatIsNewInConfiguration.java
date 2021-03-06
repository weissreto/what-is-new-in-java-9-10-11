package whatisnewin.jdk.jfr;

import jdk.jfr.Configuration;
import java.util.Map;
import java.nio.file.Path;
import java.io.IOException;
import java.text.ParseException;
import java.io.Reader;
import java.util.List;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Configuration}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Configuration} is a completely new class.
 * @since 9
 * @see Configuration
 */
public final class WhatIsNewInConfiguration
{
  /**
   * Example call to new method {@link Configuration#getSettings()}.
   * @since 9
   * @see Configuration#getSettings()
   */
  public Map<String, String> getSettings()
  {
    Configuration testee = $$$();

    Map<String, String> result = testee.getSettings();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#getName()}.
   * @since 9
   * @see Configuration#getName()
   */
  public String getName()
  {
    Configuration testee = $$$();

    String result = testee.getName();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#getLabel()}.
   * @since 9
   * @see Configuration#getLabel()
   */
  public String getLabel()
  {
    Configuration testee = $$$();

    String result = testee.getLabel();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#getDescription()}.
   * @since 9
   * @see Configuration#getDescription()
   */
  public String getDescription()
  {
    Configuration testee = $$$();

    String result = testee.getDescription();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#getProvider()}.
   * @since 9
   * @see Configuration#getProvider()
   */
  public String getProvider()
  {
    Configuration testee = $$$();

    String result = testee.getProvider();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#getContents()}.
   * @since 9
   * @see Configuration#getContents()
   */
  public String getContents()
  {
    Configuration testee = $$$();

    String result = testee.getContents();
    return result;
  }

  /**
   * Example call to new method {@link Configuration#create(Path)}.
   * @since 9
   * @see Configuration#create(Path)
   */
  public static Configuration create(Path path) throws IOException, ParseException
  {
    Configuration result = Configuration.create(path);
    return result;
  }

  /**
   * Example call to new method {@link Configuration#create(Reader)}.
   * @since 9
   * @see Configuration#create(Reader)
   */
  public static Configuration create(Reader reader) throws IOException, ParseException
  {
    Configuration result = Configuration.create(reader);
    return result;
  }

  /**
   * Example call to new method {@link Configuration#getConfiguration(String)}.
   * @since 9
   * @see Configuration#getConfiguration(String)
   */
  public static Configuration getConfiguration(String name) throws IOException, ParseException
  {
    Configuration result = Configuration.getConfiguration(name);
    return result;
  }

  /**
   * Example call to new method {@link Configuration#getConfigurations()}.
   * @since 9
   * @see Configuration#getConfigurations()
   */
  public static List<Configuration> getConfigurations()
  {
    List<Configuration> result = Configuration.getConfigurations();
    return result;
  }

  private Configuration $$$()
  {
    return null;
  }
}
