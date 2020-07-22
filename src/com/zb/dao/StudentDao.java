package com.zb.dao;

import com.zb.pojo.Sc;
import com.zb.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    public void addStudent();

}
