package com.zrm.serial;

import java.io.*;

/**
 * Created by zrm on 2016-03-15 17:16.
 */
public class SerialTest {

    public static void main(String args[]){
        //save();
        read();
    }

    public static void read(){
        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("d:/student2.ser"));
            Student student = (Student) inputStream.readObject();
            System.out.print(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void save(){
        Student student = new Student();
        student.setName("张三");
        student.setAge(100);

        ObjectOutputStream outputStream = null;
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream("d:/student2.ser"));
            outputStream.writeObject(student);
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}

/*class Student implements Serializable{


    private static final long serialVersionUID = 4919912360745177863L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}*/

class Student implements Serializable{


    private static final long serialVersionUID = 4919912360745177863L;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
