package cq.study.test;

import javafx.scene.layout.Region;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.Transaction;


public class JedisDemo {
    ApplicationContext applicationContext;
    @Before

    public void init() {
        String configLocation = "spring-redis.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }
    @Test
    public void testJedisPool() {

        JedisPool pool = (JedisPool) applicationContext.getBean("jedisPool");
        Jedis jedis = null;
        try {
            jedis = pool.getResource();
            jedis.set("name", "lisi");

            String name = jedis.get("name");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (jedis != null) {
                // 关闭连接
                jedis.close();
            }
        }
    }
}
