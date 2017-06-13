package com.zx;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api")
@Api(value = "apiController", description = "公共api控制器", produces = "application/json; charset=utf-8")
public class DemoController {

	@ApiOperation(value = "根据Id查找用户", notes = "查找用户", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

	@ApiImplicitParams({
			@ApiImplicitParam(name = "id", value = "唯一id", required = true, dataType = "Integer", paramType = "path"), })

	@ApiResponses(value = { @ApiResponse(code = 400, message = "No Name Provided ,23333") })
	@RequestMapping(value = "/getById")
	public User getById(Integer id) {
		User user = new User(id, "张三fhskdfhkj", new Date());
		return user;
	}
	
	
	@Autowired
	private CommodityTypeDao commodityTypeDao;

	
	@ApiOperation(value = "商品分类管理", notes = "商品分类管理", httpMethod = "GET", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)

	@ApiImplicitParams({
		@ApiImplicitParam(name = "operation", value = "操作命令:   query：查询，create：创建，delete：删除，update：更新", required =true, dataType = "String", paramType = "path"),
			@ApiImplicitParam(name = "commodityTypeNo", value = "商品类型编号（不可重复）", required = false, dataType = "String", paramType = "path"),
			@ApiImplicitParam(name = "commodityTypeName", value = "商品分类名称", required = false, dataType = "String", paramType = "path"), 
			@ApiImplicitParam(name = "parentNo", value = "上级商品分类编号", required = false, dataType = "String", paramType = "path"),
			@ApiImplicitParam(name = "remark", value = "备注", required = false, dataType = "String", paramType = "path")})

	@ApiResponses(value = { @ApiResponse(code = 400, message = "No Name Provided ,23333") })
	@RequestMapping(value = "/commodityType")
	public CommodityType commodityType(
			@RequestParam(value="operation",defaultValue="query")String operation,
			@RequestParam(value="commodityTypeNo",defaultValue="test")String commodityTypeNo,
			@RequestParam(value="commodityTypeName",defaultValue="others")String commodityTypeName,
			@RequestParam(value="parentNo",defaultValue="others")String parentNo,
			@RequestParam(value="remark",defaultValue="others")String remark) {
	
		System.out.println("操作："+operation+"编号："+commodityTypeNo);
		if("query".equals(operation)){//查询
			CommodityType co=commodityTypeDao.findBycommodityTypeNo(commodityTypeNo);
			System.out.println("co:"+co);
			return commodityTypeDao.findBycommodityTypeNo(commodityTypeNo);
			
		}
		else if(operation.equals("create")){//创建分类
			
		}
		else if(operation.equals("delete")){//删除分类
			
		}
		else if(operation.equals("update")){//修改
			
		}
		
		
		/*ArrayList<String> list = new ArrayList<String>();  
        BufferedReader brname;  
        try {  
            brname = new BufferedReader(new FileReader("src/main/resources/commodityType.json"));// 读取NAMEID对应值  
            String sname = null;  
            while ((sname = brname.readLine()) != null) {  
                // System.out.println(sname);  
                list.add(sname);// 将对应value添加到链表存储  
            }  
            brname.close();  
        } catch (IOException e1) {  
            // TODO Auto-generated catch block  
            e1.printStackTrace();  
        }  
        // 读取原始json文件并进行操作和输出  
        try {  
            BufferedReader br = new BufferedReader(new FileReader(  
                    "src/main/resources/commodityType.json"));// 读取原始json文件  
            BufferedWriter bw = new BufferedWriter(new FileWriter(  
                    "src/main/resources/commodityType.json"));// 输出新的json文件  
            String s = null, ws = null;  
            while ((s = br.readLine()) != null) {  
                // System.out.println(s);  
                try {  
                    JSONObject dataJson = new JSONObject(s);// 创建一个包含原始json串的json对象  
                    String jsonNo = dataJson.getString("commodityTypeNo");// 找到features的json数组  
                    String jsonName = dataJson.getString("commodityTypeName");
                    String jsonParentNo = dataJson.getString("parentNo");
                    String jsonremark = dataJson.getString("remark");
                    
                    if(operation.equals("query")){//查询
                    	
                    	return new CommodityType(jsonNo, jsonName, jsonParentNo, jsonremark);
            			
            		}
            		else if(operation.equals("create")){//创建分类
            			
            		}
            		else if(operation.equals("delete")){//删除分类
            			
            		}
            		else if(operation.equals("update")){//修改
            			
            		}
                    
                    for (int i = 0; i < features.length(); i++) {  
                        JSONObject info = features.getJSONObject(i);// 获取features数组的第i个json对象  
                        JSONObject properties = info.getJSONObject("properties");// 找到properties的json对象  
                        String name = properties.getString("name");// 读取properties对象里的name字段值  
                        System.out.println(name);  
                        properties.put("NAMEID", list.get(i));// 添加NAMEID字段  
                        // properties.append("name", list.get(i));  
                        System.out.println(properties.getString("NAMEID"));  
                        properties.remove("ISO");// 删除ISO字段  
                    }  
                    ws = dataJson.toString();  
                    System.out.println(ws);  
                } catch (JSONException e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
  
            bw.write(ws);  
            // bw.newLine();  
  
            bw.flush();  
            br.close();  
            bw.close();  
  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  */
		
		
		
		CommodityType commodityType=new CommodityType("c123", "瓷器", "0", "备注");
		
		
		
		
		
		return commodityType;
	}
	
	@RequestMapping(value = "/test")
	public String commodityType(){
		
		
		
		
		return "test.html";
		
	}
	
	
	

}
