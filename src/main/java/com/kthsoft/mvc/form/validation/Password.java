package com.kthsoft.mvc.form.validation;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Validation annotation to validate pattern of password
 * Pattern: ((?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,})
 * 
 * The password must be at least 8 characters long and contain at least one uppercase (capital), 
 * lowercase (small letters) and a digit.
 * 
 * @author nguyenbeo
 *
 */
@Target({METHOD, FIELD, TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
@Documented
public @interface Password {
	String message() default "{invalid.password}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    @Target({METHOD, FIELD, TYPE, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List {
    	Password[] value();
    }
}
