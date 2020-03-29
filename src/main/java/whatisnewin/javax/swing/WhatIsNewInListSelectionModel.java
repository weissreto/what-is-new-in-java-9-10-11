package whatisnewin.javax.swing;

import javax.swing.ListSelectionModel;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ListSelectionModel}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ListSelectionModel} is an old class but has new fields, constructors or methods.
 * @since 1.2
 * @see ListSelectionModel
 */
public final class WhatIsNewInListSelectionModel
{
  /**
   * Example call to new method {@link ListSelectionModel#getSelectedIndices()}.
   * @since 11
   * @see ListSelectionModel#getSelectedIndices()
   */
  public int[] getSelectedIndices()
  {
    ListSelectionModel testee = $$$();

    int[] result = testee.getSelectedIndices();
    return result;
  }

  /**
   * Example call to new method {@link ListSelectionModel#getSelectedItemsCount()}.
   * @since 11
   * @see ListSelectionModel#getSelectedItemsCount()
   */
  public int getSelectedItemsCount()
  {
    ListSelectionModel testee = $$$();

    int result = testee.getSelectedItemsCount();
    return result;
  }

  private ListSelectionModel $$$()
  {
    return null;
  }
}
