package com.bsko.config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Пользователь on 12.04.2015.
 */
@WebListener(value = "applicationListener")
public class ApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().setInitParameter("customerUrl", "http://localhost:8080/ejb-testing/resources/customer");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
