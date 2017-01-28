package cn.bfeng.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.bfeng.service.UserService;

@Controller
@RequestMapping("/home")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/index")
	public String index(ModelMap model) {
		model.put("users", userService.getUserPager(1, 2));
		return "index";
	}

	@RequestMapping("/test")
	public String test() {
		return "index";
	}

	@RequestMapping("/success")
	@ResponseBody
	public ModelMap success() {
		ModelMap model = new ModelMap();
		model.put("msg", "success");
		return model;
	}

	@RequestMapping("/failure")
	@ResponseBody
	public ModelMap failure() {
		ModelMap model = new ModelMap();
		model.put("msg", "failure");
		return model;
	}

	@RequestMapping("/common")
	public String common(HttpSession session) {
		UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		session.setAttribute("user", userDetails);
		return "common";
	}

	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}

}
