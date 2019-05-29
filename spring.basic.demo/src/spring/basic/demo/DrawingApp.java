package spring.basic.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import spring.basic.demo.shapes.Triangle;

import java.applet.AppletContext;

public class DrawingApp {

    public static void main(String[]args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) applicationContext.getBean("triangle");
        triangle.draw();
    }

}
