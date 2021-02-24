package org.example.module.generator.entity;

/**
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/5.
 */
public class ColumnInfo {
    /**
     * 字段名称
     */
    private String columnName;

    /**
     * 字段类型
     */
    private String dataType;

    /**
     * 列描述
     */
    private String columnComment;

    /**
     * Java属性类型
     */
    private String attrType;

    /**
     * Java属性名称(第一个字母大写)，如：user_name => UserName
     */
    private String attrName;

    /**
     * Java属性名称(第一个字母小写)，如：user_name => userName
     */
    private String attrname;

    /**
     * Java属性名称(全小写)
     */
    private String lowAttrname;

    /**
     * 执行计划（包含了与索引相关的一些细节信息）
     */
    private String extra;


    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrname() {
        return attrname;
    }

    public void setAttrname(String attrname) {
        this.attrname = attrname;
    }

    public String getLowAttrname() {
        return lowAttrname;
    }

    public void setLowAttrname(String lowAttrname) {
        this.lowAttrname = lowAttrname;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
