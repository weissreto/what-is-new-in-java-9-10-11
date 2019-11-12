package whatisnewin.java.lang;


/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link Character}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link Character} is an old class but has new fields, constructors or methods
 * @since 1.0
 * @see Character
 */
public final class WhatIsNewInCharacter
{
  /**
   * Example usage of the new field {@link Character#DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE}
   * @since 9
   * @see Character#DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE
   */
  public static  final byte DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE = Character.DIRECTIONALITY_LEFT_TO_RIGHT_ISOLATE;

  /**
   * Example usage of the new field {@link Character#DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE}
   * @since 9
   * @see Character#DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE
   */
  public static  final byte DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE = Character.DIRECTIONALITY_RIGHT_TO_LEFT_ISOLATE;

  /**
   * Example usage of the new field {@link Character#DIRECTIONALITY_FIRST_STRONG_ISOLATE}
   * @since 9
   * @see Character#DIRECTIONALITY_FIRST_STRONG_ISOLATE
   */
  public static  final byte DIRECTIONALITY_FIRST_STRONG_ISOLATE = Character.DIRECTIONALITY_FIRST_STRONG_ISOLATE;

  /**
   * Example usage of the new field {@link Character#DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE}
   * @since 9
   * @see Character#DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE
   */
  public static  final byte DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE = Character.DIRECTIONALITY_POP_DIRECTIONAL_ISOLATE;

  /**
   * Example call to new method {@link Character#toString}
   * @since 11
   * @see Character#toString
   */
  public static String toString(int codePoint)
  {
    String result = Character.toString(codePoint);
    return result;
  }

}