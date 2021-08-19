package serialization;

import javax.print.attribute.standard.MediaSize;
import java.io.*;
import java.time.Period;


/**
 * 序列化 对象 ===> 字符数组
 *  关键类: ObjectOutputStream
 *  关键方法: void writeObject(Object obj)
 * 反序列化 字符数组 ===> 对象
 *  关键类: ObjectInputStream
 *
 */
public class Serialization {
    public static void main(String[] args) throws Exception {
        //writeObj();
        readObj();
    }

    /**
     * 序列化
     * 序列化的时候可以给类手动指定一个序列号(不用系统自动计算)
     */
    public static void writeObj() throws Exception {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("F:\\CodeFiles\\demo\\javase\\OtherFiles\\Person.txt"));
        Person person = new Person("jdd", 18,false);
        person.setXxx(545);
        objectOutputStream.writeObject(person);
        objectOutputStream.close();
    }
    /**
     * 反序列化
     * 1. 实现反序列化必须有原 Person.class文件
     * 2. 静态成员变量属于类,而不属于对象,所以反序列化无法读取静态成员变量
     */
    public static void readObj() throws Exception {

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("F:\\CodeFiles\\demo\\javase\\OtherFiles\\Person.txt"));
        Person person =(Person) objectInputStream.readObject();
        System.out.println(person);
        objectInputStream.close();
    }
}
