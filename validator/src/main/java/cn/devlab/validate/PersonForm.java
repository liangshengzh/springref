package cn.devlab.validate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by zhong on 8/29/16.
 */
public class PersonForm {

    @NotNull
    @Size(max = 64)
    private String name;

    @Min(0)
    private int age;

}
