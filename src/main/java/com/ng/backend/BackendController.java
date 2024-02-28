package com.ng.backend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@RestController
public class BackendController {

	@Autowired
	Account account;

	@Autowired 
	private HttpServletRequest request;

	@GetMapping("/")
	public String returnResponse() {
		System.out.println(LocalDateTime.now()+":/ url is called:");
		return "Backend Application!";
	}

	@GetMapping(value = "/response")
	private String response()
	{      

		System.out.println(LocalDateTime.now()+":/bakendapp url is called:");
		return "ip +"+account;
	}

		@GetMapping(value = "/callerip")
		private String callerIP()
		{      
	
		//	HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
			String ip = request.getRemoteAddr();
			String remoteHost=request.getRemoteHost();
			
			System.out.println(LocalDateTime.now()+":bakendapp callerip url is called:");
			return "Caller IP address:"+ip+". Request Remote Host:"+remoteHost;
		}
	

}
