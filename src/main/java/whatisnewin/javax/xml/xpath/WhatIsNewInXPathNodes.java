package whatisnewin.javax.xml.xpath;

import javax.xml.xpath.XPathNodes;
import java.util.Iterator;
import org.w3c.dom.Node;
import javax.xml.xpath.XPathException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link XPathNodes}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link XPathNodes} is a completely new class.
 * @since 9
 * @see XPathNodes
 */
public final class WhatIsNewInXPathNodes
{
  /**
   * Example call to new method {@link XPathNodes#iterator()}.
   * @since 9
   * @see XPathNodes#iterator()
   */
  public Iterator<Node> iterator()
  {
    XPathNodes testee = $$$();

    Iterator<Node> result = testee.iterator();
    return result;
  }

  /**
   * Example call to new method {@link XPathNodes#size()}.
   * @since 9
   * @see XPathNodes#size()
   */
  public int size()
  {
    XPathNodes testee = $$$();

    int result = testee.size();
    return result;
  }

  /**
   * Example call to new method {@link XPathNodes#get(int)}.
   * @since 9
   * @see XPathNodes#get(int)
   */
  public Node get(int index) throws XPathException
  {
    XPathNodes testee = $$$();

    Node result = testee.get(index);
    return result;
  }

  private XPathNodes $$$()
  {
    return null;
  }
}
