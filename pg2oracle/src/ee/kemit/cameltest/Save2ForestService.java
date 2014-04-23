package ee.kemit.cameltest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: AndreiN
 * Date: 22.04.14
 */
@Service("save2ForestService")
public class Save2ForestService {
  @Autowired SdoDAO dao;

  public void execute(List msg){
    for (Object o : msg) {
      Map<String , Object> map = (Map) o;

      dao.insert( (Integer)map.get("id"), (String )map.get("name"), (String )map.get("geom"));
    }
  }

}
