package example.t;



import java.io.*;
import example.t.Test;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;

/**
 * Created by caoyanfei079 on 12/18/14.
 */
public class Test {
    public static void main(String[] argus) throws Exception{
        ANTLRInputStream input =new ANTLRInputStream(inputStream2String(new FileInputStream(new File("/home/caoyanfei079/github/JavaBolster/antlrExample/src/main/java/example/t/Test.java"))));
//        example.t.
//        FileUti
//        ExprLexer lexer;
        JavaLexer javaLexer = new JavaLexer(input);
//
        CommonTokenStream tokens = new CommonTokenStream(javaLexer);
        JavaParser parser = new JavaParser(tokens);
        ParserRuleContext tree = parser.compilationUnit(); // parse
//
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
//        MyListener extractor = new MyListener(parser);
        walker.walk(new JavaListener() {
            @Override
            public void enterInnerCreator(@NotNull JavaParser.InnerCreatorContext ctx) {

            }

            @Override
            public void exitInnerCreator(@NotNull JavaParser.InnerCreatorContext ctx) {

            }

            @Override
            public void enterGenericMethodDeclaration(@NotNull JavaParser.GenericMethodDeclarationContext ctx) {

            }

            @Override
            public void exitGenericMethodDeclaration(@NotNull JavaParser.GenericMethodDeclarationContext ctx) {

            }

            @Override
            public void enterExpressionList(@NotNull JavaParser.ExpressionListContext ctx) {

            }

            @Override
            public void exitExpressionList(@NotNull JavaParser.ExpressionListContext ctx) {

            }

            @Override
            public void enterTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx) {

            }

            @Override
            public void exitTypeDeclaration(@NotNull JavaParser.TypeDeclarationContext ctx) {

            }

            @Override
            public void enterForUpdate(@NotNull JavaParser.ForUpdateContext ctx) {

            }

            @Override
            public void exitForUpdate(@NotNull JavaParser.ForUpdateContext ctx) {

            }

            @Override
            public void enterAnnotation(@NotNull JavaParser.AnnotationContext ctx) {

                System.out.println("----------------");
            }

            @Override
            public void exitAnnotation(@NotNull JavaParser.AnnotationContext ctx) {

            }

            @Override
            public void enterEnumConstant(@NotNull JavaParser.EnumConstantContext ctx) {

            }

            @Override
            public void exitEnumConstant(@NotNull JavaParser.EnumConstantContext ctx) {

            }

            @Override
            public void enterImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx) {

            }

            @Override
            public void exitImportDeclaration(@NotNull JavaParser.ImportDeclarationContext ctx) {

            }

            @Override
            public void enterAnnotationMethodOrConstantRest(@NotNull JavaParser.AnnotationMethodOrConstantRestContext ctx) {

            }

            @Override
            public void exitAnnotationMethodOrConstantRest(@NotNull JavaParser.AnnotationMethodOrConstantRestContext ctx) {

            }

            @Override
            public void enterEnumConstantName(@NotNull JavaParser.EnumConstantNameContext ctx) {

            }

            @Override
            public void exitEnumConstantName(@NotNull JavaParser.EnumConstantNameContext ctx) {

            }

            @Override
            public void enterFinallyBlock(@NotNull JavaParser.FinallyBlockContext ctx) {

            }

            @Override
            public void exitFinallyBlock(@NotNull JavaParser.FinallyBlockContext ctx) {

            }

            @Override
            public void enterVariableDeclarators(@NotNull JavaParser.VariableDeclaratorsContext ctx) {

            }

            @Override
            public void exitVariableDeclarators(@NotNull JavaParser.VariableDeclaratorsContext ctx) {

            }

            @Override
            public void enterElementValuePairs(@NotNull JavaParser.ElementValuePairsContext ctx) {

            }

            @Override
            public void exitElementValuePairs(@NotNull JavaParser.ElementValuePairsContext ctx) {

            }

            @Override
            public void enterInterfaceMethodDeclaration(@NotNull JavaParser.InterfaceMethodDeclarationContext ctx) {

            }

            @Override
            public void exitInterfaceMethodDeclaration(@NotNull JavaParser.InterfaceMethodDeclarationContext ctx) {

            }

            @Override
            public void enterInterfaceBodyDeclaration(@NotNull JavaParser.InterfaceBodyDeclarationContext ctx) {

            }

            @Override
            public void exitInterfaceBodyDeclaration(@NotNull JavaParser.InterfaceBodyDeclarationContext ctx) {

            }

            @Override
            public void enterEnumConstants(@NotNull JavaParser.EnumConstantsContext ctx) {

            }

            @Override
            public void exitEnumConstants(@NotNull JavaParser.EnumConstantsContext ctx) {

            }

            @Override
            public void enterCatchClause(@NotNull JavaParser.CatchClauseContext ctx) {

            }

            @Override
            public void exitCatchClause(@NotNull JavaParser.CatchClauseContext ctx) {

            }

            @Override
            public void enterConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx) {

            }

            @Override
            public void exitConstantExpression(@NotNull JavaParser.ConstantExpressionContext ctx) {

            }

            @Override
            public void enterEnumDeclaration(@NotNull JavaParser.EnumDeclarationContext ctx) {

            }

            @Override
            public void exitEnumDeclaration(@NotNull JavaParser.EnumDeclarationContext ctx) {

            }

            @Override
            public void enterExplicitGenericInvocationSuffix(@NotNull JavaParser.ExplicitGenericInvocationSuffixContext ctx) {

            }

            @Override
            public void exitExplicitGenericInvocationSuffix(@NotNull JavaParser.ExplicitGenericInvocationSuffixContext ctx) {

            }

            @Override
            public void enterTypeParameter(@NotNull JavaParser.TypeParameterContext ctx) {

            }

            @Override
            public void exitTypeParameter(@NotNull JavaParser.TypeParameterContext ctx) {

            }

            @Override
            public void enterEnumBodyDeclarations(@NotNull JavaParser.EnumBodyDeclarationsContext ctx) {

            }

            @Override
            public void exitEnumBodyDeclarations(@NotNull JavaParser.EnumBodyDeclarationsContext ctx) {

            }

            @Override
            public void enterTypeBound(@NotNull JavaParser.TypeBoundContext ctx) {

            }

            @Override
            public void exitTypeBound(@NotNull JavaParser.TypeBoundContext ctx) {

            }

            @Override
            public void enterStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx) {

            }

            @Override
            public void exitStatementExpression(@NotNull JavaParser.StatementExpressionContext ctx) {

            }

            @Override
            public void enterVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx) {

            }

            @Override
            public void exitVariableInitializer(@NotNull JavaParser.VariableInitializerContext ctx) {

            }

            @Override
            public void enterBlock(@NotNull JavaParser.BlockContext ctx) {

            }

            @Override
            public void exitBlock(@NotNull JavaParser.BlockContext ctx) {

            }

            @Override
            public void enterGenericInterfaceMethodDeclaration(@NotNull JavaParser.GenericInterfaceMethodDeclarationContext ctx) {

            }

            @Override
            public void exitGenericInterfaceMethodDeclaration(@NotNull JavaParser.GenericInterfaceMethodDeclarationContext ctx) {

            }

            @Override
            public void enterLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx) {

            }

            @Override
            public void exitLocalVariableDeclarationStatement(@NotNull JavaParser.LocalVariableDeclarationStatementContext ctx) {

            }

            @Override
            public void enterSuperSuffix(@NotNull JavaParser.SuperSuffixContext ctx) {

            }

            @Override
            public void exitSuperSuffix(@NotNull JavaParser.SuperSuffixContext ctx) {

            }

            @Override
            public void enterFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx) {

            }

            @Override
            public void exitFieldDeclaration(@NotNull JavaParser.FieldDeclarationContext ctx) {

            }

            @Override
            public void enterFormalParameterList(@NotNull JavaParser.FormalParameterListContext ctx) {

            }

            @Override
            public void exitFormalParameterList(@NotNull JavaParser.FormalParameterListContext ctx) {

            }

            @Override
            public void enterExplicitGenericInvocation(@NotNull JavaParser.ExplicitGenericInvocationContext ctx) {

            }

            @Override
            public void exitExplicitGenericInvocation(@NotNull JavaParser.ExplicitGenericInvocationContext ctx) {

            }

            @Override
            public void enterParExpression(@NotNull JavaParser.ParExpressionContext ctx) {

            }

            @Override
            public void exitParExpression(@NotNull JavaParser.ParExpressionContext ctx) {

            }

            @Override
            public void enterSwitchLabel(@NotNull JavaParser.SwitchLabelContext ctx) {

            }

            @Override
            public void exitSwitchLabel(@NotNull JavaParser.SwitchLabelContext ctx) {

            }

            @Override
            public void enterTypeParameters(@NotNull JavaParser.TypeParametersContext ctx) {

            }

            @Override
            public void exitTypeParameters(@NotNull JavaParser.TypeParametersContext ctx) {

            }

            @Override
            public void enterQualifiedName(@NotNull JavaParser.QualifiedNameContext ctx) {

            }

            @Override
            public void exitQualifiedName(@NotNull JavaParser.QualifiedNameContext ctx) {

            }

            @Override
            public void enterClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {

            }

            @Override
            public void exitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {

            }

            @Override
            public void enterAnnotationConstantRest(@NotNull JavaParser.AnnotationConstantRestContext ctx) {

            }

            @Override
            public void exitAnnotationConstantRest(@NotNull JavaParser.AnnotationConstantRestContext ctx) {

            }

            @Override
            public void enterArguments(@NotNull JavaParser.ArgumentsContext ctx) {

            }

            @Override
            public void exitArguments(@NotNull JavaParser.ArgumentsContext ctx) {

            }

            @Override
            public void enterConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx) {

            }

            @Override
            public void exitConstructorBody(@NotNull JavaParser.ConstructorBodyContext ctx) {

            }

            @Override
            public void enterFormalParameters(@NotNull JavaParser.FormalParametersContext ctx) {

            }

            @Override
            public void exitFormalParameters(@NotNull JavaParser.FormalParametersContext ctx) {

            }

            @Override
            public void enterTypeArgument(@NotNull JavaParser.TypeArgumentContext ctx) {

            }

            @Override
            public void exitTypeArgument(@NotNull JavaParser.TypeArgumentContext ctx) {

            }

            @Override
            public void enterForInit(@NotNull JavaParser.ForInitContext ctx) {

            }

            @Override
            public void exitForInit(@NotNull JavaParser.ForInitContext ctx) {

            }

            @Override
            public void enterVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx) {

            }

            @Override
            public void exitVariableDeclarator(@NotNull JavaParser.VariableDeclaratorContext ctx) {

            }

            @Override
            public void enterAnnotationTypeDeclaration(@NotNull JavaParser.AnnotationTypeDeclarationContext ctx) {

            }

            @Override
            public void exitAnnotationTypeDeclaration(@NotNull JavaParser.AnnotationTypeDeclarationContext ctx) {

            }

            @Override
            public void enterExpression(@NotNull JavaParser.ExpressionContext ctx) {

            }

            @Override
            public void exitExpression(@NotNull JavaParser.ExpressionContext ctx) {

            }

            @Override
            public void enterResources(@NotNull JavaParser.ResourcesContext ctx) {

            }

            @Override
            public void exitResources(@NotNull JavaParser.ResourcesContext ctx) {

            }

            @Override
            public void enterFormalParameter(@NotNull JavaParser.FormalParameterContext ctx) {

            }

            @Override
            public void exitFormalParameter(@NotNull JavaParser.FormalParameterContext ctx) {

            }

            @Override
            public void enterType(@NotNull JavaParser.TypeContext ctx) {

            }

            @Override
            public void exitType(@NotNull JavaParser.TypeContext ctx) {

            }

            @Override
            public void enterElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx) {

            }

            @Override
            public void exitElementValueArrayInitializer(@NotNull JavaParser.ElementValueArrayInitializerContext ctx) {

            }

            @Override
            public void enterAnnotationName(@NotNull JavaParser.AnnotationNameContext ctx) {

            }

            @Override
            public void exitAnnotationName(@NotNull JavaParser.AnnotationNameContext ctx) {

            }

            @Override
            public void enterEnhancedForControl(@NotNull JavaParser.EnhancedForControlContext ctx) {

            }

            @Override
            public void exitEnhancedForControl(@NotNull JavaParser.EnhancedForControlContext ctx) {

            }

            @Override
            public void enterAnnotationMethodRest(@NotNull JavaParser.AnnotationMethodRestContext ctx) {

            }

            @Override
            public void exitAnnotationMethodRest(@NotNull JavaParser.AnnotationMethodRestContext ctx) {

            }

            @Override
            public void enterPrimary(@NotNull JavaParser.PrimaryContext ctx) {

            }

            @Override
            public void exitPrimary(@NotNull JavaParser.PrimaryContext ctx) {

            }

            @Override
            public void enterClassBody(@NotNull JavaParser.ClassBodyContext ctx) {

            }

            @Override
            public void exitClassBody(@NotNull JavaParser.ClassBodyContext ctx) {

            }

            @Override
            public void enterClassOrInterfaceModifier(@NotNull JavaParser.ClassOrInterfaceModifierContext ctx) {

            }

            @Override
            public void exitClassOrInterfaceModifier(@NotNull JavaParser.ClassOrInterfaceModifierContext ctx) {

            }

            @Override
            public void enterDefaultValue(@NotNull JavaParser.DefaultValueContext ctx) {

            }

            @Override
            public void exitDefaultValue(@NotNull JavaParser.DefaultValueContext ctx) {

            }

            @Override
            public void enterVariableModifier(@NotNull JavaParser.VariableModifierContext ctx) {

            }

            @Override
            public void exitVariableModifier(@NotNull JavaParser.VariableModifierContext ctx) {

            }

            @Override
            public void enterConstDeclaration(@NotNull JavaParser.ConstDeclarationContext ctx) {

            }

            @Override
            public void exitConstDeclaration(@NotNull JavaParser.ConstDeclarationContext ctx) {

            }

            @Override
            public void enterCreatedName(@NotNull JavaParser.CreatedNameContext ctx) {

            }

            @Override
            public void exitCreatedName(@NotNull JavaParser.CreatedNameContext ctx) {

            }

            @Override
            public void enterInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx) {

            }

            @Override
            public void exitInterfaceDeclaration(@NotNull JavaParser.InterfaceDeclarationContext ctx) {

            }

            @Override
            public void enterPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx) {

            }

            @Override
            public void exitPackageDeclaration(@NotNull JavaParser.PackageDeclarationContext ctx) {

            }

            @Override
            public void enterConstantDeclarator(@NotNull JavaParser.ConstantDeclaratorContext ctx) {

            }

            @Override
            public void exitConstantDeclarator(@NotNull JavaParser.ConstantDeclaratorContext ctx) {

            }

            @Override
            public void enterCatchType(@NotNull JavaParser.CatchTypeContext ctx) {

            }

            @Override
            public void exitCatchType(@NotNull JavaParser.CatchTypeContext ctx) {

            }

            @Override
            public void enterTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx) {

            }

            @Override
            public void exitTypeArguments(@NotNull JavaParser.TypeArgumentsContext ctx) {

            }

            @Override
            public void enterClassCreatorRest(@NotNull JavaParser.ClassCreatorRestContext ctx) {

            }

            @Override
            public void exitClassCreatorRest(@NotNull JavaParser.ClassCreatorRestContext ctx) {

            }

            @Override
            public void enterModifier(@NotNull JavaParser.ModifierContext ctx) {

            }

            @Override
            public void exitModifier(@NotNull JavaParser.ModifierContext ctx) {

            }

            @Override
            public void enterStatement(@NotNull JavaParser.StatementContext ctx) {

            }

            @Override
            public void exitStatement(@NotNull JavaParser.StatementContext ctx) {

            }

            @Override
            public void enterInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx) {

            }

            @Override
            public void exitInterfaceBody(@NotNull JavaParser.InterfaceBodyContext ctx) {

            }

            @Override
            public void enterClassBodyDeclaration(@NotNull JavaParser.ClassBodyDeclarationContext ctx) {

            }

            @Override
            public void exitClassBodyDeclaration(@NotNull JavaParser.ClassBodyDeclarationContext ctx) {

            }

            @Override
            public void enterLastFormalParameter(@NotNull JavaParser.LastFormalParameterContext ctx) {

            }

            @Override
            public void exitLastFormalParameter(@NotNull JavaParser.LastFormalParameterContext ctx) {

            }

            @Override
            public void enterForControl(@NotNull JavaParser.ForControlContext ctx) {

            }

            @Override
            public void exitForControl(@NotNull JavaParser.ForControlContext ctx) {

            }

            @Override
            public void enterTypeList(@NotNull JavaParser.TypeListContext ctx) {

            }

            @Override
            public void exitTypeList(@NotNull JavaParser.TypeListContext ctx) {

            }

            @Override
            public void enterLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx) {

            }

            @Override
            public void exitLocalVariableDeclaration(@NotNull JavaParser.LocalVariableDeclarationContext ctx) {

            }

            @Override
            public void enterVariableDeclaratorId(@NotNull JavaParser.VariableDeclaratorIdContext ctx) {

            }

            @Override
            public void exitVariableDeclaratorId(@NotNull JavaParser.VariableDeclaratorIdContext ctx) {

            }

            @Override
            public void enterCompilationUnit(@NotNull JavaParser.CompilationUnitContext ctx) {

            }

            @Override
            public void exitCompilationUnit(@NotNull JavaParser.CompilationUnitContext ctx) {

            }

            @Override
            public void enterElementValue(@NotNull JavaParser.ElementValueContext ctx) {

            }

            @Override
            public void exitElementValue(@NotNull JavaParser.ElementValueContext ctx) {

            }

            @Override
            public void enterClassOrInterfaceType(@NotNull JavaParser.ClassOrInterfaceTypeContext ctx) {

            }

            @Override
            public void exitClassOrInterfaceType(@NotNull JavaParser.ClassOrInterfaceTypeContext ctx) {

            }

            @Override
            public void enterTypeArgumentsOrDiamond(@NotNull JavaParser.TypeArgumentsOrDiamondContext ctx) {

            }

            @Override
            public void exitTypeArgumentsOrDiamond(@NotNull JavaParser.TypeArgumentsOrDiamondContext ctx) {

            }

            @Override
            public void enterAnnotationTypeElementDeclaration(@NotNull JavaParser.AnnotationTypeElementDeclarationContext ctx) {

            }

            @Override
            public void exitAnnotationTypeElementDeclaration(@NotNull JavaParser.AnnotationTypeElementDeclarationContext ctx) {

            }

            @Override
            public void enterBlockStatement(@NotNull JavaParser.BlockStatementContext ctx) {

            }

            @Override
            public void exitBlockStatement(@NotNull JavaParser.BlockStatementContext ctx) {

            }

            @Override
            public void enterAnnotationTypeBody(@NotNull JavaParser.AnnotationTypeBodyContext ctx) {

            }

            @Override
            public void exitAnnotationTypeBody(@NotNull JavaParser.AnnotationTypeBodyContext ctx) {

            }

            @Override
            public void enterQualifiedNameList(@NotNull JavaParser.QualifiedNameListContext ctx) {

            }

            @Override
            public void exitQualifiedNameList(@NotNull JavaParser.QualifiedNameListContext ctx) {

            }

            @Override
            public void enterCreator(@NotNull JavaParser.CreatorContext ctx) {

            }

            @Override
            public void exitCreator(@NotNull JavaParser.CreatorContext ctx) {

            }

            @Override
            public void enterMemberDeclaration(@NotNull JavaParser.MemberDeclarationContext ctx) {

            }

            @Override
            public void exitMemberDeclaration(@NotNull JavaParser.MemberDeclarationContext ctx) {

            }

            @Override
            public void enterMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx) {

            }

            @Override
            public void exitMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx) {

            }

            @Override
            public void enterAnnotationTypeElementRest(@NotNull JavaParser.AnnotationTypeElementRestContext ctx) {

            }

            @Override
            public void exitAnnotationTypeElementRest(@NotNull JavaParser.AnnotationTypeElementRestContext ctx) {

            }

            @Override
            public void enterResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx) {

            }

            @Override
            public void exitResourceSpecification(@NotNull JavaParser.ResourceSpecificationContext ctx) {

            }

            @Override
            public void enterConstructorDeclaration(@NotNull JavaParser.ConstructorDeclarationContext ctx) {

            }

            @Override
            public void exitConstructorDeclaration(@NotNull JavaParser.ConstructorDeclarationContext ctx) {

            }

            @Override
            public void enterResource(@NotNull JavaParser.ResourceContext ctx) {

            }

            @Override
            public void exitResource(@NotNull JavaParser.ResourceContext ctx) {

            }

            @Override
            public void enterElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx) {

            }

            @Override
            public void exitElementValuePair(@NotNull JavaParser.ElementValuePairContext ctx) {

            }

            @Override
            public void enterMethodBody(@NotNull JavaParser.MethodBodyContext ctx) {

            }

            @Override
            public void exitMethodBody(@NotNull JavaParser.MethodBodyContext ctx) {

            }

            @Override
            public void enterArrayInitializer(@NotNull JavaParser.ArrayInitializerContext ctx) {

            }

            @Override
            public void exitArrayInitializer(@NotNull JavaParser.ArrayInitializerContext ctx) {

            }

            @Override
            public void enterNonWildcardTypeArgumentsOrDiamond(@NotNull JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {

            }

            @Override
            public void exitNonWildcardTypeArgumentsOrDiamond(@NotNull JavaParser.NonWildcardTypeArgumentsOrDiamondContext ctx) {

            }

            @Override
            public void enterPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx) {

            }

            @Override
            public void exitPrimitiveType(@NotNull JavaParser.PrimitiveTypeContext ctx) {

            }

            @Override
            public void enterNonWildcardTypeArguments(@NotNull JavaParser.NonWildcardTypeArgumentsContext ctx) {

            }

            @Override
            public void exitNonWildcardTypeArguments(@NotNull JavaParser.NonWildcardTypeArgumentsContext ctx) {

            }

            @Override
            public void enterArrayCreatorRest(@NotNull JavaParser.ArrayCreatorRestContext ctx) {

            }

            @Override
            public void exitArrayCreatorRest(@NotNull JavaParser.ArrayCreatorRestContext ctx) {

            }

            @Override
            public void enterInterfaceMemberDeclaration(@NotNull JavaParser.InterfaceMemberDeclarationContext ctx) {

            }

            @Override
            public void exitInterfaceMemberDeclaration(@NotNull JavaParser.InterfaceMemberDeclarationContext ctx) {

            }

            @Override
            public void enterGenericConstructorDeclaration(@NotNull JavaParser.GenericConstructorDeclarationContext ctx) {

            }

            @Override
            public void exitGenericConstructorDeclaration(@NotNull JavaParser.GenericConstructorDeclarationContext ctx) {

            }

            @Override
            public void enterLiteral(@NotNull JavaParser.LiteralContext ctx) {

            }

            @Override
            public void exitLiteral(@NotNull JavaParser.LiteralContext ctx) {

            }

            @Override
            public void enterSwitchBlockStatementGroup(@NotNull JavaParser.SwitchBlockStatementGroupContext ctx) {

            }

            @Override
            public void exitSwitchBlockStatementGroup(@NotNull JavaParser.SwitchBlockStatementGroupContext ctx) {

            }

            @Override
            public void visitTerminal(@NotNull TerminalNode node) {

            }

            @Override
            public void visitErrorNode(@NotNull ErrorNode node) {

            }

            @Override
            public void enterEveryRule(@NotNull ParserRuleContext ctx) {

            }

            @Override
            public void exitEveryRule(@NotNull ParserRuleContext ctx) {

            }
        }, tree); // initiate walk of tree with listener

    }

    public static String inputStream2String(InputStream is)   throws IOException {
        ByteArrayOutputStream baos   =   new   ByteArrayOutputStream();
        int   i=-1;
        while((i=is.read())!=-1){
            baos.write(i);
        }
        return   baos.toString();
    }
}