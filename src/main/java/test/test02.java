package test;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.hibernate.SessionFactory;

import com.how2java.mapper.CategoryMapper;
import com.how2java.pojo.Books;
import com.how2java.pojo.Category;
import com.how2java.pojo.CategoryExample;


public class test02 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("666666666");
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
	    SqlSession sessionFactory = factory.openSession();
	    System.err.println("ddddd");
	   
	    
        
//		        List<Books> cs=session.selectList("usb","1");
//		 
//		        for (Books c : cs) {
//		            System.out.println(c.getName());
//	}
//		        session.close();

}}
