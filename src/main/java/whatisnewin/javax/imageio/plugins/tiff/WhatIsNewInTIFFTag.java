package whatisnewin.javax.imageio.plugins.tiff;

import javax.imageio.plugins.tiff.TIFFTag;
import javax.imageio.plugins.tiff.TIFFTagSet;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link TIFFTag}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link TIFFTag} is a completely new class.
 * @since 9
 * @see TIFFTag
 */
public final class WhatIsNewInTIFFTag
{
  /**
   * Example usage of the new field {@link TIFFTag#TIFF_BYTE}.
   * @since 9
   * @see TIFFTag#TIFF_BYTE
   */
  public static final int TIFF_BYTE = TIFFTag.TIFF_BYTE;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_ASCII}.
   * @since 9
   * @see TIFFTag#TIFF_ASCII
   */
  public static final int TIFF_ASCII = TIFFTag.TIFF_ASCII;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_SHORT}.
   * @since 9
   * @see TIFFTag#TIFF_SHORT
   */
  public static final int TIFF_SHORT = TIFFTag.TIFF_SHORT;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_LONG}.
   * @since 9
   * @see TIFFTag#TIFF_LONG
   */
  public static final int TIFF_LONG = TIFFTag.TIFF_LONG;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_RATIONAL}.
   * @since 9
   * @see TIFFTag#TIFF_RATIONAL
   */
  public static final int TIFF_RATIONAL = TIFFTag.TIFF_RATIONAL;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_SBYTE}.
   * @since 9
   * @see TIFFTag#TIFF_SBYTE
   */
  public static final int TIFF_SBYTE = TIFFTag.TIFF_SBYTE;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_UNDEFINED}.
   * @since 9
   * @see TIFFTag#TIFF_UNDEFINED
   */
  public static final int TIFF_UNDEFINED = TIFFTag.TIFF_UNDEFINED;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_SSHORT}.
   * @since 9
   * @see TIFFTag#TIFF_SSHORT
   */
  public static final int TIFF_SSHORT = TIFFTag.TIFF_SSHORT;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_SLONG}.
   * @since 9
   * @see TIFFTag#TIFF_SLONG
   */
  public static final int TIFF_SLONG = TIFFTag.TIFF_SLONG;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_SRATIONAL}.
   * @since 9
   * @see TIFFTag#TIFF_SRATIONAL
   */
  public static final int TIFF_SRATIONAL = TIFFTag.TIFF_SRATIONAL;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_FLOAT}.
   * @since 9
   * @see TIFFTag#TIFF_FLOAT
   */
  public static final int TIFF_FLOAT = TIFFTag.TIFF_FLOAT;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_DOUBLE}.
   * @since 9
   * @see TIFFTag#TIFF_DOUBLE
   */
  public static final int TIFF_DOUBLE = TIFFTag.TIFF_DOUBLE;

  /**
   * Example usage of the new field {@link TIFFTag#TIFF_IFD_POINTER}.
   * @since 9
   * @see TIFFTag#TIFF_IFD_POINTER
   */
  public static final int TIFF_IFD_POINTER = TIFFTag.TIFF_IFD_POINTER;

  /**
   * Example usage of the new field {@link TIFFTag#MIN_DATATYPE}.
   * @since 9
   * @see TIFFTag#MIN_DATATYPE
   */
  public static final int MIN_DATATYPE = TIFFTag.MIN_DATATYPE;

  /**
   * Example usage of the new field {@link TIFFTag#MAX_DATATYPE}.
   * @since 9
   * @see TIFFTag#MAX_DATATYPE
   */
  public static final int MAX_DATATYPE = TIFFTag.MAX_DATATYPE;

  /**
   * Example usage of the new field {@link TIFFTag#UNKNOWN_TAG_NAME}.
   * @since 9
   * @see TIFFTag#UNKNOWN_TAG_NAME
   */
  public static final String UNKNOWN_TAG_NAME = TIFFTag.UNKNOWN_TAG_NAME;

  /**
   * Example call to new constructor {@link TIFFTag#TIFFTag(String, int, int, int)}.
   * @since 9
   * @see TIFFTag#TIFFTag(String, int, int, int)
   */
  public WhatIsNewInTIFFTag(String name, int number, int dataTypes, int count)
  {
    TIFFTag testee = new TIFFTag(name, number, dataTypes, count);
  }

  /**
   * Example call to new constructor {@link TIFFTag#TIFFTag(String, int, TIFFTagSet)}.
   * @since 9
   * @see TIFFTag#TIFFTag(String, int, TIFFTagSet)
   */
  public WhatIsNewInTIFFTag(String name, int number, TIFFTagSet tagSet)
  {
    TIFFTag testee = new TIFFTag(name, number, tagSet);
  }

  /**
   * Example call to new constructor {@link TIFFTag#TIFFTag(String, int, int)}.
   * @since 9
   * @see TIFFTag#TIFFTag(String, int, int)
   */
  public WhatIsNewInTIFFTag(String name, int number, int dataTypes)
  {
    TIFFTag testee = new TIFFTag(name, number, dataTypes);
  }

  /**
   * Example call to new method {@link TIFFTag#hasValueNames()}.
   * @since 9
   * @see TIFFTag#hasValueNames()
   */
  public boolean hasValueNames()
  {
    TIFFTag testee = $$$();

    boolean result = testee.hasValueNames();
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#isDataTypeOK(int)}.
   * @since 9
   * @see TIFFTag#isDataTypeOK(int)
   */
  public boolean isDataTypeOK(int dataType)
  {
    TIFFTag testee = $$$();

    boolean result = testee.isDataTypeOK(dataType);
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#isIFDPointer()}.
   * @since 9
   * @see TIFFTag#isIFDPointer()
   */
  public boolean isIFDPointer()
  {
    TIFFTag testee = $$$();

    boolean result = testee.isIFDPointer();
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#getTagSet()}.
   * @since 9
   * @see TIFFTag#getTagSet()
   */
  public TIFFTagSet getTagSet()
  {
    TIFFTag testee = $$$();

    TIFFTagSet result = testee.getTagSet();
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#getCount()}.
   * @since 9
   * @see TIFFTag#getCount()
   */
  public int getCount()
  {
    TIFFTag testee = $$$();

    int result = testee.getCount();
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#getName()}.
   * @since 9
   * @see TIFFTag#getName()
   */
  public String getName()
  {
    TIFFTag testee = $$$();

    String result = testee.getName();
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#getNumber()}.
   * @since 9
   * @see TIFFTag#getNumber()
   */
  public int getNumber()
  {
    TIFFTag testee = $$$();

    int result = testee.getNumber();
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#getValueName(int)}.
   * @since 9
   * @see TIFFTag#getValueName(int)
   */
  public String getValueName(int value)
  {
    TIFFTag testee = $$$();

    String result = testee.getValueName(value);
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#getSizeOfType(int)}.
   * @since 9
   * @see TIFFTag#getSizeOfType(int)
   */
  public static int getSizeOfType(int dataType)
  {
    int result = TIFFTag.getSizeOfType(dataType);
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#getNamedValues()}.
   * @since 9
   * @see TIFFTag#getNamedValues()
   */
  public int[] getNamedValues()
  {
    TIFFTag testee = $$$();

    int[] result = testee.getNamedValues();
    return result;
  }

  /**
   * Example call to new method {@link TIFFTag#getDataTypes()}.
   * @since 9
   * @see TIFFTag#getDataTypes()
   */
  public int getDataTypes()
  {
    TIFFTag testee = $$$();

    int result = testee.getDataTypes();
    return result;
  }

  private TIFFTag $$$()
  {
    return null;
  }
}
