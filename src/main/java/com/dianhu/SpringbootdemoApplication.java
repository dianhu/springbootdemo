package com.dianhu;

import com.dianhu.comm.ConfigProp;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {

//	public static void main(String[] args) {
//		SpringApplication.run(SpringbootdemoApplication.class, args);
//	}
	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringbootdemoApplication.class, args);
		ConfigProp prop = appContext.getBean(ConfigProp.class);
		System.out.println(prop.getTitle()+"---"+prop.getDescription());
		appContext.close();
	}
}
