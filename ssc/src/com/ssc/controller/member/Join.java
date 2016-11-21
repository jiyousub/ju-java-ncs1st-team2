package com.ssc.controller.member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssc.helper.BaseController;


@WebServlet("/join.do")
public class Join extends BaseController {
	private static final long serialVersionUID = 5490500222691700848L;

	@Override
	public String doRun(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		return "join/join";
	}
}
