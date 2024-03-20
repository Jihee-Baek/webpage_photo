package com.prj.first;
import com.prj.first.person.persontbl;
import com.prj.first.person.persontblRepository;
import com.prj.first.photo.phototbl;
import com.prj.first.photo.phototblRepository;
import com.prj.first.tag.tagtbl;
import com.prj.first.tag.tagtblRepository;

import java.time.LocalDateTime;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JiheeFirstApplicationTests {

	@Autowired
	private phototblRepository photoRepository;
	
	@Autowired
	private persontblRepository personRepository;
	
	@Autowired
	private tagtblRepository tagRepository;
	
	
	@Test
	void testJpa() {

		phototbl p1 = new phototbl();
		p1.setImagepath("photo1.png");
		p1.setTitle("Ong");
		p1.setDesc("Ong Ong Ong");
		p1.setCreateDate(LocalDateTime.now());
		this.photoRepository.save(p1);
		
		persontbl ps1 = new persontbl();
		ps1.setName("옹성우");
		ps1.setRelation("연예인, 가수");
		ps1.setCreateDate(LocalDateTime.now());
		this.personRepository.save(ps1);
		
		Optional<phototbl> op = this.photoRepository.findById(1);
		assertEquals(true, op.isPresent());
		phototbl pt = op.get();
		
		Optional<persontbl> ops = this.personRepository.findById(1);
		assertEquals(true, ops.isPresent());
		persontbl pst = ops.get();
		
		tagtbl tag = new tagtbl();
		tag.setPhoto(pt);
		tag.setPerson(pst);
		this.tagRepository.save(tag);
		
		
	}

}
