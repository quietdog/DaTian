package cn.edu.bjtu.service;

import java.util.List;

import javax.servlet.http.HttpSession;

import cn.edu.bjtu.bean.page.FocusBean;
import cn.edu.bjtu.dao.BaseDao;
import cn.edu.bjtu.vo.Focus;

import com.alibaba.fastjson.JSONArray;

public interface FocusService extends BaseDao<Focus>{
	public boolean insertFocus(String clientId, String foucsType, String foucsId);
	public List getFocusJudgement(String clientId, String foucsType, String foucsId);
	public boolean deleteFocus(String id);
	public List getFocusList(String clientId,String focusType);

	
	/**
	 * 搜索关注
	 * @Title: searchFocus 
	 *  
	 * @param: @param search_content
	 * @param: @param session
	 * @param: @return 
	 * @return: JSONArray 
	 * @throws: 异常 
	 * @author: chendonghao 
	 * @date: 2015年7月6日 下午12:20:37
	 */
	public JSONArray searchFocus(FocusBean focusBean,HttpSession session);
	
	/**
	 * 关注总记录数 
	 * @param focusBean
	 * @param session
	 * @return
	 */
	public Integer getUserFocusTotalRowsAjax(FocusBean focusBean,HttpSession session);
	
	/**
	 * 设置关注为失效状态
	 * @param id
	 * @return
	 */
	public boolean setInvalid(String id);

}
