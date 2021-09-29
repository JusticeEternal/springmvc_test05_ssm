import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring5整合junit
 * junit必须为4.12及以上版本
 *
 * @author Jack
 * @version 1.0
 * @date 2021/9/25 11:48
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"}) //如果这里用的是xml配置文件，则需要使用locations属性
public class GetUserService {


    @Autowired
    private UserService userService;

    @Test
    public void testGetUserService() {
        userService.findAll();
    }



}
