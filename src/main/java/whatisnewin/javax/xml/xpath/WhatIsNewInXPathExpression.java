package whatisnewin.javax.xml.xpath;

import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathEvaluationResult;
import org.xml.sax.InputSource;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link XPathExpression}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link XPathExpression} is an old class but has new fields, constructors or methods.
 * @since 1.5
 * @see XPathExpression
 */
public final class WhatIsNewInXPathExpression
{
  /**
   * Example call to new method {@link XPathExpression#evaluateExpression(Object, Class)}.
   * @since 9
   * @see XPathExpression#evaluateExpression(Object, Class)
   */
  public <T> T evaluateExpression(Object item, Class<T> type) throws XPathExpressionException
  {
    XPathExpression testee = $$$();

    T result = testee.evaluateExpression(item, type);
    return result;
  }

  /**
   * Example call to new method {@link XPathExpression#evaluateExpression(Object)}.
   * @since 9
   * @see XPathExpression#evaluateExpression(Object)
   */
  public XPathEvaluationResult<?> evaluateExpression(Object item) throws XPathExpressionException
  {
    XPathExpression testee = $$$();

    XPathEvaluationResult<?> result = testee.evaluateExpression(item);
    return result;
  }

  /**
   * Example call to new method {@link XPathExpression#evaluateExpression(InputSource, Class)}.
   * @since 9
   * @see XPathExpression#evaluateExpression(InputSource, Class)
   */
  public <T> T evaluateExpression(InputSource source, Class<T> type) throws XPathExpressionException
  {
    XPathExpression testee = $$$();

    T result = testee.evaluateExpression(source, type);
    return result;
  }

  /**
   * Example call to new method {@link XPathExpression#evaluateExpression(InputSource)}.
   * @since 9
   * @see XPathExpression#evaluateExpression(InputSource)
   */
  public XPathEvaluationResult<?> evaluateExpression(InputSource source) throws XPathExpressionException
  {
    XPathExpression testee = $$$();

    XPathEvaluationResult<?> result = testee.evaluateExpression(source);
    return result;
  }

  private XPathExpression $$$()
  {
    return null;
  }
}
