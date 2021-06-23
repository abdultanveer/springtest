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



}



