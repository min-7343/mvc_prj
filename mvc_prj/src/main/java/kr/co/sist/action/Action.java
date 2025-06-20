package kr.co.sist.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * web parameter 처리, 관계유지, 이동할방식, 응답할 페입지명 설정
 */

/**
 * xxxService 클래스를 사용
 * @param request
 * @param response
 * @throws ServletException
 * @throws IOException
 */
public interface Action {

	public void execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException;
	
	/**
	 *  페이지 이동 방식
	 *  true- forward방식, false-redirect 방식
	 * @return
	 */
	public boolean isForward();
	
	/**
	 * view 페이지명 반환
	 * @return String
	 */
	public String movePage();
}
