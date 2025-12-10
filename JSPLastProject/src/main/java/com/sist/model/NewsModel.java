package com.sist.model;

import com.sist.controller.Controller;
import com.sist.controller.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.*;
import com.sist.manager.*;
@Controller
public class NewsModel {
  @RequestMapping("news/list.do")
  public void news_list(HttpServletRequest request,
		  HttpServletResponse response)
  {
	  System.out.println("연결");
	  try
      {
	    response.setContentType("text/plain; charset=UTF-8");

        List<CctvVO> list=ApiExplorer.cctvData(1);

      
       int index = (int)(Math.random() * list.size());
       response.getWriter().write(list.get(index).getRoadName()+":::"+list.get(index).getMessage());
      }catch(Exception ex) {}
  }
}
