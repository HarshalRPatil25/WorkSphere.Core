package com.worksphere.core.CustomAnnotation.AgeValidation;


import java.lang.annotation.*;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Constraint(validatedBy = MinAgeValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface MinAge {
    String message() default "Age must be at least {value} years";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int value();
}
