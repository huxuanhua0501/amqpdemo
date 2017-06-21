import net.xuanhuahu.mq.rabbitmq.service.IMqService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by win7 on 2017/6/16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContext.xml"})
public class TestGo01 {
    @Autowired
    private IMqService mqService;
    @Test
    public   void send(){
        String str = "你妹";
        mqService.send(str);
    }
}
