package com.prj.first;
import com.prj.first.person.persontbl;
import com.prj.first.person.persontblRepository;
import com.prj.first.photo.phototbl;
import com.prj.first.photo.phototblRepository;
import com.prj.first.photo_persons.photo_personstbl;
import com.prj.first.photo_persons.photo_persontblRepository;

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
	private photo_persontblRepository photo_personRepository;
	
	@Test
	void testJpa() {
//		phototbl p1 = new phototbl();
//		p1.setImagepath("/User/miguel/workspace_spring/jihee_first/src/main/resources/photo/photo1.png");
//		p1.setTitle("Ong");
//		p1.setDesc("Ong Ong Ong");
//		p1.setCreateDate(LocalDateTime.now());
//		this.photoRepository.save(p1);
		
		
//		List<phototbl> all = this.photoRepository.findAll();
//		assertEquals(1, all.size());
//		phototbl p = all.get(0);
//		assertEquals("Ong", p.getTitle());
		
//		Optional<phototbl> op = this.photoRepository.findById(1);
//		if (op.isPresent()) {
//			phototbl p = op.get();
//			assertEquals("Ong", p.getTitle());
//		}
		
		
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
		
		photo_personstbl pp = new photo_personstbl();
		pp.setPhoto_id(pt.getId());
		pp.setPerson_id(pst.getId());
		this.photo_personRepository.save(pp);
		
		
	}

}
