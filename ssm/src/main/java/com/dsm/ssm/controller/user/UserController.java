package com.dsm.ssm.controller.user;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsm.ssm.model.user.UserInfo;
import com.dsm.ssm.service.user.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger LOG = Logger.getLogger(UserController.class);

	@Resource
	private UserService userService;

	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request, Model model) {

		LOG.info("showUser start");
		String userId = request.getParameter("id");
		UserInfo user = null;
		try {
			user = userService.getUserById(userId);
		} catch (Exception e) {
			LOG.error("showUser error", e);
		}
		model.addAttribute("user", user);
		LOG.info("showUser end");
		return "showUser";
	}
}
