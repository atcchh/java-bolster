package example.t.meta;

import example.t.JavaBaseListener;
import example.t.JavaParser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

/**
 * Created by caoyanfei079 on 12/24/14.
 */
public class ClassDetailListener extends JavaBaseListener {
    private ClassMeta classMeta = new ClassMeta();

    @Override
    public void exitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {
        // set the class Name
        TerminalNodeImpl className = ctx.getChild(TerminalNodeImpl.class,1);
        classMeta.setName(className.getText());
        super.exitClassDeclaration(ctx);
    }

    // set the parameter
    @Override
    public void exitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx) {
        ParameterMeta parameter = new ParameterMeta();
        JavaParser.TypeContext typeContext = ctx.getChild(JavaParser.TypeContext.class, 0);
        parameter.setType(typeContext.getText());
        JavaParser.VariableDeclaratorsContext variableDeclaratorsContext = ctx.getChild(JavaParser.VariableDeclaratorsContext.class, 0);
        parameter.setName(variableDeclaratorsContext.getText());
        classMeta.getParameters().add(parameter);
        super.exitFieldDeclaration(ctx);
    }

    @Override
    public void exitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx) {
        classMeta.setPackageName(ctx.getChild(JavaParser.QualifiedNameContext.class,0).getText());
        super.exitPackageDeclaration(ctx);
    }

    @Override
    public void exitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx) {
        // get the parameter list
        MethodMeta methodMeta =new MethodMeta();
        methodMeta.setName(ctx.getChild(TerminalNodeImpl.class,0).getText());
        JavaParser.FormalParametersContext formalParameter = ctx.getChild(JavaParser.FormalParametersContext.class,0);
        JavaParser.FormalParameterListContext formalParameterListContext = formalParameter.getChild(JavaParser.FormalParameterListContext.class,0);
        if( null != formalParameterListContext) {
            int index = formalParameterListContext.getChildCount();
            for(int i =0; i < index; i++) {
                JavaParser.FormalParameterContext formalParameterContext = formalParameterListContext.getChild(JavaParser.FormalParameterContext.class, i);
                if(formalParameterContext != null) {
                    ParameterMeta parameter = new ParameterMeta();
                    JavaParser.TypeContext typeContext = formalParameterContext.getChild(JavaParser.TypeContext.class, 0);
                    parameter.setType(typeContext.getText());
                    JavaParser.VariableDeclaratorIdContext variableDeclaratorsContext = formalParameterContext.getChild(JavaParser.VariableDeclaratorIdContext.class, 0);
                    parameter.setName(variableDeclaratorsContext.getText());
                    methodMeta.getParameter().add(parameter);
                    // set the work flow
                }
            }
        }
        classMeta.getMethods().add(methodMeta);
        super.exitMethodDeclaration(ctx);
    }

    @Override
    public void visitTerminal(@NotNull TerminalNode node) {
        if("<EOF>".equals(node.getText())) {
            System.out.println(classMeta);
        }
        super.visitTerminal(node);
    }
}
