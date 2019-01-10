package com.tinz.ys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ys.entity.PageData;
import com.tinz.ys.entity.Response;
import com.tinz.ys.entity.ValveCtrl;
import com.tinz.ys.entity.ValveCtrlForm;
import com.tinz.ys.service.UserService;
import com.tinz.ys.service.ValveCtrlService;
import com.tinz.ys.token.TokenUtil;

import io.swagger.annotations.ApiOperation;
 
@Controller
@RequestMapping(value = "/api/valve")
public class ValveCtrlController {

	private Response response = new Response();
	@Autowired
	ValveCtrlService mService;
	@Autowired
    private UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
 
	@ApiOperation(value="阀门控制记录", notes="根据企业id或者排口id来查询阀门控制记录 ph用于分页和排序",response = Response.class)
	@RequestMapping(value = "/getall", method = RequestMethod.POST)
    public ResponseEntity<Response> mGetAll(@RequestBody PageData<ValveCtrl> p,HttpServletRequest request)
    {
		try {
			List<ValveCtrl> result = mService.getAll(p.getData(),p.getPh());
			System.out.println(result);
			response = new Response();
			response.setCount(mService.count(p.getData()));
			response.setMsg(Response.OK,"获取成功",result);
	        return ResponseEntity.ok(response);
		}
		catch(Exception e){
			e.printStackTrace();
			response = new Response();
    		response.setMsg(Response.FAIL, "获取失败");
    		return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
    }

	@ApiOperation(value="阀门控制", notes="valveName:排水口阀门|收集池阀门    state:0关|100开",response = Response.class)
	@RequestMapping(value = "/control", method = RequestMethod.POST)
    public ResponseEntity<Response> mControl(@RequestBody ValveCtrlForm p,HttpServletRequest request)
    {
		try {
			mService.controlValve(p);
			response = new Response();
			response.setMsg(Response.OK,"获取成功");
	        return ResponseEntity.ok(response);
		}
		catch(Exception e){
			e.printStackTrace();
			response = new Response();
    		response.setMsg(Response.FAIL, "获取失败");
    		return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
    }

}
