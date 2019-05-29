package spring.basic.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import spring.basic.demo.shapes.Triangle;

public class DrawingApp {

    public static void main(String[]args) {
        BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));

        Triangle triangle = (Triangle) beanFactory.getBean("triangle");
        triangle.draw();
    }

}
