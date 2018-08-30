package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.MusicDAO;
import com.ict.erp.dao.impl.MusicDAOImpl;
import com.ict.erp.service.MusicService;
import com.ict.erp.vo.musicChart;

public class MusicServiceImpl implements MusicService {
	private MusicDAO mcd = new MusicDAOImpl();

	@Override
	public List<musicChart> selectmusicChartList(musicChart menu) throws SQLException {
		mcd.setConnection(DBCon.getCon());
		try {
			return mcd.selectmusicChartList(null);
		}catch(Exception e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

	@Override
	public musicChart selectmusicChart(musicChart menu) throws SQLException {

		return null;
	}

}
