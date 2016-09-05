package cn.devlab.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.validation.Validator;

/**
 * Created by zhong on 8/29/16.
 */

@Service
public class MyValidationService {

    @Autowired
    private Validator validator;
}
