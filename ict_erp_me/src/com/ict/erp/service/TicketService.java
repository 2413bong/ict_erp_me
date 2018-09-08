package com.ict.erp.service;

import java.sql.SQLException;
import java.util.List;

import com.ict.erp.vo.TicketInfo;

public interface TicketService {

	public List<TicketInfo> selectTicketList (TicketInfo Ticket) throws SQLException;
	public TicketInfo selectTicket (TicketInfo Ticket) throws SQLException;
	public int insertTicket(TicketInfo Ticket) throws SQLException;
	public int updateTicket(TicketInfo Ticket) throws SQLException;
	public int deleteTicket(int[] Ticket) throws SQLException;
}
