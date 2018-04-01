package org.qinnan;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Method;
import java.util.Date;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.qinnan.user.entity.User;
import org.qinnan.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.wltea.analyzer.core.IKSegmenter;
import org.wltea.analyzer.core.Lexeme;
import org.wltea.analyzer.lucene.IKAnalyzer;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:/applicationContext.xml"})
public class JunitTest {
	
	@Autowired
    @Qualifier("userServiceImpl")
	private UserService userService;
	


	@Test
	public void test0(){
		System.out.println(userService.getUserById(1));
	}
	@Test
	public void test1(){
		userService.findAop();
	}
	@Test
	public void test2(){
		userService.anotation(new User());
	}
	@Test
	public void test3(){
	        String text="速度与激情,传智播客,覃楠覃楠";  
	        StringReader sr=new StringReader(text);  
	        IKSegmenter ik=new IKSegmenter(sr, true);  
	        Lexeme lex=null;  
	        try {
				while((lex=ik.next())!=null){  
				    System.out.print(lex.getLexemeText()+"|");  
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
	}
	@Test
	public void test4() throws IOException{
		        String text="基于java语言开发的轻量级的中文分词工具包";  
		        //创建分词对象  
		        Analyzer anal=new IKAnalyzer(true);       
		        StringReader reader=new StringReader(text);  
		        //分词  
		        TokenStream ts=anal.tokenStream("", reader);  
		        CharTermAttribute term=ts.getAttribute(CharTermAttribute.class);  
		        //遍历分词数据  
		        while(ts.incrementToken()){  
		            System.out.print(term.toString()+"|");  
		        }  
		        reader.close();  
		        System.out.println();  
	}
	
	
	@Test
	public void test5(){
		User entity = new User();
		entity.setAddress("民治糖水围村一街");
		entity.setBirthDay(new Date());
		entity.setPhoneNum("13590485605");
		entity.setEmail("qinnan410@126.com");
		entity.setUsername("覃楠");
		userService.insert(entity);
	}
	@Test
	public void test6(){
		ApplicationContext app = new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		MyProperties entity = (MyProperties) app.getBean("myProperties");
		System.out.println(entity.getList());
		try {
			MyProperties entity2 = (MyProperties) Class.forName("org.qinnan.MyProperties").newInstance();
			System.out.println(entity2);
			Method method = null;
			Method[] methods = entity2.getClass().getDeclaredMethods();
			for (int i = 0; i < methods.length; i++) {
				if(methods[i].getName().equals("setList")){
					method = methods[i];
				}
			}
			method.invoke(entity2, entity.getList());
			System.out.println(entity2);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
