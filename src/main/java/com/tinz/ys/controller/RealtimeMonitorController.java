package com.tinz.ys.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ys.entity.RealtimeMonitor;
import com.tinz.ys.entity.Response;
import com.tinz.ys.entity.UserInfo;
import com.tinz.ys.service.RealtimeMonitorService;
import com.tinz.ys.service.UserService;
import com.tinz.ys.token.TokenUtil;
import com.tinz.ys.token.TokenValidate;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
 
@Controller
@RequestMapping(value = "/api/monitor")
@Api(value = "RealtimeMonitorController|实时数据管理--降雨实时监控")
public class RealtimeMonitorController {

	private Response response = new Response();
	@Autowired
	RealtimeMonitorService mService;
	@Autowired
    private UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
 
	@TokenValidate
	@ApiOperation(value="实时数据管理--降雨实时监控", notes="根据企业id 获取该企业实时监控数据 状态",response = Response.class)
    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public ResponseEntity<Response> mGet(@PathVariable Integer id,HttpServletRequest request)
    {
//		String username = tokenUtil.getUsernameFromRequest(request);
//		UserInfo u = userService.getUserInfoByUsername(username);
		try {
			List<RealtimeMonitor> result = mService.getByPsId(id);
	    	System.out.println(result);
	    	response.setMsg(Response.OK,"获取成功",result);
	        return ResponseEntity.ok(response);
		}catch(Exception e) {
			response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);
		}
    }
	
	@TokenValidate
	@RequestMapping(value = "/getall", method = RequestMethod.GET)
    public ResponseEntity<Response> mGetAll(HttpServletRequest request)
    {
		String username = tokenUtil.getUsernameFromRequest(request);
		UserInfo u = userService.getUserInfoByUsername(username);
//		UserInfo u = new UserInfo();
//		u.setRole("管理员");
		try {
			if(u.getRole().equals("管理员")) {
				List<RealtimeMonitor> result = mService.getAll();
		    	response.setMsg(Response.OK,"获取成功",result);
		        return ResponseEntity.ok(response);
			}
			else if(u.getRole().equals("企业用户")) {
				if(u.getPsId() != null) {
					List<RealtimeMonitor> result = mService.getByPsId(u.getPsId());
					response.setMsg(Response.OK,"获取成功",result);
			        return ResponseEntity.ok(response);
				}
				else {
					List<RealtimeMonitor> result = new ArrayList<RealtimeMonitor>();
					response.setMsg(Response.OK,"获取成功",result);
			        return ResponseEntity.ok(response);
				}
			}
			response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);
		}catch(Exception e) {
			response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);
		}
    }

}
