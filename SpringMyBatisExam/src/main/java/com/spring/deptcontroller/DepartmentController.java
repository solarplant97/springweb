package com.spring.deptcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.deptservice.DeptService;
import com.spring.deptvo.DeptVO;

@Controller
@RequestMapping(value="/department")
public class DepartmentController {
	private static final String CONTEXT_PATH="dept";
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/listDepartment")
	public ModelAndView listDepartment(@ModelAttribute DeptVO param) {
		List<DeptVO> list = deptService.listDepartment(param);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("departmentList",list);
		mav.setViewName(CONTEXT_PATH+"/department");
		
		return mav;
	}
	
	@RequestMapping("/selectDepartment")
	public ModelAndView selectDepartment(@RequestParam("deptid")String deptid) {
		ModelAndView mav = new ModelAndView();
		
		if(deptid.equals("")) {
			mav.addObject("mode","insert");
			}else {
				mav.addObject("DeptVO", deptService.selectDepartment(deptid));
				mav.addObject("mode", "update");
			}
		mav.setViewName(CONTEXT_PATH+"/department_pop");
		
		return mav;
	}
	@RequestMapping("/insertDepartment")
	public ModelAndView insertDepartment(@ModelAttribute DeptVO param) {
		String resultStr="";
		int result = deptService.insertDepartment(param);
		
		if(result>0) resultStr = "등록이 완료되었습니다";
		else resultStr ="등록에 문제가 있어 완료하지 못하였습니다";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName("result");
		
		return mav;
	}
	
	@RequestMapping("/updateDepartment")
	public ModelAndView updateDepartment(@ModelAttribute DeptVO param) {
		String resultStr="";
		int result = deptService.updateDepartment(param);
		
		if(result>0) resultStr = "수정이 완료되었습니다";
		else resultStr ="수정에 문제가 있어 완료하지 못하였습니다";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName("result");
		
		return mav;
	}
	
	@RequestMapping("/deleteDepartment")
	public ModelAndView deleteDepartment(@ModelAttribute DeptVO param) {
		String resultStr="";
		int result = deptService.deleteDepartment(param);
		
		if(result>0) resultStr = "삭제가 완료되었습니다";
		else resultStr ="삭제에 문제가 있어 완료하지 못하였습니다";
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("result", resultStr);
		mav.setViewName("result");
		
		return mav;
	}
}