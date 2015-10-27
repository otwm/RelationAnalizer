import com.kdo.relationalanallizer.Analizer;
import com.kdo.relationalanallizer.jsql.JsqlAnalizer;
import net.sf.jsqlparser.JSQLParserException;
import org.junit.Test;

/**
 * Created by kdo on 2015-10-27.
 */
public class TestAnalizer {
    //    private String sql = "SELECT * FROM MY_TABLE1, MY_TABLE2, (SELECT * FROM MY_TABLE3) LEFT OUTER JOIN MY_TABLE4 \"+\n" +
//            "\" WHERE ID = (SELECT MAX(ID) FROM MY_TABLE5) AND ID2 IN (SELECT * FROM MY_TABLE6)";

    @Test
    public void testAnalizer() throws JSQLParserException {
        Analizer analizer = new JsqlAnalizer();

        String sql = "";
//        sql += "select * from t1 t1, t2 t2";
//        analizer.analize(sql);

        sql = "";
        sql += "select * from MyTableT1 t1, MyTableT2 t2 where t1.abc = t2.abc and t1.bbc = t2.bbc";
        analizer.analize(sql);

//        sql = "";
//        sql += "select * from t1 t1 left outer join t2 t2 on t1.abc = t2.abc and t1.bbc = t2.bbc";
//        analizer.analize(sql);
    }


}
