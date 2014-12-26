package example.t.meta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyanfei079 on 12/24/14.
 */
public class MethodMeta extends BaseDTO{
    public String name;
    public List<ParameterMeta> parameter = new ArrayList<ParameterMeta>();
    public List<MethodFlowMeta> methodFlow = new ArrayList<MethodFlowMeta>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParameterMeta> getParameter() {
        return parameter;
    }

    public void setParameter(List<ParameterMeta> parameter) {
        this.parameter = parameter;
    }

    public List<MethodFlowMeta> getMethodFlow() {
        return methodFlow;
    }

    public void setMethodFlow(List<MethodFlowMeta> methodFlow) {
        this.methodFlow = methodFlow;
    }
    public void addMethodFlow(MethodMeta start, MethodMeta end) {
        MethodFlowMeta methodFlowMeta = new MethodFlowMeta();
        methodFlowMeta.setStart(start);
        methodFlowMeta.setEnd(end);
        this.methodFlow.add(methodFlowMeta);
    }
}
