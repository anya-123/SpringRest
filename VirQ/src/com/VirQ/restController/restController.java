package com.VirQ.restController;


import com.VirQ.POJO.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class restController {

@RequestMapping(value = "/SubmitSignInForm",
				method = RequestMethod.POST,
				headers = {"Content-type=application/json"})
@ResponseBody
public SignIn addDetails(@RequestBody SignIn signin) {

//	signin.setEmailId(signin.getEmailId());
//	signin.setPassword(signin.getPassword());
	
String email=signin.getEmailId();
String pass=signin.getPassword();

return new SignIn(email, pass);
//return signin;
}
}
