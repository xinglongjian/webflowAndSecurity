package com.xinglongjian.config;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.webflow.definition.registry.FlowDefinitionRegistry;

public class FlowRegistryClassPathPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		if(bean instanceof FlowDefinitionRegistry) {
            alterRegistry((FlowDefinitionRegistry) bean);
        }
        return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		// TODO Auto-generated method stub
		return bean;
	}
	
	protected void alterRegistry(FlowDefinitionRegistry registry) {
        for(String flowId : registry.getFlowDefinitionIds()) {
            ApplicationContext ctx = registry.getFlowDefinition(flowId).getApplicationContext();
            overrideResourceLoader((GenericApplicationContext) ctx);
        }
    }
	
	/**
     * Override the ResourceLoader:
     * We know our flow is always defined as "templates/module1".
     * From the context we can derive the name of the flow (module1)
     * So we build up the ClassPathResource base as:
     * "templates/"+ ctx.getResource("")+ "/"
     * 
     * @param ctx
     */
    protected void overrideResourceLoader(GenericApplicationContext ctx) {
    	final ClassPathResource cpr = new ClassPathResource("templates/"+ctx.getResource("").getFilename()+"/");

    	ctx.setResourceLoader(new ResourceLoader() {
        	
        	public ClassLoader getClassLoader() {
        		return cpr.getClassLoader();
        	}

        	public Resource getResource(String location) {
        		return new CustomClassPathContextResource(cpr.getPath() + location, getClassLoader());
        	}
        });
    }

}
