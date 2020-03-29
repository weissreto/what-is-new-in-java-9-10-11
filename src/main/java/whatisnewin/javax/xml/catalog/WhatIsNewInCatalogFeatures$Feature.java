package whatisnewin.javax.xml.catalog;

import javax.xml.catalog.CatalogFeatures.Feature;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link Feature}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Feature} is a completely new class.
 * @since 9
 * @see Feature
 */
public final class WhatIsNewInCatalogFeatures$Feature
{
  /**
   * Example usage of the new field {@link Feature#FILES}.
   * @since 9
   * @see Feature#FILES
   */
  public static final Feature FILES = Feature.FILES;

  /**
   * Example usage of the new field {@link Feature#PREFER}.
   * @since 9
   * @see Feature#PREFER
   */
  public static final Feature PREFER = Feature.PREFER;

  /**
   * Example usage of the new field {@link Feature#DEFER}.
   * @since 9
   * @see Feature#DEFER
   */
  public static final Feature DEFER = Feature.DEFER;

  /**
   * Example usage of the new field {@link Feature#RESOLVE}.
   * @since 9
   * @see Feature#RESOLVE
   */
  public static final Feature RESOLVE = Feature.RESOLVE;

  /**
   * Example call to new method {@link Feature#values()}.
   * @since 9
   * @see Feature#values()
   */
  public static Feature[] values()
  {
    Feature[] result = Feature.values();
    return result;
  }

  /**
   * Example call to new method {@link Feature#valueOf(String)}.
   * @since 9
   * @see Feature#valueOf(String)
   */
  public static Feature valueOf(String name)
  {
    Feature result = Feature.valueOf(name);
    return result;
  }

  /**
   * Example call to new method {@link Feature#getPropertyName()}.
   * @since 9
   * @see Feature#getPropertyName()
   */
  public String getPropertyName()
  {
    Feature testee = $$$();

    String result = testee.getPropertyName();
    return result;
  }

  /**
   * Example call to new method {@link Feature#defaultValue()}.
   * @since 9
   * @see Feature#defaultValue()
   */
  public String defaultValue()
  {
    Feature testee = $$$();

    String result = testee.defaultValue();
    return result;
  }

  private Feature $$$()
  {
    return null;
  }
}