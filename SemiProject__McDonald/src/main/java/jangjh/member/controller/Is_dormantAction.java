package jangjh.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.controller.AbstractController;

public class Is_dormantAction extends AbstractController {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		super.setRedirect(false);
		super.setViewPage("/WEB-INF/jangjh/login/is_dormant.jsp");
		
	}

}
