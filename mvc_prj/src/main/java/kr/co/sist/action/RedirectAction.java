package kr.co.sist.action;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.sist.action.Action;
import kr.co.sist.service.FormPreService;

public class RedirectAction implements Action {
	private boolean forwardFlag;
	private String movePage;

	@Override
	public void execute(HttpServletRequest request,  HttpServletResponse response) throws ServletException, IOException {
		//forwardFlag=true; //false가 기본이 된다.
		movePage="http://localhost/mvc_prj/index.html";

	}//execute

	@Override
	public boolean isForward() {
		return forwardFlag;
	}

	@Override
	public String movePage() {
		return movePage;
	}

}
