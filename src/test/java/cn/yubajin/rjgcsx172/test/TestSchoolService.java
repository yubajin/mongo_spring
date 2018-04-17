package cn.yubajin.rjgcsx172.test;

import java.sql.Timestamp;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.yubajin.rjgcsx172.entity.SchoolInfo;
import cn.yubajin.rjgcsx172.service.SchoolService;
import cn.yubajin.rjgcsx172.util.PageModel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mgo.xml")
public class TestSchoolService {

	@Autowired
	private SchoolService service;

	@Test
	public void save() {
		SchoolInfo school = new SchoolInfo();
		school.setLink("www.jxufe.cn");
		school.setLocal("南昌");
//		school.setBirth(new Timestamp(System.currentTimeMillis()));
		service.save(school);
		System.out.println("已生成ID:" + school.getId());
	}

//	@Test
//	public void find() {
//		SchoolInfo school = service.find("58edf1b26f033406394a8a61");
//		System.out.println(school.getSchoolName());
//	}

//	@Test
//	public void update() {
//		SchoolInfo school = service.find("58edf1b26f033406394a8a61");
//		school.set_211(false);;
//		service.update(school);
//	}

//	@Test
//	public void delete() {
//		service.delete("58edef886f03c7b0fdba51b9");
//	}

	@Test
	public void findAll() {
		List<SchoolInfo> list = service.findAll("age desc");
		for (SchoolInfo u : list) {
			System.out.println(u.getSchoolName());
		}
	}

	@Test
	public void findByProp() {
		List<SchoolInfo> list = service.findByProp("name", "张三");
		for (SchoolInfo u : list) {
			System.out.println(u.getSchoolName());
		}
	}

	@Test
	public void findByProps() {
		List<SchoolInfo> list = service.findByProps(new String[] { "name", "age" }, new Object[] { "张三", 18 });
		for (SchoolInfo u : list) {
			System.out.println(u.getSchoolName());
		}
	}

	@Test
	public void pageAll() {
		PageModel<SchoolInfo> page = service.pageAll(1, 10);
		System.out.println("总记录：" + page.getTotalCount() + "，总页数：" + page.getTotalPage());
		for (SchoolInfo u : page.getList()) {
			System.out.println(u.getSchoolName());
		}
	}

	@Test
	public void pageByProp() {
		PageModel<SchoolInfo> page = service.pageByProp(1, 10, "name", "张三");
		System.out.println("总记录：" + page.getTotalCount() + "，总页数：" + page.getTotalPage());
		for (SchoolInfo u : page.getList()) {
			System.out.println(u.getSchoolName());
		}
	}

}
