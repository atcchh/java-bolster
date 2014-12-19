package com.cango.jmx.exmaple;

/**
 * Created by caoyanfei079 on 11/27/14.
 */
import java.lang.management.*;
import javax.management.*;
public class Main {
    private static ObjectName objectName ;
    private static MBeanServer mBeanServer;
    public static void main(String[] args) throws Exception{
//        init();
//        manage();
        System.out.println(93&-8);
    }
    private static void init() throws Exception{

        HelloMBean serverMonitor = new Hello();
        mBeanServer = MBeanServerFactory.createMBeanServer();
        objectName = new ObjectName("objectName:id=serverMonitor");
        mBeanServer.registerMBean(serverMonitor,objectName);
    }
    private static void manage() throws Exception{
        System.out.println(mBeanServer.getMBeanInfo(objectName));

        String upTime = (String) mBeanServer.getAttribute(objectName,
                "Name");
        System.out.println(upTime);
    }

}