package com.ats.job.thymeleaf;

import com.ahiup.io.AHFile;
import com.ahiup.io.imp.AHFileInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.TemplateProcessingParameters;
import org.thymeleaf.resourceresolver.FileResourceResolver;
import org.thymeleaf.resourceresolver.IResourceResolver;
import org.thymeleaf.util.Validate;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by wqf19 on 2018/12/7.
 */
public class AHFileResourceResolver implements IResourceResolver {
    private static final Logger logger = LoggerFactory.getLogger(AHFileResourceResolver.class);
    public static final String NAME = "FILE";
    @Override
    public String getName() {
        return "FILE";
    }

    @Override
    public InputStream getResourceAsStream(TemplateProcessingParameters templateProcessingParameters, String resourceName) {
        Validate.notNull(resourceName, "Resource name cannot be null");
        try {
            File resourceFile = new AHFile(resourceName);
            return new AHFileInputStream(resourceFile);
        } catch (Exception var5) {
            if(logger.isDebugEnabled()) {
                if(logger.isTraceEnabled()) {
                    logger.trace(String.format("[THYMELEAF][%s][%s] Resource \"%s\" could not be resolved. This can be normal as maybe this resource is not intended to be resolved by this resolver. Exception is provided for tracing purposes: ", new Object[]{TemplateEngine.threadIndex(), templateProcessingParameters.getTemplateName(), resourceName}), var5);
                } else {
                    logger.debug(String.format("[THYMELEAF][%s][%s] Resource \"%s\" could not be resolved. This can be normal as maybe this resource is not intended to be resolved by this resolver. Exception message is provided: %s: %s", new Object[]{TemplateEngine.threadIndex(), templateProcessingParameters.getTemplateName(), resourceName, var5.getClass().getName(), var5.getMessage()}));
                }
            }

            return null;
        }
    }
    }
