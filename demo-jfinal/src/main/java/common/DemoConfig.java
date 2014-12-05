package common;

import cn.net.lisong.jfinal.controller.HelloController;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.render.ViewType;
import common.routes.AdminRoute;
import common.routes.FrontRoute;

public class DemoConfig extends JFinalConfig {

	public void configConstant(Constants me) {
//		me.setDevMode(true);
		me.setViewType(ViewType.JSP);
	}

	public void configRoute(Routes me) {
		me.add("/hello", HelloController.class);
		me.add(new FrontRoute()); // 端端路由
		me.add(new AdminRoute()); // 后端路由
		
	}

	public void configPlugin(Plugins me) {
	}

	public void configInterceptor(Interceptors me) {
	}

	public void configHandler(Handlers me) {
	}
}
