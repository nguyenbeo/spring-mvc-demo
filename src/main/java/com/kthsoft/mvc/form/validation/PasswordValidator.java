package com.kthsoft.mvc.form.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordValidator implements ConstraintValidator<Password, Object> {

	@Override
	public void initialize(Password arg0) {
		// No implementation
	}

	@Override
	public boolean isValid(final Object value, ConstraintValidatorContext constraintContext) {
		if (value instanceof String) {
			String valueString = (String) value;
			return true;
		}
		return true;
	}

}
