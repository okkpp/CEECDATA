package okkpp.controller.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author duck
* @date 创建时间：2018年4月16日 下午4:13:38
*/
@Controller
@RequestMapping("/im")
public class IMController {

	@RequestMapping("page")
	public String page() {
		return "websocket/websock";
	}
}
