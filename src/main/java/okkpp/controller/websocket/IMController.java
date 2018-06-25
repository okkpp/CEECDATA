package okkpp.controller.websocket;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author duck
* @date ����ʱ�䣺2018��4��16�� ����4:13:38
*/
@Controller
@RequestMapping("/im")
public class IMController {

	@RequestMapping("page")
	public String page(HttpServletRequest request,HttpServletResponse response,Model model) {
		model.addAttribute("BASE_PATH", request.getServerName()+":"+request.getServerPort()+request.getContextPath()+"/");
		return "websocket/websock";
	}
}
