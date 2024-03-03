package max;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//http://localhost:8080/SpringrestServer/ok.do?uid=8
@Controller
public class RequestHandlerController {
	@Autowired
	UserDAO userDAO;
@RequestMapping(value="ok", method=RequestMethod.GET)
	public @ResponseBody String getUserDetail(@RequestParam("uid") int uid) throws JsonGenerationException, JsonMappingException, IOException
	{
	   List<User> list = userDAO.getDetailll(uid);
	   
	   ObjectMapper m = new ObjectMapper();
	 String jstring = m.writeValueAsString(list);
	 return jstring;
	}
	
	
}
