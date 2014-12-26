package example.t.meta;

/**
 * Created by caoyanfei079 on 12/24/14.
 */
public class ParameterMeta extends BaseDTO{
    public String name;
    public String type;
//    public String privilege;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

//    public String getPrivilege() {
//        return privilege;
//    }
//
//    public void setPrivilege(String privilege) {
//        this.privilege = privilege;
//    }
}
