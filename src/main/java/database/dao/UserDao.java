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
        Session s = HibernateUtil.getSessionFactory().openSession();
        Query query;

        query = s.createQuery("FROM UserEntity where login=:userLogin");
        query.setParameter("userLogin", login);

        List<UserEntity> list = query.list();
        if (list.size() != 0) {
            password += list.get(0).getPassword();
            byte[] passHash;

            MessageDigest md = null;
            try {
                md = MessageDigest.getInstance("SHA-256");
                md.update(password.getBytes("UTF-8"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            passHash = md.digest();
            return (slowEquals(list.get(0).getPassword().getBytes(), passHash));
        } else return false;
    }

    private static boolean slowEquals(byte[] a, byte[] b) {
        int diff = a.length ^ b.length;
        for (int i = 0; i < a.length && i < b.length; i++)
            diff |= a[i] ^ b[i];
        return diff == 0;
    }

}
