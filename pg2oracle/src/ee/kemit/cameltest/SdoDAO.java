package ee.kemit.cameltest;

import oracle.spatial.geometry.JGeometry;
import oracle.spatial.util.WKT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Struct;


/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 22.04.14
 */
@Repository( "forestDAO" )
public class SdoDAO {
  private JdbcTemplate tmpl;

  @Autowired
  public SdoDAO(DataSource forestDS){
    tmpl = new JdbcTemplate(forestDS);
  }

  public void insert( final SpatialData data ){
    tmpl.update(
        "INSERT INTO EELIS_DATA(ID, NAME, GEOLOC)  VALUES( ?, ?, ? )",
        new PreparedStatementSetter() {
          @Override
          public void setValues(PreparedStatement preparedStatement) throws SQLException {
            try {
              JGeometry dbObj = new WKT().toJGeometry(data.wktGeom.getBytes());
              Struct oraStruct = JGeometry.store(preparedStatement.getConnection(), dbObj);

              preparedStatement.setLong(1, data.id);
              preparedStatement.setString(2, data.name);
              preparedStatement.setObject(3, oraStruct);
            } catch (Exception e) {
              throw new SQLException("Error",e) ;
            }
          }
        });
  }
}
