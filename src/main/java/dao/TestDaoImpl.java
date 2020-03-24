package dao;

import org.springframework.stereotype.Service;

@Service
public class TestDaoImpl implements TestDao{
	@Override
	public void sayHello() {
		System.out.println("Hello, Study hard!");
		System.out.println("软件173 王鸿铭 201707230");
	}
}
