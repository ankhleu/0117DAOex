package com.example.ankhleu.a0117daoex;

import com.example.ankhleu.a0117daoex.data.student;
import com.example.ankhleu.a0117daoex.data.studentscoreDAO;

import org.junit.Test;

import java.util.AbstractList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

 /*
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void test1() throws Exception
    {
        assertEquals(8,2+6);
    }

    @Test
    public void test2() throws Exception
    {
        Mytest1 t=new Mytest1();
        assertEquals(8,t.getAdd(2,6));
        //assertEquals(8,t.getAdd(2,7));此處錯誤，因為getAdd為i1+i2, 8!2+7所以測試不過
    }
*/

/*    @Test
    public void test_add_data1()throws Exception
    {
        studentscoreDAO dao=new studentscoreDAO();
        dao.add(new student(1,"Julie",98));
        dao.add(new student(2,"Cathy",88));
        for (student s:dao.getList())
        {
            System.out.println(s.id+","+s.name+","+s.score); //此處為取出id,name,score
        }
    }

    @Test
    public void test_add_data2() throws Exception
    {
        studentscoreDAO dao=new studentscoreDAO();
        dao.add(new student(1,"Julie",98));
        dao.add(new student(2,"Cathy",88));
        //assertEquals(88,dao.getList().get(2).score); 此處88為第二筆資料，id編號在這列為1
        assertEquals(88,dao.getList().get(1).score); //此處get(0)陣列資料排序為0,1，所以第一筆為o
    }
*/

/*    @Test
    public void test_getstudent() throws Exception
    {
        studentscoreDAO dao=new studentscoreDAO();
        dao.add(new student(1,"Julie",98));
        dao.add(new student(2,"Cathy",88));
        assertEquals(98,dao.getList().get(0).score); //測試list上分數是否相同
    }
    @Test
    public void test_getstudent2()throws Exception
    {
        studentscoreDAO dao=new studentscoreDAO();
        dao.add(new student(1,"Julie",98));
        dao.add(new student(2,"Cathy",88));
        assertEquals(null,dao.getstudent(3));   //測試如果list以外的id編碼，是否傳回null
    }
    */
/*
    @Test
    public void test_updatename() throws Exception
    {
        studentscoreDAO dao=new studentscoreDAO();
        dao.add(new student(1,"Julie",98));
        dao.add(new student(2,"Cathy",88));
        dao.updatename(new student(1,"Ami",98));//update name,不改分
        assertEquals(98,dao.getstudent(1).score);//比對score 跟id是否相同

    }
    @Test
    public void test_updatescore()throws Exception
    {
        studentscoreDAO dao=new studentscoreDAO();
        dao.add(new student(1,"Julie",98));
        dao.add(new student(2,"Cathy",88));
        dao.updatescore(new student(1,"Julie",60));//update score,不改名
        assertEquals(60,dao.getstudent(1).score);//比對分數跟id是否相同
    }
*/
    @Test
    public void test_delete()throws Exception
    {
        studentscoreDAO dao=new studentscoreDAO();
        dao.add(new student(1,"Julie",98));
        dao.add(new student(2,"Cathy",88));
        dao.delete(2);
        //assertEquals(2,dao.getList().size());
        //assertEquals(1,dao.getList().size());//自己的比對寫法，好像也可以
        assertEquals(1,dao.getstudent(1).id);
    }





}