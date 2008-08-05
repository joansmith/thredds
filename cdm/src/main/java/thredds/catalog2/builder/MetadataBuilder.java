package thredds.catalog2.builder;

import thredds.catalog2.Metadata;

/**
 * _more_
 *
 * @author edavis
 * @since 4.0
 */
public interface MetadataBuilder
{
  public boolean isFinished();
  public Metadata finish();
}
