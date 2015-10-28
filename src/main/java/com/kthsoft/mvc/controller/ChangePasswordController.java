package com.kthsoft.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kthsoft.mvc.form.ChangePasswordForm;

/**
 * Change password controller to handle password changing
 * 
 * @author nguyen
 */
@Controller
public class ChangePasswordController {

	@RequestMapping(value = "/changePassword", method = RequestMethod.GET)
	public String changePassword(Model model) {
		ChangePasswordForm changePasswordForm = new ChangePasswordForm();
		model.addAttribute("changePasswordForm", changePasswordForm);
		return "changePassword";
	}

	@RequestMapping(value = "/changePassword", method = RequestMethod.POST)
	public String savePassword(
			@ModelAttribute("changePasswordForm") @Valid ChangePasswordForm changePasswordForm,
			BindingResult result, Model model) {
		// If there are errors
		if (result.hasErrors()) {
			model.addAttribute("changePasswordForm", changePasswordForm);
			return "changePassword";
		}

		model.addAttribute("currentPassword",
				changePasswordForm.getCurrentPassword());
		model.addAttribute("newPassword", changePasswordForm.getNewPassword());
		return "changePasswordResult";
	}

	@RequestMapping(value = "/testExceptionHandling", method = RequestMethod.GET)
	public String testExceptionHandling() {
		throw new RuntimeException(
				"Just wanna test the exception handling feature");
	}
}
