import com.itheima.dao.UserDao;
import com.itheima.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2021/9/25 14:07
 */
public class TestMybatis {

    private InputStream in;

    private SqlSessionFactory sqlSessionFactory;

    private SqlSession sqlSession;

    @Before
    public void init() throws Exception{
        in = Resources.getResourceAsStream("sqlMapConfig.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sqlSessionFactory.openSession(true);
    }

    @Test
    public void testFindAll() {
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
    }


    @Test
    public void testSaveUser() {
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        User user = new User();
        user.setUsername("菜鸡");
        user.setSex('男');
        user.setBirthday(new Date());
        user.setAddress("长沙");
        int result = userDao.saveUser(user);
        if (result > 0) {
            System.out.println("用户保存成功！");
        }
    }



    @After
    public void end() throws Exception{
        in.close();
        sqlSession.close();
    }

}
