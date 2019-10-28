package com.ats.job.thymeleaf;

import org.thymeleaf.exceptions.ConfigurationException;
import org.thymeleaf.resourceresolver.FileResourceResolver;
import org.thymeleaf.resourceresolver.IResourceResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

/**
 * Created by wqf19 on 2018/12/7.
 */
public class AHFileTemplateResolver extends TemplateResolver {
    public AHFileTemplateResolver() {
        super.setResourceResolver(new AHFileResourceResolver());
    }

    public void setResourceResolver(IResourceResolver resourceResolver) {
        throw new ConfigurationException("Cannot set a resource resolver on " + this.getClass().getName() + ". If " + "you want to set your own resource resolver, use " + TemplateResolver.class.getName() + "instead");
    }
}
