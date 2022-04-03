package com.example.http;

import com.example.http.dto.Account;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("hello");


		// Object Mapper의 역할
		// Text Json -> Object
		// Object -> Text Json

		// Controller req json -> object
		// Response obejct -> json

		var objectMapper = new ObjectMapper();


		// object --> text 가 될 때는 object mapper가 get method를 활용한다.
		// 따라서 해당 클래스 내에 get 메서드가 있어야 하고, 사용자가 만든 custom get메서드가 생기지 않게 유의한다.(오류남)
		var account = new Account("yunji",30,"010-8205-1201");
		var text = objectMapper.writeValueAsString(account);

		System.out.println(text);

		//text --> object 가 될 때는 default 생성자가 필수로 필요하다.
		var object = objectMapper.readValue(text,Account.class);
		System.out.println(object);

	}



}
