/**
 * This class is generated by jOOQ
 */
package com.example.jooq.db.tables;


import com.example.jooq.db.Jooqdb;
import com.example.jooq.db.Keys;
import com.example.jooq.db.tables.records.PrefectureRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Prefecture extends TableImpl<PrefectureRecord> {

    private static final long serialVersionUID = -328892121;

    /**
     * The reference instance of <code>jooqdb.prefecture</code>
     */
    public static final Prefecture PREFECTURE = new Prefecture();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PrefectureRecord> getRecordType() {
        return PrefectureRecord.class;
    }

    /**
     * The column <code>jooqdb.prefecture.id</code>.
     */
    public final TableField<PrefectureRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>jooqdb.prefecture</code> table reference
     */
    public Prefecture() {
        this("prefecture", null);
    }

    /**
     * Create an aliased <code>jooqdb.prefecture</code> table reference
     */
    public Prefecture(String alias) {
        this(alias, PREFECTURE);
    }

    private Prefecture(String alias, Table<PrefectureRecord> aliased) {
        this(alias, aliased, null);
    }

    private Prefecture(String alias, Table<PrefectureRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Jooqdb.JOOQDB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PrefectureRecord> getPrimaryKey() {
        return Keys.KEY_PREFECTURE_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PrefectureRecord>> getKeys() {
        return Arrays.<UniqueKey<PrefectureRecord>>asList(Keys.KEY_PREFECTURE_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Prefecture as(String alias) {
        return new Prefecture(alias, this);
    }

    /**
     * Rename this table
     */
    public Prefecture rename(String name) {
        return new Prefecture(name, null);
    }
}