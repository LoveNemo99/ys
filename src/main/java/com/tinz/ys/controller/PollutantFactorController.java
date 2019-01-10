package com.tinz.ys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ys.entity.PollutantFactor;
import com.tinz.ys.entity.Response;
import com.tinz.ys.service.PollutantFactorService;
import com.tinz.ys.service.UserService;
import com.tinz.ys.token.TokenUtil;

import io.swagger.annotations.ApiOperation;
 
@Controller
@RequestMapping(value = "/api/factor")
public class PollutantFactorController {

	private Response response = new Response();
	@Autowired
	PollutantFactorService mService;
	@Autowired
    private UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
 
	@ApiOperation(value="根据name获取因子信息", notes="name",response = Response.class)
    @RequestMapping(value = "/get/{name}", method = RequestMethod.GET)
    public ResponseEntity<Response> mGet(@PathVariable String name)
    {
		try {
			PollutantFactor result = mService.getByName(name);
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
			List<PollutantFactor> result = mService.getAll();
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
}
