package com.ict.erp.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.erp.common.ICTUtils;
import com.ict.erp.service.MusicService;
import com.ict.erp.service.impl.MusicServiceImpl;

public class MusicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String uri;
	private MusicService ms = new MusicServiceImpl();
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		uri =request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		if(cmd.equals("musicList")) {
			try {
				request.setAttribute("musicList", ms.selectmusicChartList(null));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		doService(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
	public void doService(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		uri = "/views" + uri;
		RequestDispatcher rd = req.getRequestDispatcher(uri);
		rd.forward(req, res);
	}

}
