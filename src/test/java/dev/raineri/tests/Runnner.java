package dev.raineri.tests;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runnner {

    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Class testSuite = SimpleTests.class;
        Constructor<SimpleTests> constructor = testSuite.getConstructors()[0];
        SimpleTests o = constructor.newInstance();
        Method[] methods = o.getClass().getDeclaredMethods();

        for(Method m : methods){

            if(m.isAnnotationPresent(Test.class)){

                try{
                    m.invoke(o);
                    System.out.println(m.getName() + " PASSED :)");
                }catch(Throwable t){
                    System.out.println(m.getName() + " FAILED :(");
                }
            }

        }

    }
}
