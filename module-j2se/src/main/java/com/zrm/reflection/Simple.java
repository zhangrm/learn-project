package com.zrm.reflection;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;

/**
 * Created by zrm on 2016-03-09 15:40.
 */
public class Simple {

    public static void main(String args[]){
        Field[] fields = Student.class.getDeclaredFields();
        Method[] methods = Student.class.getMethods();

        for(Field field:fields){
            System.out.println(field.getType().getName() +"--"+field.getName());
        }

        for(Method method:methods){

            System.out.println(Modifier.toString(method.getModifiers())+"--"+method.getName());
        }

    }

}

enum GenderEnum{
    F("女"),M("男"),N("未知");

    private String name;

    GenderEnum(String name){
        this.name = name;
    }
}

class Student{
    private String name;
    private GenderEnum gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }
}