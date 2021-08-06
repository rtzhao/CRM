package com.bjpowernode.test;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import com.bjpowernode.service.impl.StudentServiceImpl;
import com.bjpowernode.util.ServiceFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Author 北京动力节点
 */
public class Test1 {

    public static void main(String[] args) {

        //StudentService ss = new StudentServiceImpl();
        StudentService ss = (StudentService) ServiceFactory.getService(new StudentServiceImpl());

        //测试添加操作
//        Student s = new Student();
//        s.setId("A0007");
//        s.setName("cxk");
//        s.setAge(23);
//        ss.save(s);

//        //测试根据id查单条操作
//        Student s = ss.getById("A0001");
//        System.out.println(s);

        //查询所有记录
        List<Student> sList = ss.getAll();
        for(Student s:sList){
            System.out.println(s);
        }
    }

}






























