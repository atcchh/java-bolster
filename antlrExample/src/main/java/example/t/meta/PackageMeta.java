package example.t.meta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by caoyanfei079 on 12/24/14.
 */
public class PackageMeta {
    private String name;
    private List<ClassMeta> classMetas = new ArrayList<ClassMeta>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ClassMeta> getClassMetas() {
        return classMetas;
    }

    public void setClassMetas(List<ClassMeta> classMetas) {
        this.classMetas = classMetas;
    }
}
