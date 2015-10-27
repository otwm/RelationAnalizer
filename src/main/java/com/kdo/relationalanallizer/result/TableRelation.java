package com.kdo.relationalanallizer.result;

import net.sf.jsqlparser.schema.Column;
import net.sf.jsqlparser.schema.Table;

import java.util.List;


/**
 * Created by kdo on 2015-10-27.
 */
public class TableRelation {
    /**
     * ����
     */
    private String sourceTable;
    /**
     * ���
     */
    private String targetTable;
    /**
     * ����
     */
    private Relation relation;
    /**
     * ���� �÷�
     */
    private List<String> joinColumns;

    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    public String getTargetTable() {
        return targetTable;
    }

    public void setTargetTable(String targetTable) {
        this.targetTable = targetTable;
    }

    public Relation getRelation() {
        return relation;
    }

    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    public List<String> getJoinColumns() {
        return joinColumns;
    }

    public void setJoinColumns(List<String> joinColumns) {
        this.joinColumns = joinColumns;
    }
}
