package org.app.mom.contracts.factory;

public interface ApplicationContext {

	public Object getBean(@SuppressWarnings("rawtypes") Class type);

}
