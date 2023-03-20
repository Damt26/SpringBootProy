package com.damt.SpringBootProy;

import com.damt.SpringBootProy.bean.MyBean;
import com.damt.SpringBootProy.bean.OperationWithDependency;
import com.damt.SpringBootProy.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProyApplication implements CommandLineRunner {
	private ComponentDependency componentDependency;
	private MyBean myBean;
	private OperationWithDependency operationWithDependency;
	public SpringBootProyApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, MyBean myBean, OperationWithDependency operationWithDependency){
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.operationWithDependency = operationWithDependency;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		operationWithDependency.print();
	}
}
