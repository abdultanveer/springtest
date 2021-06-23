package dnc.sp.unit.tests;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@GetMapping("/hello")
	public String sayHello(){
		return "hello abdul";
	}

	@GetMapping(value ="/student", produces = MediaType.APPLICATION_JSON_VALUE)
	public Student getStudent() {
		return new Student("abdul", 123);
	}

	private class Student {

		String name;
		int age;
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}



	}


}
