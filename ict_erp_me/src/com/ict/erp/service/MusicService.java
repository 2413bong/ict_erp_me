package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.MenuInfo;
import com.ict.erp.vo.musicChart;

public interface MusicService {

	public List<musicChart> selectmusicChartList (musicChart music) throws SQLException;
	public musicChart selectmusicChart (musicChart music) throws SQLException;
	public int insertMusic(musicChart music) throws SQLException;
	public int updateMusic(musicChart music) throws SQLException;
	public int deleteMusic(int[] music) throws SQLException;

}
