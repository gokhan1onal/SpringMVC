/*****************************************************************************************/
/* Copyright (c) 1991-2022, ETS TUR                                                      */
/* d:2022-04-07 o:G�khan �NAL  e:Home Controller                                         */
/*****************************************************************************************/

package net.gokhanonal.spring.controller;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import net.gokhanonal.spring.model.User;
import net.gokhanonal.spring.service.UserService;
import net.gokhanonal.spring.service.UserServiceImpl;

@Controller
public class HomeController {
	
	static UserService userService;
	
	private UserService myGetService() {
		if(userService == null) {
			ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
			userService = ctx.getBean("userService", UserServiceImpl.class);	
		}
		return userService;
	}

	@RequestMapping(value = "/")
	public ModelAndView home(HttpServletResponse response) throws IOException {	
		return new ModelAndView("home");
	}

	@RequestMapping(value = "/AddUser", method = RequestMethod.GET)
	public String viewAddUserForm(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "Registration";
	}

	@RequestMapping(value = "/AddUser", method = RequestMethod.POST)
	public String doRegistration(@ModelAttribute("user") User user) {
		System.out.println("ID="+user.getId());
		if(myGetService().isExist(user.getId())) {
			System.out.println("Kullanıcı zaten kayıtlı düzenleniyor ");
			myGetService().updateUser(user);
		}		
		else {
			System.out.println("Kullanıcı kayıtlı değil. yeni ekleniyor ");
			myGetService().addUser(user);
		}
		return "RegistrationSuccess";
	}
		
	@RequestMapping("/UserList")
	public String viewUserList(Model model) {
		List<User> userList = myGetService().getAllUsers();
		
		for(User user : userList) {
			System.out.println("Ad�:"+user.getAd()+" Soyad�:"+user.getSoyad()+" Adres:"+user.getAdres());
		}
		
		model.addAttribute("userList", userList);
		return "UserList";
	}
	

	@RequestMapping("/DeleteUser")
	public String deleteUser(@RequestParam int id) {
		myGetService().deleteUser(id);
		return "redirect:/UserList";
	}
	
	@RequestMapping("ModifyUser")
	public ModelAndView modifyUser(@RequestParam int id) {
		ModelAndView mav = new ModelAndView("Registration");	
		User user = myGetService().getUser(id);
		mav.addObject("user", user);	
		return mav;
	}
	

}
