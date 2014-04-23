package ee.kemit.cameltest;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 23.04.14
 */
public class SpatialData {
  final Long id;
  final String name;
  final String wktGeom;

  public SpatialData(Long id, String name, String wktGeom) {
    this.id = id;
    this.name = name;
    this.wktGeom = wktGeom;
  }

  @Override
  public String toString() {
    return "SpatialData{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
