/**
 * This class is generated by jOOQ
 */
package com.example.jooq.db.tables;


import com.example.jooq.db.Jooqdb;
import com.example.jooq.db.Keys;
import com.example.jooq.db.tables.records.ActorRecord;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
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
public class Actor extends TableImpl<ActorRecord> {

    private static final long serialVersionUID = -45157036;

    /**
     * The reference instance of <code>jooqdb.actor</code>
     */
    public static final Actor ACTOR = new Actor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ActorRecord> getRecordType() {
        return ActorRecord.class;
    }

    /**
     * The column <code>jooqdb.actor.id</code>.
     */
    public final TableField<ActorRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>jooqdb.actor.name</code>.
     */
    public final TableField<ActorRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>jooqdb.actor.height</code>.
     */
    public final TableField<ActorRecord, Short> HEIGHT = createField("height", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>jooqdb.actor.blood</code>.
     */
    public final TableField<ActorRecord, String> BLOOD = createField("blood", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>jooqdb.actor.birthplace_id</code>.
     */
    public final TableField<ActorRecord, Short> BIRTHPLACE_ID = createField("birthplace_id", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>jooqdb.actor.birthday</code>.
     */
    public final TableField<ActorRecord, Date> BIRTHDAY = createField("birthday", org.jooq.impl.SQLDataType.DATE, this, "");

    /**
     * The column <code>jooqdb.actor.update_at</code>.
     */
    public final TableField<ActorRecord, Timestamp> UPDATE_AT = createField("update_at", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>jooqdb.actor</code> table reference
     */
    public Actor() {
        this("actor", null);
    }

    /**
     * Create an aliased <code>jooqdb.actor</code> table reference
     */
    public Actor(String alias) {
        this(alias, ACTOR);
    }

    private Actor(String alias, Table<ActorRecord> aliased) {
        this(alias, aliased, null);
    }

    private Actor(String alias, Table<ActorRecord> aliased, Field<?>[] parameters) {
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
    public Identity<ActorRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ACTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ActorRecord> getPrimaryKey() {
        return Keys.KEY_ACTOR_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ActorRecord>> getKeys() {
        return Arrays.<UniqueKey<ActorRecord>>asList(Keys.KEY_ACTOR_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Actor as(String alias) {
        return new Actor(alias, this);
    }

    /**
     * Rename this table
     */
    public Actor rename(String name) {
        return new Actor(name, null);
    }
}
