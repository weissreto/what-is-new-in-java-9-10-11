package whatisnewin.javax.lang.model.element;

import javax.lang.model.element.ModuleElement;
import javax.lang.model.element.Name;
import javax.lang.model.element.Element;
import java.util.List;
import javax.lang.model.element.ModuleElement.Directive;
import javax.lang.model.type.TypeMirror;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ModuleElement}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ModuleElement} is a completely new class
 * @since 9
 * @see ModuleElement
 */
public final class WhatIsNewInModuleElement
{
  /**
   * Example call to new method {@link ModuleElement#getQualifiedName}
   * @since 9
   * @see ModuleElement#getQualifiedName
   */
  public Name getQualifiedName()
  {
    ModuleElement testee = $$$();

    Name result = testee.getQualifiedName();
    return result;
  }

  /**
   * Example call to new method {@link ModuleElement#getEnclosingElement}
   * @since 9
   * @see ModuleElement#getEnclosingElement
   */
  public Element getEnclosingElement()
  {
    ModuleElement testee = $$$();

    Element result = testee.getEnclosingElement();
    return result;
  }

  /**
   * Example call to new method {@link ModuleElement#isOpen}
   * @since 9
   * @see ModuleElement#isOpen
   */
  public boolean isOpen()
  {
    ModuleElement testee = $$$();

    boolean result = testee.isOpen();
    return result;
  }

  /**
   * Example call to new method {@link ModuleElement#getEnclosedElements}
   * @since 9
   * @see ModuleElement#getEnclosedElements
   */
  public List<? extends Element> getEnclosedElements()
  {
    ModuleElement testee = $$$();

    List<? extends Element> result = testee.getEnclosedElements();
    return result;
  }

  /**
   * Example call to new method {@link ModuleElement#getDirectives}
   * @since 9
   * @see ModuleElement#getDirectives
   */
  public List<? extends Directive> getDirectives()
  {
    ModuleElement testee = $$$();

    List<? extends Directive> result = testee.getDirectives();
    return result;
  }

  /**
   * Example call to new method {@link ModuleElement#getSimpleName}
   * @since 9
   * @see ModuleElement#getSimpleName
   */
  public Name getSimpleName()
  {
    ModuleElement testee = $$$();

    Name result = testee.getSimpleName();
    return result;
  }

  /**
   * Example call to new method {@link ModuleElement#isUnnamed}
   * @since 9
   * @see ModuleElement#isUnnamed
   */
  public boolean isUnnamed()
  {
    ModuleElement testee = $$$();

    boolean result = testee.isUnnamed();
    return result;
  }

  /**
   * Example call to new method {@link ModuleElement#asType}
   * @since 9
   * @see ModuleElement#asType
   */
  public TypeMirror asType()
  {
    ModuleElement testee = $$$();

    TypeMirror result = testee.asType();
    return result;
  }

  private ModuleElement $$$()
  {
    return null;
  }
}
