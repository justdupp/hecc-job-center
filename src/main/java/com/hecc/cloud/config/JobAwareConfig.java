package com.hecc.cloud.config;

import groovy.util.logging.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author xuhoujun
 * @description:
 * @date: created In 1:41 PM on 2019/10/19.
 */
@Component
@Slf4j
public class JobAwareConfig implements ApplicationContextAware {

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    private void initJobHandlerRepository(ApplicationContext applicationContext){
        applicationContext.getBeansWithAnnotation()
    }
}
