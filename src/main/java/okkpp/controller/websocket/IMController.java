package okkpp.controller.websocket;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author duck
* @date ����ʱ�䣺2018��4��16�� ����4:13:38
*/
@Controller
@RequestMapping("/im")
public class IMController {

	@RequestMapping("page")
	public String page() {
		return "websocket/websock";
	}
}
