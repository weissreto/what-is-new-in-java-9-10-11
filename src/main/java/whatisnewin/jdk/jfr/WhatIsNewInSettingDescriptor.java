package whatisnewin.jdk.jfr;

import jdk.jfr.SettingDescriptor;
import java.lang.annotation.Annotation;
import java.util.List;
import jdk.jfr.AnnotationElement;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link SettingDescriptor}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link SettingDescriptor} is a completely new class.
 * @since 9
 * @see SettingDescriptor
 */
public final class WhatIsNewInSettingDescriptor
{
  /**
   * Example call to new method {@link SettingDescriptor#getAnnotation(Class)}.
   * @since 9
   * @see SettingDescriptor#getAnnotation(Class)
   */
  public <A extends Annotation> A getAnnotation(Class<A> annotationType)
  {
    SettingDescriptor testee = $$$();

    A result = testee.getAnnotation(annotationType);
    return result;
  }

  /**
   * Example call to new method {@link SettingDescriptor#getName()}.
   * @since 9
   * @see SettingDescriptor#getName()
   */
  public String getName()
  {
    SettingDescriptor testee = $$$();

    String result = testee.getName();
    return result;
  }

  /**
   * Example call to new method {@link SettingDescriptor#getLabel()}.
   * @since 9
   * @see SettingDescriptor#getLabel()
   */
  public String getLabel()
  {
    SettingDescriptor testee = $$$();

    String result = testee.getLabel();
    return result;
  }

  /**
   * Example call to new method {@link SettingDescriptor#getAnnotationElements()}.
   * @since 9
   * @see SettingDescriptor#getAnnotationElements()
   */
  public List<AnnotationElement> getAnnotationElements()
  {
    SettingDescriptor testee = $$$();

    List<AnnotationElement> result = testee.getAnnotationElements();
    return result;
  }

  /**
   * Example call to new method {@link SettingDescriptor#getDefaultValue()}.
   * @since 9
   * @see SettingDescriptor#getDefaultValue()
   */
  public String getDefaultValue()
  {
    SettingDescriptor testee = $$$();

    String result = testee.getDefaultValue();
    return result;
  }

  /**
   * Example call to new method {@link SettingDescriptor#getDescription()}.
   * @since 9
   * @see SettingDescriptor#getDescription()
   */
  public String getDescription()
  {
    SettingDescriptor testee = $$$();

    String result = testee.getDescription();
    return result;
  }

  /**
   * Example call to new method {@link SettingDescriptor#getTypeId()}.
   * @since 9
   * @see SettingDescriptor#getTypeId()
   */
  public long getTypeId()
  {
    SettingDescriptor testee = $$$();

    long result = testee.getTypeId();
    return result;
  }

  /**
   * Example call to new method {@link SettingDescriptor#getTypeName()}.
   * @since 9
   * @see SettingDescriptor#getTypeName()
   */
  public String getTypeName()
  {
    SettingDescriptor testee = $$$();

    String result = testee.getTypeName();
    return result;
  }

  /**
   * Example call to new method {@link SettingDescriptor#getContentType()}.
   * @since 9
   * @see SettingDescriptor#getContentType()
   */
  public String getContentType()
  {
    SettingDescriptor testee = $$$();

    String result = testee.getContentType();
    return result;
  }

  private SettingDescriptor $$$()
  {
    return null;
  }
}
