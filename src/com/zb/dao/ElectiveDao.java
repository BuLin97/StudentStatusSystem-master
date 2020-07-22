package com.zb.dao;

import com.zb.pojo.Sc;
import com.zb.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public interface ElectiveDao {
    //查询选修课成绩
     public  List<Sc> SelectElecttiveRs(int sno) throws SQLException;


    //查询大三必修成绩
    List<Sc> selectThirdSc(int sno);

    //查询大四必修成绩
    List<Sc> selectFourthSc(int sno);
}
