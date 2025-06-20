package kr.co.sist.dao;

import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.co.sist.domain.Emp;
import kr.co.sist.dto.SearchDTO;

public class MvcDAO {
	
	private static MvcDAO sDAO;
	private MvcDAO() {
		
	}
	public static MvcDAO getInstance() {
		if(sDAO==null) {
			sDAO=new MvcDAO();
		}//end if
		return sDAO;
	}//getInstance 
	 

	public List<Emp> selectEMP( SearchDTO sDTO ) throws PersistenceException{
		List<Emp> list=null;
		//1. MyBatis Handler 얻기
		SqlSession ss=MyBatisDAO.getInstance("kr/co/sist/dao/mybatis-config.xml")
				.getMyBatisHandler();
		//2.쿼리를 실행
		list=ss.selectList("kr.co.sist.dao.selectEmp",sDTO);
		//검색결과
		//3. Transaction처리
		//4. MyBatis Handler 닫기
		ss.close();
		
		return list;
	}//selectEMP
	
	

	public static void main(String[] args) {
		
		try {
			SearchDTO sDTO=new SearchDTO();
			sDTO.setDeptno(10);
			sDTO.setSal(5000);
			System.out.println(MvcDAO.getInstance().selectEMP(sDTO));
		}catch (PersistenceException pe){
			pe.printStackTrace();
		}
	 }//main

	
}//class
