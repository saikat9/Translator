package com.cognizant.translatormain;

import java.io.ByteArrayInputStream;
//import java.io.File;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.antlr.v4.gui.Trees;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;
/*import org.apache.xmlbeans.XmlObject;
import org.apache.xmlbeans.XmlOptions;
import org.apache.xmlbeans.impl.inst2xsd.Inst2Xsd;
import org.apache.xmlbeans.impl.inst2xsd.Inst2XsdOptions;
import org.apache.xmlbeans.impl.xb.xsdschema.SchemaDocument;*/

import com.cognizant.antlr4.TDGrammarBaseListener;
import com.cognizant.antlr4.TDGrammarBaseVisitor;
import com.cognizant.antlr4.TDGrammarLexer;
import com.cognizant.antlr4.TDGrammarParser;
import com.cognizant.antlr4.TDGrammarVisitor;
import com.cognizant.model.Parse;
import com.cognizant.translator.Translator;

/**
 * Translator Implementation
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try{
    		
    		
    	TDGrammarLexer lexer = new TDGrammarLexer(CharStreams.fromString("SEL col1 from apr_emp;"));
    	CommonTokenStream tokens = new CommonTokenStream(lexer);
    	final TDGrammarParser parser = new TDGrammarParser(tokens);
    	final ParseTree tree = parser.parse();
    	/*TDGrammarVisitor tDGrammarVisitor=new TDGrammarBaseVisitor<>();
    	Object obj=tDGrammarVisitor.visit(tree);
    	ParserRuleContext prc=parser.getContext();*/
    	Trees.inspect(tree, parser);
    	final StringBuilder generatedXml =new StringBuilder();
    	generatedXml.append("");
    	generatedXml.append("\n");
    	ParseTreeWalker.DEFAULT.walk(new TDGrammarBaseListener()
    	{
    	    final String INDENT = "    ";
    	       	    
    	    int level = 0;
    	    @Override
    	    public void enterEveryRule(final ParserRuleContext ctx)
    	    {
    	        generatedXml.append(String.format("%s<%s>%n", indent(), parser.getRuleNames()[ctx.getRuleIndex()]));
    	        ++level;
    	        super.enterEveryRule(ctx);
    	        System.out.println(ctx.getText());
    	        System.out.println(ctx.getPayload().getRuleContext());
    	        System.out.println(ctx);
    	        
    	    }

    	    @Override
    	    public void exitEveryRule(final ParserRuleContext ctx)
    	    {
    	        --level;
    	        generatedXml.append(String.format("%s</%s>%n", indent(), parser.getRuleNames()[ctx.getRuleIndex()]));
    	        super.exitEveryRule(ctx);
    	        
    	    }

    	    @Override
    	    public void visitTerminal(final TerminalNode node)
    	    {
    	        final String value = node.getText();
    	      /*  System.out.println(node.getParent().getText());*/
    	        
    	        if (!value.matches("\\s+"))
    	        {
    	        	if(!node.getText().equals("<EOF>")){
    	        		
    	            /*generatedXml.append(String.format("%s<terminal>%s</terminal>%n", indent(), node.getText()));*/
    	        		/*System.out.println(node.getText());*/
    	        		
    	        		/*System.out.println(node.getParent().getText());*/
    	        		
    	        	}
    	        }
    	        super.visitTerminal(node);
    	    }

    	    private String indent()
    	    {
    	        return String.join("", Collections.nCopies(level, INDENT));
    	    }
    	}, tree);
    	
    	System.out.println(generatedXml);
    	
    	/*final Inst2XsdOptions options = new Inst2XsdOptions();
	    options.setDesign(Inst2XsdOptions.SIMPLE_CONTENT_TYPES_STRING);
	    final XmlObject[] xml = new XmlObject[] {XmlObject.Factory.parse(generatedXml.toString())};
	    final SchemaDocument[] schemaDocs = Inst2Xsd.inst2xsd(xml, options);
	    
	    schemaDocs[0].save(new File("C:/Antlr_Workspace/Antlr4MavenPlSql/src/main/resources/AntlrTest.xsd"), new XmlOptions().setSavePrettyPrint());*/
	    
	    
	/*    JAXBContext jaxbContext = JAXBContext.newInstance(Parse.class);

		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		Parse parse = (Parse) jaxbUnmarshaller
				.unmarshal(new ByteArrayInputStream(generatedXml.toString().getBytes(Charset.forName("UTF-8"))));
		
		buildOutputQuery(parse);
		System.out.println(parse.getSqlStmtList().getSqlStmt().get(0).getSelectStmt().getSelectExpr().get(0).getTerminal().getValue());*/
		
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    	
    }
    
    
    @SuppressWarnings("unchecked")
	private static void buildOutputQuery(Object obj) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException {
    	
    	String implClassName = "com.cognizant.translatorimpl."+obj.getClass().getSimpleName()+"Impl";
    	Class<?> translatorImplName = Class.forName(implClassName);
    	Translator translatorImplClass = (Translator) translatorImplName.newInstance();
    	translatorImplClass.applyRule(obj);

        Field[] fields = obj.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
           if (fields[i].get(obj) != null){
           if(fields[i].get(obj).getClass().getSimpleName().equals("Terminal")){
                   continue;
           }else if("List".equals(fields[i].getType().getSimpleName()) && fields[i].get(obj) != null){
           for (Object o : ((Collection<Object>) fields[i].get(obj))) {
                 if (!"Terminal".equals(o.getClass().getSimpleName())) {
                	 buildOutputQuery(o);
                 }
           }
           }else
        	   buildOutputQuery(fields[i].get(obj));
           }
       }

    }

}