package com.ict.erp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.MusicDAO;
import com.ict.erp.vo.musicChart;

public class MusicDAOImpl extends CommonDAOImpl implements MusicDAO {

	@Override
	public List<musicChart> selectmusicChartList(musicChart menu) throws SQLException {
		String sql = "select * from Music_chart";
		try {

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<musicChart> muList = new ArrayList<musicChart>();
			while (rs.next()) {
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
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	@Override
	public musicChart selectmusicChart(musicChart menu) throws SQLException {

		return null;
	}

	@Override
	public int insertMusic(musicChart music) throws SQLException {
		String sql = "insert into music_chart(mcNum,mcName,mcSinger,mcVendor,mcCredat,mcDesc)";
		sql += " values(seq_mc.nextval,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, music.getMcName());
			ps.setString(2, music.getMcSinger());
			ps.setString(3, music.getMcVendor());
			ps.setString(4, music.getMcCredat());
			ps.setString(5, music.getMcDesc());
			return ps.executeUpdate();
		} catch (SQLException e) {
			throw e;
		}
	}

	@Override
	public int updateMusic(musicChart music) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMusic(int[] music) throws SQLException {
		String sql = "delete from music_chart where mcNum=?";
		try {
			ps = con.prepareStatement(sql);
			int cnt = 0;
			for (int mc : music) {
				ps.setInt(1, mc);
				cnt += ps.executeUpdate();
			}
			ps.close();
			return cnt;
		} catch (SQLException e) {
			throw e;
		}
	}
}
