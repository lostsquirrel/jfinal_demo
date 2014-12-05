package common.routes;

import cn.net.lisong.jfinal.controller.front.BlogController;
import cn.net.lisong.jfinal.controller.front.IndexController;

import com.jfinal.config.Routes;

public class FrontRoute extends Routes {
	public void config() {
		super.add("/", IndexController.class, "src/main/webapp/WEB-INF/pages");
		super.add("/blog", BlogController.class);
	}
}
