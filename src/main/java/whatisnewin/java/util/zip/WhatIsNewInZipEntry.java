package whatisnewin.java.util.zip;

import java.util.zip.ZipEntry;
import java.time.LocalDateTime;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ZipEntry}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ZipEntry} is an old class but has new fields, constructors or methods.
 * @since 1.1
 * @see ZipEntry
 */
public final class WhatIsNewInZipEntry
{
  /**
   * Example call to new method {@link ZipEntry#setTimeLocal(LocalDateTime)}.
   * @since 9
   * @see ZipEntry#setTimeLocal(LocalDateTime)
   */
  public void setTimeLocal(LocalDateTime time)
  {
    ZipEntry testee = $$$();

    testee.setTimeLocal(time);
  }

  /**
   * Example call to new method {@link ZipEntry#getTimeLocal()}.
   * @since 9
   * @see ZipEntry#getTimeLocal()
   */
  public LocalDateTime getTimeLocal()
  {
    ZipEntry testee = $$$();

    LocalDateTime result = testee.getTimeLocal();
    return result;
  }

  private ZipEntry $$$()
  {
    return null;
  }
}
