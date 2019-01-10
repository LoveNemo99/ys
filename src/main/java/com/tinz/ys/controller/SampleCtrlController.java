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
import com.tinz.ys.entity.SampleCtrl;
import com.tinz.ys.entity.SampleCtrlForm;
import com.tinz.ys.service.UserService;
import com.tinz.ys.service.SampleCtrlService;
import com.tinz.ys.token.TokenUtil;

import io.swagger.annotations.ApiOperation;
 
@Controller
@RequestMapping(value = "/api/sample")
public class SampleCtrlController {

	private Response response = new Response();
	@Autowired
	SampleCtrlService mService;
	@Autowired
    private UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
 
	@ApiOperation(value="反控采样记录", notes="根据企业id或者排口id来查询反控采样记录 ph用于分页和排序",response = Response.class)
	@RequestMapping(value = "/getall", method = RequestMethod.POST)
    public ResponseEntity<Response> mGetAll(@RequestBody PageData<SampleCtrl> p,HttpServletRequest request)
    {
		try {
			List<SampleCtrl> result = mService.getAll(p.getData(),p.getPh());
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

	@ApiOperation(value="反控采样", notes="deviceType:采样仪|COD仪|氨氮仪 ",response = Response.class)
	@RequestMapping(value = "/control", method = RequestMethod.POST)
    public ResponseEntity<Response> mControl(@RequestBody SampleCtrlForm p,HttpServletRequest request)
    {
		try {
			mService.controlSample(p);
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
