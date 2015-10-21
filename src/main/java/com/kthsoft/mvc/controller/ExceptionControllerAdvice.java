package com.kthsoft.mvc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * Exception handling 
 * 
 * @author nguyen
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
	
	@ExceptionHandler(RuntimeException.class)
	public ModelAndView handleRuntimeException(RuntimeException e) {
		ModelAndView mav = new ModelAndView("exception");
		mav.addObject(e.getMessage());
		return mav;
	}
}
