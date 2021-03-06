package cn.edu.bjtu.util;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * 登录过滤
 * 
 * @author RussWest0
 * @date 2015年6月2日 下午8:36:01
 */
public class LoginFilter extends OncePerRequestFilter {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.web.filter.OncePerRequestFilter#doFilterInternal(
	 * javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse, javax.servlet.FilterChain)
	 */
	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		//System.out.println("正在过滤login");
		// 不过滤的uri
		String[] notFilter = new String[] { "login", "loginForm", "register","adminLogin" ,
				"js" ,"images", "css", "Focus", "focus", 
				"focusNum", "homepage", "linetransport", "footer", "cityline",
				"car", "warehouse", "company", "goodsform", "allcomplaint",
				"city","usercheck","goodsdetail","intro","driverconfirm","showcurrenttask","shownewtask","showfinishedtask","upload/TakeoverNumber","upload/CompleteNumber","upload/Location","location"
		};

		// 请求的uri
		String uri = request.getRequestURI();
		//刚刚进入首页的情况
		if(uri.equals("/DaTian/")){
			filterChain.doFilter(request, response);
			return;
		}
		//Ajax后最的请求不拦截 add by RussWest0 at 2015年6月12日,上午12:00:40 
		if(uri.endsWith("Ajax")){
			filterChain.doFilter(request, response);
			return ;
		}
		
		// 是否过滤,true时过滤 false不过滤
		boolean doFilter = true;
		for (String s : notFilter) {
			if (uri.indexOf(s) != -1) {
				// 如果uri中包含不过滤的uri，则不进行过滤
				doFilter = false;
				break;
			}
		}
		//未登陆直接点击我的关注需要拦截 add by russwest at 2015年9月1日,下午5:27:52 
		if(uri.indexOf("getallfocus") != -1){
			doFilter=true;
		}
		if (doFilter) {
			// 执行过滤
			// 从session中获取登录者实体
//			System.out.println(">>>>" + uri + ">>>>" + doFilter);
			Object obj = request.getSession().getAttribute(Constant.USER_NAME);
			if (null == obj) {
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				//跳转至登录页面
				response. sendRedirect("loginForm");
				return;
			} else {
				// 如果session中存在登录者实体，则继续
				filterChain.doFilter(request, response);
			}
		} else {
			// 如果不执行过滤，则继续
			Object obj = request.getSession().getAttribute(Constant.USER_NAME);
			//System.out.println(request.getQueryString());
			if(request.getQueryString()!=null && request.getQueryString().indexOf("flag=1") != -1 && obj == null)//用户未登录，请求访问个人信息
			{
				request.setCharacterEncoding("UTF-8");
				response.setCharacterEncoding("UTF-8");
				//跳转至登录页面
				response.sendRedirect("loginForm");
				return;
			}
			filterChain.doFilter(request, response);
		}
	}

}
