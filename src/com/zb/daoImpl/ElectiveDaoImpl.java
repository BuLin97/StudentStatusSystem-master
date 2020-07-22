package com.zb.daoImpl;

import com.zb.dao.ElectiveDao;
import com.zb.pojo.Sc;
import com.zb.utils.JdbcUtil;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ElectiveDaoImpl implements ElectiveDao {

    @Override
    public List<Sc> SelectElecttiveRs(int sno) throws SQLException {
        // TODO Auto-generated method stub
        String sql = "select s1.id , s1.grade ,c2.cno ,c2.cname ,c2.teacher	from sc s1 , elective c2 where s1.cno = c2.cno and s1.sno = ?  and s1.cno like '11%'";
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        try {
            return  qr.query(sql,new BeanListHandler<Sc>(Sc.class),sno);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    //查询大三必修成绩
    @Override
    public List<Sc> selectThirdSc(int sno) {
        // TODO Auto-generated method stub
        String sql = "select s1.id , s1.grade ,c2.cno ,c2.cname ,c2.teacher	from sc s1 , compulsory c2 where s1.cno = c2.cno and s1.sno = ?  and s1.cno like '30%'";
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        try {
            return  qr.query(sql,new BeanListHandler<Sc>(Sc.class),sno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //查询大四必修成绩
    @Override
    public List<Sc> selectFourthSc(int sno) {
        // TODO Auto-generated method stub
        String sql = "select s1.id , s1.grade ,c2.cno ,c2.cname ,c2.teacher	from sc s1 , compulsory c2 where s1.cno = c2.cno and s1.sno = ?  and s1.cno like '40%'";
        QueryRunner qr = new QueryRunner(JdbcUtil.getDataSource());
        try {
            return  qr.query(sql,new BeanListHandler<Sc>(Sc.class),sno);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
