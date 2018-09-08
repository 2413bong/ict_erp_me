package com.ict.erp.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.common.DBCon;
import com.ict.erp.dao.TicketDAO;
import com.ict.erp.dao.impl.TicketDAOImpl;
import com.ict.erp.service.TicketService;
import com.ict.erp.vo.TicketInfo;

public class TicketServiceImpl implements TicketService {
	private TicketDAO td = new TicketDAOImpl();
	
	@Override
	public List<TicketInfo> selectTicketList(TicketInfo Ticket) throws SQLException {
		td.setConnection(DBCon.getCon());
		try {
			return td.selectTicketList(null);
		}catch(Exception e) {
			throw e;
		}finally {
			DBCon.close();
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
