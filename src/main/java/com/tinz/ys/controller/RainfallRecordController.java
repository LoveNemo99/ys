package com.tinz.ys.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tinz.ys.entity.RainfallRecord;
import com.tinz.ys.entity.Response;
import com.tinz.ys.entity.Tree;
import com.tinz.ys.entity.UserInfo;
import com.tinz.ys.service.RainfallRecordService;
import com.tinz.ys.service.UserService;
import com.tinz.ys.token.TokenUtil;

import io.swagger.annotations.ApiOperation;
 
@Controller
@RequestMapping(value = "/api/rain")
public class RainfallRecordController {

	private Response response = new Response();
	@Autowired
	RainfallRecordService mService;
	@Autowired
    private UserService userService;
	@Autowired
    private TokenUtil tokenUtil;
 
//	@ApiOperation(value="根据id 获取", notes="id",response = Response.class)
//    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Response> mGet(@PathVariable Integer id)
//    {
//		try {
//			RainfallRecord result = mService.getById(id);
//	    	System.out.println(result);
//	    	response.setMsg(Response.OK,"验证成功",result);
//	        return ResponseEntity.ok(response);
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setMsg(Response.FAIL,"验证失败，请检查账号密码");
//            return ResponseEntity.ok(response);
//		}
//        
//    }
//	
//	@RequestMapping(value = "/getall", method = RequestMethod.GET)
//    public ResponseEntity<Response> mGetAll()
//    {
//		try {
//			List<RainfallRecord> result = mService.getAll();
//			System.out.println(result);
//			response.setMsg(Response.OK,"验证成功",result);
//	        return ResponseEntity.ok(response);
//		}catch(Exception e) {
//			e.printStackTrace();
//			response.setMsg(Response.FAIL,"验证失败，请检查账号密码");
//            return ResponseEntity.ok(response);
//		}
//    }

	@ApiOperation(value="降雨序号下拉框", notes="获取降雨序号下拉框数据",response = Response.class)
	@RequestMapping(value = "/tree", method = RequestMethod.GET)
    public ResponseEntity<Response> mGetTree(HttpServletRequest request)
    {
		//String username = tokenUtil.getUsernameFromRequest(request);
		//UserInfo u = userService.getUserInfoByUsername(username);
		try {
			List<Tree> result = mService.getTree();
	    	System.out.println(result);
	    	response.setMsg(Response.OK,"获取成功",result);
	        return ResponseEntity.ok(response);
		}catch(Exception e) {
			response.setMsg(Response.FAIL,"获取失败");
            return ResponseEntity.ok(response);
		}
    }
	
}
