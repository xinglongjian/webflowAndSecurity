package com.xinglongjian.config;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.ContextResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

public class CustomClassPathContextResource extends ClassPathResource implements
		ContextResource {

	 public CustomClassPathContextResource(String path, ClassLoader classLoader) {
	        super(path, classLoader);
	    }

	 public String getPathWithinContext() {
	        return getPath();
	    }

	 public Resource createRelative(String relativePath) {
	        String pathToUse = StringUtils.applyRelativePath(getPath(), relativePath);
	        return new CustomClassPathContextResource(pathToUse, getClassLoader());
	    }

}
