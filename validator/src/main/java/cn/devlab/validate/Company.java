package cn.devlab.validate;

/**
 * Created by zhonlian on 2016/8/29.
 */
public class Company {

    private String name;
    private Employee managingDirector;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getManagingDirector() {
        return managingDirector;
    }

    public void setManagingDirector(Employee managingDirector) {
        this.managingDirector = managingDirector;
    }
}
