package whatisnewin.javax.imageio.plugins.tiff;

import javax.imageio.plugins.tiff.TIFFDirectory;
import javax.imageio.plugins.tiff.TIFFTagSet;
import javax.imageio.plugins.tiff.TIFFTag;
import javax.imageio.metadata.IIOMetadata;
import javax.imageio.metadata.IIOInvalidTreeException;
import javax.imageio.plugins.tiff.TIFFField;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link TIFFDirectory}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link TIFFDirectory} is a completely new class.
 * @since 9
 * @see TIFFDirectory
 */
public final class WhatIsNewInTIFFDirectory
{
  /**
   * Example call to new constructor {@link TIFFDirectory#TIFFDirectory(javax.imageio.plugins.tiff.TIFFTagSet[], TIFFTag)}.
   * @since 9
   * @see TIFFDirectory#TIFFDirectory(javax.imageio.plugins.tiff.TIFFTagSet[], TIFFTag)
   */
  public WhatIsNewInTIFFDirectory(TIFFTagSet[] tagSets, TIFFTag parentTag)
  {
    TIFFDirectory testee = new TIFFDirectory(tagSets, parentTag);
  }

  /**
   * Example call to new method {@link TIFFDirectory#createFromMetadata(IIOMetadata)}.
   * @since 9
   * @see TIFFDirectory#createFromMetadata(IIOMetadata)
   */
  public static TIFFDirectory createFromMetadata(IIOMetadata tiffImageMetadata) throws IIOInvalidTreeException
  {
    TIFFDirectory result = TIFFDirectory.createFromMetadata(tiffImageMetadata);
    return result;
  }

  /**
   * Example call to new method {@link TIFFDirectory#getTagSets()}.
   * @since 9
   * @see TIFFDirectory#getTagSets()
   */
  public TIFFTagSet[] getTagSets()
  {
    TIFFDirectory testee = $$$();

    TIFFTagSet[] result = testee.getTagSets();
    return result;
  }

  /**
   * Example call to new method {@link TIFFDirectory#addTagSet(TIFFTagSet)}.
   * @since 9
   * @see TIFFDirectory#addTagSet(TIFFTagSet)
   */
  public void addTagSet(TIFFTagSet tagSet)
  {
    TIFFDirectory testee = $$$();

    testee.addTagSet(tagSet);
  }

  /**
   * Example call to new method {@link TIFFDirectory#removeTagSet(TIFFTagSet)}.
   * @since 9
   * @see TIFFDirectory#removeTagSet(TIFFTagSet)
   */
  public void removeTagSet(TIFFTagSet tagSet)
  {
    TIFFDirectory testee = $$$();

    testee.removeTagSet(tagSet);
  }

  /**
   * Example call to new method {@link TIFFDirectory#getParentTag()}.
   * @since 9
   * @see TIFFDirectory#getParentTag()
   */
  public TIFFTag getParentTag()
  {
    TIFFDirectory testee = $$$();

    TIFFTag result = testee.getParentTag();
    return result;
  }

  /**
   * Example call to new method {@link TIFFDirectory#getTag(int)}.
   * @since 9
   * @see TIFFDirectory#getTag(int)
   */
  public TIFFTag getTag(int tagNumber)
  {
    TIFFDirectory testee = $$$();

    TIFFTag result = testee.getTag(tagNumber);
    return result;
  }

  /**
   * Example call to new method {@link TIFFDirectory#getNumTIFFFields()}.
   * @since 9
   * @see TIFFDirectory#getNumTIFFFields()
   */
  public int getNumTIFFFields()
  {
    TIFFDirectory testee = $$$();

    int result = testee.getNumTIFFFields();
    return result;
  }

  /**
   * Example call to new method {@link TIFFDirectory#containsTIFFField(int)}.
   * @since 9
   * @see TIFFDirectory#containsTIFFField(int)
   */
  public boolean containsTIFFField(int tagNumber)
  {
    TIFFDirectory testee = $$$();

    boolean result = testee.containsTIFFField(tagNumber);
    return result;
  }

  /**
   * Example call to new method {@link TIFFDirectory#addTIFFField(TIFFField)}.
   * @since 9
   * @see TIFFDirectory#addTIFFField(TIFFField)
   */
  public void addTIFFField(TIFFField f)
  {
    TIFFDirectory testee = $$$();

    testee.addTIFFField(f);
  }

  /**
   * Example call to new method {@link TIFFDirectory#getTIFFField(int)}.
   * @since 9
   * @see TIFFDirectory#getTIFFField(int)
   */
  public TIFFField getTIFFField(int tagNumber)
  {
    TIFFDirectory testee = $$$();

    TIFFField result = testee.getTIFFField(tagNumber);
    return result;
  }

  /**
   * Example call to new method {@link TIFFDirectory#removeTIFFField(int)}.
   * @since 9
   * @see TIFFDirectory#removeTIFFField(int)
   */
  public void removeTIFFField(int tagNumber)
  {
    TIFFDirectory testee = $$$();

    testee.removeTIFFField(tagNumber);
  }

  /**
   * Example call to new method {@link TIFFDirectory#getTIFFFields()}.
   * @since 9
   * @see TIFFDirectory#getTIFFFields()
   */
  public TIFFField[] getTIFFFields()
  {
    TIFFDirectory testee = $$$();

    TIFFField[] result = testee.getTIFFFields();
    return result;
  }

  /**
   * Example call to new method {@link TIFFDirectory#removeTIFFFields()}.
   * @since 9
   * @see TIFFDirectory#removeTIFFFields()
   */
  public void removeTIFFFields()
  {
    TIFFDirectory testee = $$$();

    testee.removeTIFFFields();
  }

  /**
   * Example call to new method {@link TIFFDirectory#getAsMetadata()}.
   * @since 9
   * @see TIFFDirectory#getAsMetadata()
   */
  public IIOMetadata getAsMetadata()
  {
    TIFFDirectory testee = $$$();

    IIOMetadata result = testee.getAsMetadata();
    return result;
  }

  private TIFFDirectory $$$()
  {
    return null;
  }
}
