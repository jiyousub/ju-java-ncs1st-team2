package com.ssc.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssc.helper.BaseController;


@WebServlet("/main.do")
public class Main extends BaseController {
	private static final long serialVersionUID = -5732792933618206426L;

	@Override
	public String doRun(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		return "view/main";
	}
}
