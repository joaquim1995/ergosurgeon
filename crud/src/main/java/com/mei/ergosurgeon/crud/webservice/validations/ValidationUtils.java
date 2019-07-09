package com.mei.ergosurgeon.crud.webservice.validations;

import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import org.springframework.util.CollectionUtils;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.HashSet;
import java.util.Set;

public class ValidationUtils {

    final static Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    public static <T extends Key> Set<ConstraintViolation<T>> validation(T request) {
        Set<ConstraintViolation<T>> violations = validator.validate(request);

        if (CollectionUtils.isEmpty(violations))
            return new HashSet<>(0);
        else
            return violations;
    }
}
