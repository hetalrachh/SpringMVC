package com.hetal.admissioncontroller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionform.html", method = RequestMethod.GET)
	public ModelAndView submitAdmissionForm() {

		ModelAndView model = new ModelAndView("admission-form");
		return model;

	}

	@RequestMapping(value = "/submitadmissionform.html", method = RequestMethod.POST)
	public ModelAndView displayAdmissionForm(@RequestParam Map<String, String> studentData) {

		ModelAndView model = new ModelAndView("display-form");

		String studentName = studentData.get("studentName");

		String studentdob = studentData.get("studentDOB");

		String gender = studentData.get("gender");

		String address = studentData.get("address");

		model.addObject("studentName", "Student name : " + studentName);
		model.addObject("studentdob", "Student DOB : " + studentdob);
		model.addObject("gender", "Student gender : " + gender);
		model.addObject("address", "Student address : " + address);

		return model;

	}

}
