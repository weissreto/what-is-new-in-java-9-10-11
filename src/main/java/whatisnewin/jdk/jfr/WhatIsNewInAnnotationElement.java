package whatisnewin.jdk.jfr;

import jdk.jfr.AnnotationElement;
import java.lang.annotation.Annotation;
import java.util.Map;
import java.util.List;
import jdk.jfr.ValueDescriptor;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link AnnotationElement}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link AnnotationElement} is a completely new class
 * @since 9
 * @see AnnotationElement
 */
public final class WhatIsNewInAnnotationElement
{
  /**
   * Example call to new constructor {@link AnnotationElement#AnnotationElement}
   * @since 9
   * @see AnnotationElement#AnnotationElement
   */
  public WhatIsNewInAnnotationElement(Class<? extends Annotation> annotationType, Map<String, Object> values)
  {
    AnnotationElement testee = new AnnotationElement(annotationType, values);
  }

  /**
   * Example call to new constructor {@link AnnotationElement#AnnotationElement}
   * @since 9
   * @see AnnotationElement#AnnotationElement
   */
  public WhatIsNewInAnnotationElement(Class<? extends Annotation> annotationType, Object value)
  {
    AnnotationElement testee = new AnnotationElement(annotationType, value);
  }

  /**
   * Example call to new constructor {@link AnnotationElement#AnnotationElement}
   * @since 9
   * @see AnnotationElement#AnnotationElement
   */
  public WhatIsNewInAnnotationElement(Class<? extends Annotation> annotationType)
  {
    AnnotationElement testee = new AnnotationElement(annotationType);
  }

  /**
   * Example call to new method {@link AnnotationElement#getValues}
   * @since 9
   * @see AnnotationElement#getValues
   */
  public List<Object> getValues()
  {
    AnnotationElement testee = $$$();

    List<Object> result = testee.getValues();
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getAnnotation}
   * @since 9
   * @see AnnotationElement#getAnnotation
   */
  public <A> A getAnnotation(Class<? extends Annotation> annotationType)
  {
    AnnotationElement testee = $$$();

    A result = testee.getAnnotation(annotationType);
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getAnnotationElements}
   * @since 9
   * @see AnnotationElement#getAnnotationElements
   */
  public List<AnnotationElement> getAnnotationElements()
  {
    AnnotationElement testee = $$$();

    List<AnnotationElement> result = testee.getAnnotationElements();
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getValue}
   * @since 9
   * @see AnnotationElement#getValue
   */
  public Object getValue(String name)
  {
    AnnotationElement testee = $$$();

    Object result = testee.getValue(name);
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getTypeName}
   * @since 9
   * @see AnnotationElement#getTypeName
   */
  public String getTypeName()
  {
    AnnotationElement testee = $$$();

    String result = testee.getTypeName();
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getTypeId}
   * @since 9
   * @see AnnotationElement#getTypeId
   */
  public long getTypeId()
  {
    AnnotationElement testee = $$$();

    long result = testee.getTypeId();
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#hasValue}
   * @since 9
   * @see AnnotationElement#hasValue
   */
  public boolean hasValue(String name)
  {
    AnnotationElement testee = $$$();

    boolean result = testee.hasValue(name);
    return result;
  }

  /**
   * Example call to new method {@link AnnotationElement#getValueDescriptors}
   * @since 9
   * @see AnnotationElement#getValueDescriptors
   */
  public List<ValueDescriptor> getValueDescriptors()
  {
    AnnotationElement testee = $$$();

    List<ValueDescriptor> result = testee.getValueDescriptors();
    return result;
  }

  private AnnotationElement $$$()
  {
    return null;
  }
}
