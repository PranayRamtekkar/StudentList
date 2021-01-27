package com.example.student.Student.Controllers;

import com.example.student.Student.Models.StudentModel;
import com.example.student.Student.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String viewHomePage(Model model) {
        List<StudentModel> list = studentService.listAll();
        model.addAttribute("list", list);
        return "index";
    }

    @RequestMapping(value = "/new")
    public String addStudent(Model model) {
        model.addAttribute("student", new StudentModel());
        return "new";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") StudentModel student) {
        studentService.save(student);
        return "redirect:/";
    }

    @RequestMapping(value = "/edit/{id}")
    public ModelAndView editStudent(@PathVariable Integer id) {
        ModelAndView model = new ModelAndView("new");
        StudentModel student = studentService.get(id);
        model.addObject("student",student);
        return model;
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable Integer id) {
        studentService.delete(id);
        return "redirect:/";
    }

}
