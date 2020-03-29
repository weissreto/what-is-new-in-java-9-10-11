package whatisnewin.javax.sql;

import javax.sql.ConnectionPoolDataSource;
import javax.sql.PooledConnectionBuilder;
import java.sql.SQLException;

/**
 * This source file was generated by WhatIsNewInJava.<br>
 *
 * This class provides an example call to each method in class {@link ConnectionPoolDataSource}
 * that were newly introduced in Java versions 9, 10, 11.<br>
 *
 * {@link ConnectionPoolDataSource} is an old class but has new fields, constructors or methods.
 * @since 1.4
 * @see ConnectionPoolDataSource
 */
public final class WhatIsNewInConnectionPoolDataSource
{
  /**
   * Example call to new method {@link ConnectionPoolDataSource#createPooledConnectionBuilder()}.
   * @since 9
   * @see ConnectionPoolDataSource#createPooledConnectionBuilder()
   */
  public PooledConnectionBuilder createPooledConnectionBuilder() throws SQLException
  {
    ConnectionPoolDataSource testee = $$$();

    PooledConnectionBuilder result = testee.createPooledConnectionBuilder();
    return result;
  }

  private ConnectionPoolDataSource $$$()
  {
    return null;
  }
}
