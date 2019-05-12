package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	RedisTemplate redisTemplate;
	@Autowired
	StringRedisTemplate stringRedisTemplate;

	@Test
	public void test1(){
		redisTemplate.opsForValue().append("name","hangsan");
	}
	@Test
	public void test2() {
//		redisTemplate.opsForList().leftPush("list","1");
//		redisTemplate.opsForList().leftPush("list","2");
//		redisTemplate.opsForList().leftPush("list","3");
		redisTemplate.opsForList().leftPush("list","4");
//		redisTemplate.opsForList().leftPop("list");
	}

	@Test
	public void contextLoads() {
	}

}
