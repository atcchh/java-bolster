package com.cango.db.dao;

import com.cango.db.dto.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.List;

/**
 * Created by BJY on 2014/7/6.
 */
@Repository
public class PeopleDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<People> getPeoples() {
        return jdbcTemplate.query("select * from people", new RowMapper<People>() {
            @Override
            public People mapRow(ResultSet rs, int rowNum) throws SQLException {
                People p = new People();
                p.setAge(rs.getInt("AGE"));
                p.setName(rs.getString("NAME"));
                p.setId(rs.getLong("ID"));
                return p;
            }
        });
    }
    public Integer update(final Long id, final String newName) {
        return jdbcTemplate.update("update people set name = ? where id = ?", new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1, newName);
                ps.setLong(2, id);
            }
        });
    }
    public void createTable() {
//        drop table people;
//        create table people (id int, name varchar(255), age int);
//        insert into people (id, name, age) values(1, 'cango',30);
//        insert into people (id, name, age) values(2, 'peter',20);
//        insert into people (id, name, age) values(3, 'bob',21);
//        commit
    }

}
