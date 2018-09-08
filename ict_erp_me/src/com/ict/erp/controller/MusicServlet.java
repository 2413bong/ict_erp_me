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
import com.ict.erp.vo.MenuInfo;
import com.ict.erp.vo.musicChart;

public class MusicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String uri;
	private MusicService ms = new MusicServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		if (cmd.equals("musicList")) {
			try {
				request.setAttribute("musicList", ms.selectmusicChartList(null));
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		doService(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		uri = request.getRequestURI();
		String cmd = ICTUtils.getCmd(uri);
		try {
			if (cmd.equals("musicInsert")) {
				String mcName = request.getParameter("mcName");
				String mcSinger = request.getParameter("mcSinger");
				String mcVendor = request.getParameter("mcVendor");
				String mcCredat = request.getParameter("mcCredat");
				String mcDesc = request.getParameter("mcDesc");
				musicChart mc = new musicChart();
				mc.setMcCredat(mcCredat);
				mc.setMcDesc(mcDesc);
				mc.setMcName(mcName);
				mc.setMcSinger(mcSinger);
				mc.setMcVendor(mcVendor);

				request.setAttribute("mcList", ms.insertMusic(mc));
			} else if (cmd.equals("MusicUpdate")) {
				String mcNum = request.getParameter("mcNum");
				String mcName = request.getParameter("mcName");
				String mcPrice = request.getParameter("mcPrice");
				String mcDesc = request.getParameter("mcDesc");
				musicChart mc = new musicChart();
				request.setAttribute("mcList", ms.updateMusic(mc));

			} else if (cmd.equals("DeleteMusic")) {
				String[] mcNums = request.getParameterValues("mcNum");
				musicChart mc = new musicChart();
				int[] mcNum = new int[mcNums.length];
				for (int i = 0; i < mcNums.length; i++) {
					mcNum[i] = Integer.parseInt(mcNums[i]);
				}
				request.setAttribute("mcList", ms.deleteMusic(mcNum));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		doService(request, response);
	}

	public void doService(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		uri = "/views" + uri;
		RequestDispatcher rd = req.getRequestDispatcher(uri);
		rd.forward(req, res);
	}
}