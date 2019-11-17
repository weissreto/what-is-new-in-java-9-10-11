package whatisnewin.java.net.http;

import java.net.http.HttpHeaders;
import java.util.Map;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.Optional;
import java.util.OptionalLong;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link HttpHeaders}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link HttpHeaders} is a completely new class.
 * @since 11
 * @see HttpHeaders
 */
public final class WhatIsNewInHttpHeaders
{
  /**
   * Example call to new method {@link HttpHeaders#of(Map, BiPredicate)}.
   * @since 11
   * @see HttpHeaders#of(Map, BiPredicate)
   */
  public static HttpHeaders of(Map<String, List<String>> headerMap, BiPredicate<String, String> filter)
  {
    HttpHeaders result = HttpHeaders.of(headerMap, filter);
    return result;
  }

  /**
   * Example call to new method {@link HttpHeaders#map()}.
   * @since 11
   * @see HttpHeaders#map()
   */
  public Map<String, List<String>> map()
  {
    HttpHeaders testee = $$$();

    Map<String, List<String>> result = testee.map();
    return result;
  }

  /**
   * Example call to new method {@link HttpHeaders#firstValue(String)}.
   * @since 11
   * @see HttpHeaders#firstValue(String)
   */
  public Optional<String> firstValue(String name)
  {
    HttpHeaders testee = $$$();

    Optional<String> result = testee.firstValue(name);
    return result;
  }

  /**
   * Example call to new method {@link HttpHeaders#allValues(String)}.
   * @since 11
   * @see HttpHeaders#allValues(String)
   */
  public List<String> allValues(String name)
  {
    HttpHeaders testee = $$$();

    List<String> result = testee.allValues(name);
    return result;
  }

  /**
   * Example call to new method {@link HttpHeaders#firstValueAsLong(String)}.
   * @since 11
   * @see HttpHeaders#firstValueAsLong(String)
   */
  public OptionalLong firstValueAsLong(String name)
  {
    HttpHeaders testee = $$$();

    OptionalLong result = testee.firstValueAsLong(name);
    return result;
  }

  private HttpHeaders $$$()
  {
    return null;
  }
}
