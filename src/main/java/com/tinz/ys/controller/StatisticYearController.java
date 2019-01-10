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
import com.tinz.ys.entity.StatisticYear;
import com.tinz.ys.entity.StatisticYearForm;
import com.tinz.ys.service.StatisticYearService;
import com.tinz.ys.service.UserService;
import com.tinz.ys.token.TokenUtil;

import io.swagger.annotations.ApiOperation;
 
@Controller
@RequestMapping(value = "/api/statisticyear")
public class StatisticYearController {

	private Response response = new Response();
	@Autowired
	StatisticYearService mService;
	@Autowired
    private UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
 
	@ApiOperation(value="数据报表管理--降雨年报表", notes="根据企业id或者排口id来查询降雨年报表 ph用于分页和排序",response = Response.class)
	@RequestMapping(value = "/getall", method = RequestMethod.POST)
    public ResponseEntity<Response> mGetAll(@RequestBody PageData<StatisticYearForm> p,HttpServletRequest request)
    {
		try {
			List<StatisticYear> result = mService.getAll(p.getData(),p.getPh());
			System.out.println(result);
			response.setCount(mService.countByYear(p.getData()));
			response.setMsg(Response.OK,"获取成功",result);
	        return ResponseEntity.ok(response);
		}
		catch(Exception e){
			e.printStackTrace();
    		response.setMsg(Response.FAIL, "获取失败");
    		return new ResponseEntity<Response>(response, HttpStatus.OK);
		}
    }

}
