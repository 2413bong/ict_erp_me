package com.ict.erp.dao;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.musicChart;

public interface MusicDAO extends CommonDAO{
	public List<musicChart> selectmusicChartList (musicChart menu) throws SQLException;
	public musicChart selectmusicChart (musicChart menu) throws SQLException;

}
