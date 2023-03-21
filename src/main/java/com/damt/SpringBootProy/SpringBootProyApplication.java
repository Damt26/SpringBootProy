package com.damt.SpringBootProy;

import com.damt.SpringBootProy.bean.BeanWithProperties;
import com.damt.SpringBootProy.bean.MyBean;
import com.damt.SpringBootProy.bean.OperationWithDependency;
import com.damt.SpringBootProy.component.ComponentDependency;
import com.damt.SpringBootProy.pojo.UserPojo;
import com.damt.SpringBootProy.repository.CategoriaRepository;
import com.damt.SpringBootProy.repository.MenuRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProyApplication implements CommandLineRunner {
	private final Log Logger = LogFactory.getLog(SpringBootProyApplication.class);
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private OperationWithDependency operationWithDependency;
	private BeanWithProperties beanWithProperties;
	private UserPojo userPojo;
	private MenuRepository menuRepository;
	private CategoriaRepository categoriaRepository;
	public SpringBootProyApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, OperationWithDependency operationWithDependency, BeanWithProperties beanWithProperties, UserPojo userPojo, MenuRepository menuRepository, CategoriaRepository categoriaRepository){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.operationWithDependency = operationWithDependency;
		this.beanWithProperties = beanWithProperties;
		this.userPojo = userPojo;
		this.menuRepository = menuRepository;
		this.categoriaRepository = categoriaRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		claseAnterior();
		categoriaRepository.findAll().stream().forEach(System.out::println);
		menuRepository.findAll().stream().forEach(System.out::println);
	}

	private void claseAnterior(){
		componentDependency.saludar();
		myBean.print();
		operationWithDependency.print();
		System.out.println(beanWithProperties.function());
		System.out.println(userPojo.toString());
		Logger.error("FFFFFFFFFFFFFFFF");
	}
}
