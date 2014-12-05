package common.routes;

import cn.net.lisong.jfinal.controller.admin.AdminController;
import cn.net.lisong.jfinal.controller.admin.UserController;

import com.jfinal.config.Routes;

public class AdminRoute extends Routes {

	@Override
	public void config() {
		add("/admin", AdminController.class);
		add("/admin/user", UserController.class, "/WEB-INF/pages/admin/");
	}

}
