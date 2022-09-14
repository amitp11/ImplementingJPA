package com.example.casess;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.casess.dao.CasesRepo;
import com.example.casess.modal.Cases;

@SpringBootTest
class CasessApplicationTests {

	@Autowired
	private CasesRepo casesRepo;
	
	@Test
	public void testSave() {
		Cases c = new Cases();
		c.setId(20);
		c.setCase_number("ABCDEFG");
		c.setCreate_at(new Date());
		casesRepo.save(c);
		
		assertEquals(c,casesRepo.findById(c.getId()));
	}

}
