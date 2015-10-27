package com.kdo.relationalanallizer.jsql;

import com.kdo.relationalanallizer.result.TableRelation;
import net.sf.jsqlparser.expression.*;
import net.sf.jsqlparser.expression.operators.arithmetic.*;
import net.sf.jsqlparser.expression.operators.conditional.AndExpression;
import net.sf.jsqlparser.expression.operators.conditional.OrExpression;
import net.sf.jsqlparser.expression.operators.relational.*;
import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.*;

import java.util.Set;

/**
 * Created by kdo on 2015-10-27.
 */
public class TableRelationFinder implements SelectVisitor, FromItemVisitor, ExpressionVisitor, ItemsListVisitor {
    private Set<TableRelation> relations;

    public Set<TableRelation> getTableRelation(Select statement) {
        if (statement.getWithItemsList() != null) {
            for (WithItem withItem : statement.getWithItemsList()) {
                withItem.accept(this);
            }
        }
        statement.getSelectBody().accept(this);
        return relations;
    }

    @Override
    public void visit(NullValue nullValue) {
        System.out.println("");
    }

    @Override
    public void visit(Function function) {
        System.out.println("");
    }

    @Override
    public void visit(SignedExpression signedExpression) {
        System.out.println("");
    }

    @Override
    public void visit(JdbcParameter jdbcParameter) {
        System.out.println("");
    }

    @Override
    public void visit(JdbcNamedParameter jdbcNamedParameter) {
        System.out.println("");
    }

    @Override
    public void visit(DoubleValue doubleValue) {
        System.out.println("");
    }

    @Override
    public void visit(LongValue longValue) {
        System.out.println("");
    }

    @Override
    public void visit(DateValue dateValue) {
        System.out.println("");
    }

    @Override
    public void visit(TimeValue timeValue) {
        System.out.println("");
    }

    @Override
    public void visit(TimestampValue timestampValue) {
        System.out.println("");
    }

    @Override
    public void visit(Parenthesis parenthesis) {
        System.out.println("");
    }

    @Override
    public void visit(StringValue stringValue) {
        System.out.println("");
    }

    @Override
    public void visit(Addition addition) {
        System.out.println("");
    }

    @Override
    public void visit(Division division) {
        System.out.println("");
    }

    @Override
    public void visit(Multiplication multiplication) {
        System.out.println("");
    }

    @Override
    public void visit(Subtraction subtraction) {
        System.out.println("");
    }

    @Override
    public void visit(AndExpression andExpression) {
        andExpression.getLeftExpression().accept(this);
        andExpression.getRightExpression().accept(this);
        System.out.println("");
    }

    @Override
    public void visit(OrExpression orExpression) {
        System.out.println("");
    }

    @Override
    public void visit(Between between) {
        System.out.println("");
    }

    @Override
    public void visit(EqualsTo equalsTo) {
        equalsTo.getLeftExpression().accept(this);
        equalsTo.getRightExpression().accept(this);
        System.out.println("");
    }

    @Override
    public void visit(GreaterThan greaterThan) {
        System.out.println("");
    }

    @Override
    public void visit(GreaterThanEquals greaterThanEquals) {
        System.out.println("");
    }

    @Override
    public void visit(InExpression inExpression) {
        System.out.println("");
    }

    @Override
    public void visit(IsNullExpression isNullExpression) {
        System.out.println("");
    }

    @Override
    public void visit(LikeExpression likeExpression) {
        System.out.println("");
    }

    @Override
    public void visit(MinorThan minorThan) {
        System.out.println("");
    }

    @Override
    public void visit(MinorThanEquals minorThanEquals) {
        System.out.println("");
    }

    @Override
    public void visit(NotEqualsTo notEqualsTo) {
        System.out.println("");
    }

    @Override
    public void visit(Column tableColumn) {
        //Table alias ¸ÅÇÎÀÌ Èûµé°Ù¾î
        tableColumn.getTable().getName();
        tableColumn.getColumnName();
        System.out.println("");
    }

    @Override
    public void visit(CaseExpression caseExpression) {
        System.out.println("");
    }

    @Override
    public void visit(WhenClause whenClause) {
        System.out.println("");
    }

    @Override
    public void visit(ExistsExpression existsExpression) {
        System.out.println("");
    }

    @Override
    public void visit(AllComparisonExpression allComparisonExpression) {
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void visit(AnyComparisonExpression anyComparisonExpression) {
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void visit(Concat concat) {
        System.out.println("");
    }

    @Override
    public void visit(Matches matches) {
        System.out.println("");
    }

    @Override
    public void visit(BitwiseAnd bitwiseAnd) {
        System.out.println("");
    }

    @Override
    public void visit(BitwiseOr bitwiseOr) {
        System.out.println("");
    }

    @Override
    public void visit(BitwiseXor bitwiseXor) {
        System.out.println("");
    }

    @Override
    public void visit(CastExpression cast) {
        System.out.println("");
        System.out.println("");
    }

    @Override
    public void visit(Modulo modulo) {
        System.out.println("");
    }

    @Override
    public void visit(AnalyticExpression aexpr) {
        System.out.println("");
    }

    @Override
    public void visit(ExtractExpression eexpr) {
        System.out.println("");
    }

    @Override
    public void visit(IntervalExpression iexpr) {
        System.out.println("");
    }

    @Override
    public void visit(OracleHierarchicalExpression oexpr) {
        System.out.println("");
    }

    @Override
    public void visit(RegExpMatchOperator rexpr) {
        System.out.println("");
    }

    @Override
    public void visit(Table tableName) {
        System.out.println("");
    }

    @Override
    public void visit(SubSelect subSelect) {
        System.out.println("");
    }

    @Override
    public void visit(ExpressionList expressionList) {
        System.out.println("");
    }

    @Override
    public void visit(MultiExpressionList multiExprList) {
        System.out.println("");
    }

    @Override
    public void visit(SubJoin subjoin) {
        System.out.println("");
    }

    @Override
    public void visit(LateralSubSelect lateralSubSelect) {
        System.out.println("");
    }

    @Override
    public void visit(ValuesList valuesList) {
        System.out.println("");
    }

    @Override
    public void visit(PlainSelect plainSelect) {
        plainSelect.getFromItem().accept(this);

        if (plainSelect.getJoins() != null) {
            for (Join join : plainSelect.getJoins()) {
                join.getRightItem().accept(this);
                if (join.getOnExpression() != null) join.getOnExpression().accept(this);
            }
        }

        if (plainSelect.getWhere() != null) {
            plainSelect.getWhere().accept(this);
        }
    }

    @Override
    public void visit(SetOperationList setOpList) {

    }

    @Override
    public void visit(WithItem withItem) {

    }
}
