package com.design.patterns.j2ee.serviceLocator;

/**
 * The service locator design pattern is used when we want to locate
 * various services using JNDI lookup. Considering high cost of 
 * looking up JNDI for a service, Service Locator pattern makes use 
 * of caching technique. For the first time a service is required, 
 * Service Locator looks up in JNDI and caches the service object.
 * Further lookup or same service via Service Locator is done in its
 * cache which improves the performance of application to great extent
 * 
 * @author asax22
 *
 */
public class ServiceLocatorPatternDemo {
	   public static void main(String[] args) {
	      Service service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();
	      service = ServiceLocator.getService("Service1");
	      service.execute();
	      service = ServiceLocator.getService("Service2");
	      service.execute();		
	   }
	}
