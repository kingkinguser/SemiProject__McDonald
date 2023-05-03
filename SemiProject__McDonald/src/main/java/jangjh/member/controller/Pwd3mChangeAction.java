package jangjh.member.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.controller.AbstractController;
import jangjh.member.model.InterMemberDAO;
import jangjh.member.model.MemberDAO;

public class Pwd3mChangeAction extends AbstractController {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String userid = request.getParameter("userid");
		
		request.setAttribute("userid", userid);
		
		super.setRedirect(false);
		super.setViewPage("/WEB-INF/jangjh/login/pwd3mChange.jsp");
	}

}
