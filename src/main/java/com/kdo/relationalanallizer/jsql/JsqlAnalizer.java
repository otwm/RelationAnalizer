package com.kdo.relationalanallizer.jsql;

import com.kdo.relationalanallizer.Analizer;
import com.kdo.relationalanallizer.result.TableRelation;
import net.sf.jsqlparser.JSQLParserException;
import net.sf.jsqlparser.parser.CCJSqlParserManager;
import net.sf.jsqlparser.statement.select.Select;
import net.sf.jsqlparser.util.TablesNamesFinder;

import java.io.StringReader;
import java.util.List;
import java.util.Set;

/**
 * Created by kdo on 2015-10-27.
 */
public class JsqlAnalizer implements Analizer {

    private List<String> tables;
    private Set<TableRelation> relations;

    @Override
    public void analize(String sql) {
        try {
            for (TableRelation relation : getTableRelations(sql)) {
                System.out.println(relation);
            }
        } catch (JSQLParserException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Set<TableRelation> getTableRelations(String sql) throws JSQLParserException {
        CCJSqlParserManager pm = new CCJSqlParserManager();
        net.sf.jsqlparser.statement.Statement statement = pm.parse(new StringReader(sql));

        if (statement instanceof Select) {
            TableRelationFinder finder = new TableRelationFinder();
            return finder.getTableRelation((Select) statement);
        }
        throw new RuntimeException("not select statment!!");
    }
}
