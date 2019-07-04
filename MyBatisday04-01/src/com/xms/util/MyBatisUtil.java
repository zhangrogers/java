package com.xms.util;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * JavaProject
 * 2019/7/4
 * 23:42
 * zz
 */
public class MyBatisUtil {
    private static SqlSessionFactory ssf;
    static{
        SqlSessionFactoryBuilder ssfb=new SqlSessionFactoryBuilder();
        ssf= ssfb.build(MyBatisUtil.class.getClassLoader().getResourceAsStream("iBatis.xml"));
    }
    public static SqlSession getSession(){
        return ssf.openSession();
    }
    public static SqlSession getSession(boolean isTrue){
        return ssf.openSession(isTrue);
    }

    public static void main(String[] args) {
        System.out.println(getSession());
    }
}
