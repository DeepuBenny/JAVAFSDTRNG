package com.ust.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Springexample2Controller {
@Autowired
EmpService empservice;

@RequestMapping("/")
public String index() {
	return "index.html";
}
@GetMapping("/viewemp")
public String viewhomepage(Model model) {
	model.addAttribute("listEmployees",empservice.getEmployees());
	return "viewemp";
	
}
@GetMapping("/newempform")
public String showemployeeform(Model model) {
	Emp employee=new Emp();
	model.addAttribute("employee",employee);
	return "newempform";
}
@PostMapping("/save")
public String saveemployee(@ModelAttribute ("employee") Emp employee) {
empservice.saveemployee(employee);
return "redirect:/";
}
@GetMapping("/showFormForUpdate/{id}")
public String showform(@PathVariable (value="id") String id,Model model) {
	Emp employee=empservice.getEmployeeById(id);
	model.addAttribute("employee", employee);
	return "updateform";
	
}
@GetMapping("/deleteEmployee/{id}")
public String deleteform(@PathVariable (value="id") String id) {
	this.empservice.deleteEmployeeById(id);
	
	return "redirect:/";
}

}
