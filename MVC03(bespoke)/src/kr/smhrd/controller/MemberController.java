package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.MemberDAO;
import kr.smhrd.model.MemberVO;
 
public class MemberController extends HttpServlet{
 
 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp)
 throws ServletException, IOException {
 
 req.setCharacterEncoding("UTF-8");
 //req.setCharacterEncoding("EUC-KR");
 //한글처리
 
 MemberVO dto = new MemberVO();
 MemberDAO dao = new MemberDAO();
 PrintWriter out = resp.getWriter();
 int result;
 
 dto.setId(req.getParameter("id"));
 dto.setPw(req.getParameter("pwd"));
 dto.setName(req.getParameter("name"));
 dto.setEmail(req.getParameter("email"));
 
// SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd");
// Date date = null;
// 
// try {
// date = sdf.parse(req.getParameter("year")+"/"+req.getParameter("month")+"/"+req.getParameter("day"));
// //입력받은 년,월,일을 date 포맷으로 변경
// } catch (ParseException e) {
// e.printStackTrace();
// }
// 
// dto.setBirth(date);
 
 result = dao.insertjoin(dto);
 
 if(result==0){
 System.out.println("Fail");
 }else{
 System.out.println("Sucess");
 }
 }
}