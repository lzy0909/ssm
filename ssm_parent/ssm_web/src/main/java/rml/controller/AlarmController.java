package rml.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import rml.model.Alarm;
import rml.service.AlarmService;

@Controller
@RequestMapping("/alarmController")
public class AlarmController {
	
	@Autowired
	private AlarmService alarmService;
	
	@RequestMapping(value="/deleteUser")
	public String deleteUser(int id) {
		alarmService.delete(id);
		return "redirect:/muserController/listUser.do";
	}
	
	@RequestMapping(value="/listUser")
	public String listUser(HttpServletRequest request) {
		
		List <Alarm> list = alarmService.getAll();
		request.setAttribute("userlist", list);
		return "/user/listUser";
	}

}
