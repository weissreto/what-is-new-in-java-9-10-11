package whatisnewin.com.sun.source.doctree;

import com.sun.source.doctree.ProvidesTree;
import java.util.List;
import com.sun.source.doctree.DocTree;
import com.sun.source.doctree.ReferenceTree;

/**
 * This source file was generated by WhatIsNewInJava<br>
 *
 * This class provides an example call to each method in class {@link ProvidesTree}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ProvidesTree} is a completely new class
 * @since 9
 * @see ProvidesTree
 */
public final class WhatIsNewInProvidesTree
{
  /**
   * Example call to new method {@link ProvidesTree#getDescription}
   * @since 9
   * @see ProvidesTree#getDescription
   */
  public List<? extends DocTree> getDescription()
  {
    ProvidesTree testee = $$$();

    List<? extends DocTree> result = testee.getDescription();
    return result;
  }

  /**
   * Example call to new method {@link ProvidesTree#getServiceType}
   * @since 9
   * @see ProvidesTree#getServiceType
   */
  public ReferenceTree getServiceType()
  {
    ProvidesTree testee = $$$();

    ReferenceTree result = testee.getServiceType();
    return result;
  }

  private ProvidesTree $$$()
  {
    return null;
  }
}
