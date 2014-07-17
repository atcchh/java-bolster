package com.cango.spring.embeddedDataBase.dao;


import com.cango.spring.embeddedDataBase.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

/**
 * Created by caoyanfei079 on 7/16/14.
 */
@Repository
public class CustomerDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<CustomerDTO> getCustomer() {
        return jdbcTemplate.query("select * from customer", new RowMapper<CustomerDTO>() {
            @Override
            public CustomerDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                CustomerDTO p = new CustomerDTO();
                p.setAge(rs.getInt("AGE"));
                p.setName(rs.getString("NAME"));
                p.setId(rs.getLong("ID"));
                return p;
            }
        });
    }
    public Integer update(final Long id, final String newName) {
        return jdbcTemplate.update("update customer set name = ? where id = ?", new PreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps) throws SQLException {
                ps.setString(1, newName);
                ps.setLong(2, id);
            }
        });
    }
    public Integer insertCustomer(CustomerDTO c) {
        return jdbcTemplate.update("insert into customer (id, name, age) values (?,?,?)", new Object[]{1l,"Cango",17}, new int[]{Types.INTEGER, Types.VARCHAR, Types.INTEGER});
    }
}
