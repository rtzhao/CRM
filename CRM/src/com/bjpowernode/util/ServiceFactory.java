package com.bjpowernode.util;

/**
 * Author 北京动力节点
 */
public class ServiceFactory {

    //传递zs对象，得到ls对象的过程
    public static Object getService(Object service){

        return new TransactionInvocationHandler(service).getProxy();

    }

}
