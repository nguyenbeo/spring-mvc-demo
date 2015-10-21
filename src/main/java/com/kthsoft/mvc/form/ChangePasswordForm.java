package com.kthsoft.mvc.form;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.kthsoft.mvc.form.validation.FieldMatch;
import com.kthsoft.mvc.form.validation.Password;

@FieldMatch(firstField = "newPassword", secondField = "confirmPassword",
		message = "New and confirm passwords should be similar")
public class ChangePasswordForm implements Serializable {
	private static final long serialVersionUID = -1609144351793142653L;
	
	@NotNull
	private String currentPassword;
	@NotNull
	@Password(message = "Password should be this format")
	private String newPassword;
	@NotNull
	private String confirmPassword;
	public String getCurrentPassword() {
		return currentPassword;
	}
	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
}
