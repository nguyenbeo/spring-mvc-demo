package com.kthsoft.mvc.form.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

/**
 * Validation annotation to validate that 2 fields have the same value.
 * An array of fields and their matching confirmation fields can be supplied.
 *
 * Example, compare 1 pair of fields:
 * @FieldMatch(first = "password", second = "confirmPassword", message = "The password fields must match")
 * 
 * Example, compare more than 1 pair of fields:
 * @FieldMatch.List({
 *   @FieldMatch(firstField = "password", secondField = "confirmPassword", message = "The password fields must match"),
 *   @FieldMatch(firstField = "email", secondField = "confirmEmail", message = "The email fields must match")})
 */
@Target({TYPE, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = FieldMatchValidator.class)
@Documented
public @interface FieldMatch {
	String message() default "{constraints.fieldmatch}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
    
    /**
     * @return The first field
     */
    String firstField();

    /**
     * @return The second field
     */
    String secondField();

    @Target({TYPE, ANNOTATION_TYPE})
    @Retention(RUNTIME)
    @Documented
    @interface List {
    	FieldMatch[] value();
    }
}
