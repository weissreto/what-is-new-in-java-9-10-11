package whatisnewin.javax.lang.model;

import javax.lang.model.SourceVersion;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link SourceVersion}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link SourceVersion} is an old class but has new fields, constructors or methods
 * @since 1.6
 * @see SourceVersion
 */
public final class WhatIsNewInSourceVersion
{
  /**
   * Example usage of the new field {@link SourceVersion#RELEASE_9}
   * @since 9
   * @see SourceVersion#RELEASE_9
   */
  public static  final SourceVersion RELEASE_9 = SourceVersion.RELEASE_9;

  /**
   * Example usage of the new field {@link SourceVersion#RELEASE_10}
   * @since 10
   * @see SourceVersion#RELEASE_10
   */
  public static  final SourceVersion RELEASE_10 = SourceVersion.RELEASE_10;

  /**
   * Example usage of the new field {@link SourceVersion#RELEASE_11}
   * @since 11
   * @see SourceVersion#RELEASE_11
   */
  public static  final SourceVersion RELEASE_11 = SourceVersion.RELEASE_11;

  /**
   * Example call to new method {@link SourceVersion#isName}
   * @since 9
   * @see SourceVersion#isName
   */
  public static boolean isName(CharSequence name, SourceVersion version)
  {
    boolean result = SourceVersion.isName(name, version);
    return result;
  }

}
