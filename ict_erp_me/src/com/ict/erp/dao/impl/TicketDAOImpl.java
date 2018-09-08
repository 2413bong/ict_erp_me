package com.ict.erp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ict.erp.dao.TicketDAO;
import com.ict.erp.vo.TicketInfo;
import com.ict.erp.vo.musicChart;

public class TicketDAOImpl extends CommonDAOImpl implements TicketDAO {

	@Override
	public List<TicketInfo> selectTicketList(TicketInfo Ticket) throws SQLException {
		String sql = "select * from Music_chart";
		try {

			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			List<TicketInfo> tkList = new ArrayList<TicketInfo>();
			while (rs.next()) {
				TicketInfo tk = new TicketInfo();
				tk.setTmCnt(rs.getInt("tmCnt"));
				tk.setTmDesc(rs.getString("tmDesc"));
				tk.setTmEndDat(rs.getString("tmEndDat"));
				tk.setTmImg(rs.getString("tmImg"));
				tk.setTmName(rs.getString("tmName"));
				tk.setTmNum(rs.getInt("tmNum"));
				tk.setTmPrice(rs.getInt("tmPrice"));
				tk.setTmStartDat(rs.getString("tmStartDat"));
				tkList.add(tk);
			}
			return tkList;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}

	@Override
	public TicketInfo selectTicket(TicketInfo Ticket) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertTicket(TicketInfo Ticket) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateTicket(TicketInfo Ticket) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteTicket(int[] Ticket) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
