package cn.devlab.validate;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.PropertyValue;
import org.springframework.core.convert.support.GenericConversionService;

/**
 * Created by zhonlian on 2016/8/29.
 */
public class BeanWapperTest {

    public static void main(String[] args) {
        BeanWrapper company = new BeanWrapperImpl( new Company());
        company.setPropertyValue("name", "Some Company Inc. ");

        PropertyValue value = new PropertyValue("name", "Some Company Inc. ");
        company.setPropertyValue(value);

        BeanWrapper jim = new BeanWrapperImpl(new Employee());
        jim.setPropertyValue("name", "Jim Stravinsky");
        company.setPropertyValue("managingDirector", jim.getWrappedInstance());

        Float salary = (Float)company.getPropertyValue("managingDirector.salary");


    }
}
