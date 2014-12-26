package example.t.utils;

import example.t.meta.ClassMeta;
import example.t.meta.PackageMeta;
import example.t.meta.ParameterMeta;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by caoyanfei079 on 12/24/14.
 */
public class PackageMetaFormat {
    private static Map<String, PackageMeta> packages = new HashMap<String, PackageMeta>();
    public static void add(ClassMeta classMeta) {
        if(!packages.containsKey(classMeta.getPackageName())) {
            PackageMeta packageMeta = new PackageMeta();
            packageMeta.setName(classMeta.getPackageName());
            packages.put(classMeta.getPackageName(), packageMeta);
        }
        packages.get(classMeta).getClassMetas().add(classMeta);
    }
}
