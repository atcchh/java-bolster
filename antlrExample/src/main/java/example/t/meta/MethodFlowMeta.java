package example.t.meta;

/**
 * Created by caoyanfei079 on 12/24/14.
 */
public class MethodFlowMeta extends BaseDTO{
    private MethodMeta start;
    private MethodMeta end;

    public MethodMeta getStart() {
        return start;
    }

    public void setStart(MethodMeta start) {
        this.start = start;
    }

    public MethodMeta getEnd() {
        return end;
    }

    public void setEnd(MethodMeta end) {
        this.end = end;
    }
}
