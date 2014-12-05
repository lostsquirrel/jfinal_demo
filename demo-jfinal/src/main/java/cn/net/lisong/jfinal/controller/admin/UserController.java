package cn.net.lisong.jfinal.controller.admin;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import cn.net.lisong.jfinal.po.UserPO;

import com.jfinal.core.Controller;

public class UserController extends Controller {

	private static Log log = LogFactory.getLog(UserController.class);
	
	public void index() {
		renderJsp("user_login.jsp");
	}
	
	public void save() {
		String username = super.getPara("username");
		String password = super.getPara("password");
		log.debug(String.format("username:%s, password:%s", username, password));
		UserPO user = new UserPO(username, password);
		super.setAttr("user", user);
		renderJsp("login_success.jsp");
	}
}
