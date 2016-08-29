package cn.devlab.validate;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by zhonlian on 2016/8/29.
 */
public class PersonValidator implements Validator {

    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person p = (Person)target;

        int age = p.getAge();
        if(age < 0){
            errors.rejectValue("age","negativevalue");
        }else if(age > 110){
            errors.rejectValue("age", "too.darn.old");
        }

    }
}
