package example.t.meta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyanfei079 on 12/24/14.
 */
public class ClassMeta extends BaseDTO{
    private String packageName;
    private String name;
    private List<ParameterMeta> parameters = new ArrayList<ParameterMeta>();
    private List<MethodMeta> methods = new ArrayList<MethodMeta>();

    public List<ParameterMeta> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterMeta> parameters) {
        this.parameters = parameters;
    }

    public List<MethodMeta> getMethods() {
        return methods;
    }

    public void setMethods(List<MethodMeta> methods) {
        this.methods = methods;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }
}
