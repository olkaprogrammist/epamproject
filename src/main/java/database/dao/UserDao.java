package database.dao;


import database.entities.UserEntity;
import database.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.security.MessageDigest;
import java.util.List;

/**
 * Created by Olga on 13.08.2017.
 */
public class UserDao extends DaoInterfaceImp<UserEntity, String> {
    public UserDao() {
        super(UserEntity.class);
    }

    public boolean isLoginExist(String login) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query = s.createQuery("FROM UserEntity where login =:userLogin");
        query.setParameter("userLogin", login);
        boolean flag = query.list().size() != 0;
        s.close();
        return flag;
    }


    public boolean isUserCorrect(String login, String password) {
        //вставить логирование
        System.out.println("логин: " + login + ", пароль: " + password);
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;

        query = s.createQuery("FROM UserEntity where login=:userLogin");
        query.setParameter("userLogin", login);

        List<UserEntity> list = query.list();
        if (list.size() != 0) {
            return list.get(0).getPassword().equals(password);
        } else return false;
    }

    public String getRole(String login){
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;

        query = s.createQuery("FROM UserEntity where login=:userLogin");
        query.setParameter("userLogin", login);

        List<UserEntity> list = query.list();
        if (list.size() != 0) {
            return list.get(0).getRole();
        } else return null;
    }

}
