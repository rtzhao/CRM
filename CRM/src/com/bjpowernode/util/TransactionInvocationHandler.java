package com.bjpowernode.util;

import org.apache.ibatis.session.SqlSession;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Author 北京动力节点
 */
public class TransactionInvocationHandler implements InvocationHandler {

    //target:zs
    private Object target;

    public  TransactionInvocationHandler(Object target){

        this.target = target;

    }

    //代理类的业务方法
    //ls的表白方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        SqlSession session = null;
        Object obj = null;

        try{

            session = SqlSessionUtil.getSession();

            //处理业务逻辑
            //method.invoke：zs的表白方法
            obj = method.invoke(target, args);

            //处理业务逻辑完毕后，提交事务

            session.commit();

        }catch(Exception e){

            session.rollback();

            e.printStackTrace();
        }finally {
            SqlSessionUtil.myClose(session);
        }

        return obj;
    }

    //取得ls对象
    public Object getProxy(){

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

    }

}





































