package ee.kemit.cameltest;

import org.apache.camel.Converter;
import org.apache.camel.Exchange;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 23.04.14
 */
@Converter
public class SpatialDataConverter {

  @Converter
  public static SpatialData toSpatialData( Map data, Exchange exchange){
    return  new SpatialData( (long)(Integer)data.get("id"), (String )data.get("name"), (String )data.get("geom"));
  }
}
