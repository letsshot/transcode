package PTJ4.transcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import PTJ4.transcode.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService us;
	
}
