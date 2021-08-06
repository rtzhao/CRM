package com.bjpowernode.dao;

import com.bjpowernode.domain.Student;
import com.bjpowernode.vo.StudentAndClassroom;

import java.util.List;
import java.util.Map;

/**
 * Author 北京动力节点
 */
public interface StudentDao {

    public Student getById(String id);

    public void save(Student s);

    List<Student> getAll();

    Student select1(String a0001);

    List<Student> select2(int i);

//    List<Student> select3(String zl, int i);

    List<Student> select4(Student s);

    List<Student> select5(Map<String, Object> map);

    List<Student> select6(String z);

    String select7(String a0001);

    List<Map<String, Object>> select8();

    List<Student> select9(String[] strArr);

    Student select10(String a0001);

    List<Map<String, Object>> select11();

    List<StudentAndClassroom> select12();
}
