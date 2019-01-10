package com.tinz.ys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ys.entity.Enterprise;
import com.tinz.ys.entity.Response;
import com.tinz.ys.entity.Tree;
import com.tinz.ys.entity.UserInfo;
import com.tinz.ys.service.EnterpriseService;
import com.tinz.ys.service.UserService;
import com.tinz.ys.token.TokenUtil;
import com.tinz.ys.token.TokenValidate;

import io.swagger.annotations.ApiOperation;
 
@Controller
@RequestMapping(value = "/api/enterprise")
public class EnterpriseController {

	private Response response = new Response();
	@Autowired
	EnterpriseService mService;
	@Autowired
    private UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
 
	@ApiOperation(value="根据企业id 获取企业信息", notes="id",response = Response.class)
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> mGet(@PathVariable Integer id)
    {
		try {
			Enterprise result = mService.getById(id);
	    	System.out.println(result);
	    	response.setMsg(Response.OK,"获取成功",result);
	        return ResponseEntity.ok(response);
		}catch(Exception e) {
			response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);
		}
    }
	
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity<Response> mGetAll()
    {
		try {
			List<Enterprise> result = mService.getAll();
			System.out.println(result);
			response.setMsg(Response.OK,"获取成功",result);
	        return ResponseEntity.ok(response);
		}
		catch(Exception e) {
			e.printStackTrace();
			response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);	
		}       
    }

	@TokenValidate
	@RequestMapping(value = "/tree", method = RequestMethod.GET)
    public ResponseEntity<Response> mGetTree(HttpServletRequest request)
    {
		try {
			String username = tokenUtil.getUsernameFromRequest(request);
			UserInfo u = userService.getUserInfoByUsername(username);
	    	List<Tree> result = mService.getTree(u);
	    	System.out.println(result);
	    	response.setMsg(Response.OK,"获取成功",result);
	        return ResponseEntity.ok(response);
		}catch(Exception e) {
			e.printStackTrace();
			response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);
		}  
    }
	
	@TokenValidate
	@RequestMapping(value = "/porttree/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> mGetPortTree(@PathVariable Integer id,HttpServletRequest request)
    {
		try{
			String username = tokenUtil.getUsernameFromRequest(request);
			UserInfo u = userService.getUserInfoByUsername(username);
	    	List<Tree> result = mService.getPortTree(u,id);
	    	System.out.println(result);
	    	response.setMsg(Response.OK,"获取成功",result);
	        return ResponseEntity.ok(response);
		}catch(Exception e){
			response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);
		}        
    }
}
