package smartcampus.webtemplate.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import smartcampus.webtemplate.manager.Manager;
import smartcampus.webtemplate.manager.Volunteer;

@Controller
public class VolunteerController {

	@Autowired
	Manager manager;

	@RequestMapping(method = RequestMethod.GET, value = "/volunteer")
	public @ResponseBody
	List<Volunteer> getVolunteers() {
		return manager.getVolunteers();
	}
}
