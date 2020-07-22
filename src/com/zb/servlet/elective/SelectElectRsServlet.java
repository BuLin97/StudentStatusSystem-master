package com.zb.servlet.elective;

import com.alibaba.fastjson.JSONObject;
import com.zb.dao.ElectiveDao;
import com.zb.daoImpl.ElectiveDaoImpl;
import com.zb.pojo.Elective;
import com.zb.pojo.Sc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/selectEletRs")
public class SelectElectRsServlet extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        int s = Integer.parseInt(req.getParameter("sno"));
        ElectiveDao dao = new ElectiveDaoImpl();
        List<Sc> list  = null;
        try {
            list = dao.SelectElecttiveRs(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        Map<String, Object> result = new HashMap<String, Object>();
        result.put("code", 0);
        result.put("msg", "");
        result.put("count",10);
        result.put("data", list);
        JSONObject json = new JSONObject(result);
        PrintWriter out = resp.getWriter();
        out.println(json.toJSONString());

    }
    }
