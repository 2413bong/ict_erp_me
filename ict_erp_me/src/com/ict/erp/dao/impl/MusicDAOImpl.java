package com.ict.erp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.MusicDAO;
import com.ict.erp.vo.musicChart;

public class MusicDAOImpl extends CommonDAOImpl implements MusicDAO {

	@Override
	public List<musicChart> selectmusicChartList(musicChart menu) throws SQLException {
		String sql = "select *from Music_chart";
		try {
			
		
		ps= con.prepareStatement(sql);
		rs= ps.executeQuery();
		List<musicChart> muList = new ArrayList<musicChart>();
		while(rs.next()) {
		musicChart mc = new musicChart();
		mc.setMcName(rs.getString("mcName"));
		mc.setMcCredat(rs.getString("mcCredat"));
		mc.setMcDesc(rs.getString("mcDesc"));
		mc.setMcDislike(rs.getInt("mcDislike"));
		mc.setMcLike(rs.getInt("mcLike"));
		mc.setMcNum(rs.getInt("mcNum"));
		mc.setMcSinger(rs.getString("mcSinger"));
		mc.setMcVendor(rs.getString("mcVendor"));
		muList.add(mc);
	}
		return muList;
		}catch(Exception e) {
			throw e;
		}finally {
			close();
		}
	}

	@Override
	public musicChart selectmusicChart(musicChart menu) throws SQLException {

		return null;
	}

}
