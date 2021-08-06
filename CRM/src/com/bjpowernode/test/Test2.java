package com.bjpowernode.test;

import com.bjpowernode.dao.StudentDao;
import com.bjpowernode.domain.Student;
import com.bjpowernode.util.SqlSessionUtil;
import com.bjpowernode.vo.StudentAndClassroom;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        StudentDao studentDao = SqlSessionUtil.getSession().getMapper(StudentDao.class);

//        Student s = studentDao.select1("A0001");
//        System.out.println(s);

//        List<Student> sList = studentDao.select2(23);
//        for(Student s:sList){
//            System.out.println(s);
//        }

//        List<Student> sList =  studentDao.select3("zl",23);
//        for(Student s:sList){
//            System.out.println(s);
//        }

//        Student s = new Student();
//        s.setName("zl");
//        s.setAge(23);
//        List<Student> sList = studentDao.select4(s);
//        for(Student s1:sList){
//            System.out.println(s1);
//        }

//        Map<String,Object> map = new HashMap<>();
//        map.put("name","zl");
//        map.put("age",23);
//        List<Student> sList = studentDao.select5(map);
//        for(Student s1:sList){
//            System.out.println(s1);
//        }

//        List<Student> sList = studentDao.select6("z");
//        for(Student s1:sList){
//            System.out.println(s1);
//        }

//        String name = studentDao.select7("A0001");
//        System.out.println(name);

//        List<Map<String,Object>> mapList = studentDao.select8();
//        for(Map<String,Object> map:mapList){
//            Set<String> set = map.keySet();
//            for(String key:set){
//                System.out.println("key:"+key);
//                System.out.println("value:"+map.get(key));
//            }
//            System.out.println("========");
//        }

//        String strArr[] = {"A0001","A0003"};
//        List<Student> sList = studentDao.select9(strArr);
//        for(Student s1:sList){
//            System.out.println(s1);
//        }

//        Student s = studentDao.select10("A0001");
//        System.out.println(s);

//        List<Map<String,Object>> mapList = studentDao.select11();
//        for(Map<String,Object> map:mapList){
//            Set<String> set = map.keySet();
//            for(String key:set){
//                System.out.println("key:"+key);
//                System.out.println("value:"+map.get(key));
//            }
//            System.out.println("========");
//        }
        List<StudentAndClassroom> voList = studentDao.select12();
        for(StudentAndClassroom vo:voList){
            System.out.println(vo);
        }
    }
}
