package com.kthsoft.mvc.form.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.beanutils.BeanUtils;

public class FieldMatchValidator implements ConstraintValidator<FieldMatch, Object> {
	private String firstFieldName;
	private String secondFieldName;

	@Override
	public void initialize(FieldMatch constraintAnnotation) {
		firstFieldName = constraintAnnotation.firstField();
		secondFieldName = constraintAnnotation.secondField();
	}

	@Override
	public boolean isValid(final Object value, ConstraintValidatorContext constraintContext) {
		try {
			final Object firstObj = BeanUtils.getProperty(value, firstFieldName);
			final Object secondObj = BeanUtils.getProperty(value, secondFieldName);

			if (!(firstObj == null && secondObj == null 
					|| firstObj != null && firstObj.equals(secondObj))) {
				constraintContext.disableDefaultConstraintViolation();
				constraintContext.buildConstraintViolationWithTemplate(
						constraintContext.getDefaultConstraintMessageTemplate())
                    .addPropertyNode(secondFieldName)
                    .addConstraintViolation();
                    return false;
			}
		} catch (final Exception ignore) {
			// ignore
		}
		return true;
	}

}
