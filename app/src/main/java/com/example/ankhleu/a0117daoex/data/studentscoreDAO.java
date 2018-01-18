package com.example.ankhleu.a0117daoex.data;

import java.util.ArrayList;

/**
 * Created by ankhleu on 2018/1/17.
 */

public class studentscoreDAO {

    public ArrayList<student> mylist;

    public studentscoreDAO()
    {
        mylist=new ArrayList<>();
    }

    //public void add(student s) //此處為void add方法
    public boolean add(student s)
    {
        mylist.add(s);
        return true;//此為改boolean後加入回傳數值
    }


    public ArrayList<student> getList() {  //此處測試Arraylist內可裝的object
        return mylist;
    }

    public student getstudent(int id)
    {
        for (student s:mylist)
        {
            if (s.id==id)
            {
                return s;
            }
        }
        return null;
    }

    public boolean updatename(student s) //此處測試如果mylist.id=student.id,則mylist.name=student.name;
    {
        for (student t:mylist)
        {
            if (t.id==s.id)
            {
                t.name=s.name;
                return true;
            }
        }
        return false;
    }

    public boolean updatescore(student s)//此處測試如果mylist.id=student.id,則mylist.score=student.score;
    {
        for (student t1:mylist)
        {
            if (t1.id==s.id)
            {
                t1.score=s.score;
                return true;
            }
        }
        return false;
    }

    public boolean delete(int id)   //此處測試如果mylist的資料筆數！student的資料筆數，則mylist資料刪除;
    {
        for (int i=0;i<mylist.size();i++)
        {
            if (mylist.get(i).id==id)
            {
                mylist.remove(i);
                return true;
            }
        }
        return false;
    }

}
