package whatisnewin.jdk.nashorn.api.tree;

import jdk.nashorn.api.tree.BlockTree;
import java.util.List;
import jdk.nashorn.api.tree.StatementTree;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link BlockTree}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link BlockTree} is a completely new class.
 * @since 9
 * @see BlockTree
 */
public final class WhatIsNewInBlockTree
{
  /**
   * Example call to new method {@link BlockTree#getStatements()}.
   * @since 9
   * @see BlockTree#getStatements()
   */
  public List<? extends StatementTree> getStatements()
  {
    BlockTree testee = $$$();

    List<? extends StatementTree> result = testee.getStatements();
    return result;
  }

  private BlockTree $$$()
  {
    return null;
  }
}
