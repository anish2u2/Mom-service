package org.app.mom.factory;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationContextBeanFactory implements org.app.mom.contracts.factory.ApplicationContext {

	private static ApplicationContextBeanFactory factory;

	private Logger logger = Logger.getLogger(this.getClass().getName());

	@Autowired
	private ApplicationContext context;

	public ApplicationContextBeanFactory() {

	}

	public static org.app.mom.contracts.factory.ApplicationContext getInstance() {

		return factory;
	}

	@Bean(name = "appContext")
	@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
	public org.app.mom.contracts.factory.ApplicationContext instantiate() {
		logger.info("Returning Application context.");
		if (factory == null)
			factory = new ApplicationContextBeanFactory();
		return factory;
	}

	@SuppressWarnings("unchecked")
	@Override
	public Object getBean(@SuppressWarnings("rawtypes") Class type) {
		return context.getBean(type);
	}

}
