package com.idea.cjyl.common.web.controller;

import com.idea.cjyl.core.common.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

@Controller
public class UploadController {


	@ResponseBody
	@RequestMapping(value = "uploads")
	public ResultData uploads(MultipartHttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/")
		        + "/assets/uploadimg/";
		String type = ".png";
		List<MultipartFile> list = request.getFiles("file");
		List<Map<String, Object>> listMap = new ArrayList<>();
		for (MultipartFile file : list) {
			Map<String, Object> map = new HashMap<String, Object>();
			try {
				if (file.getContentType().endsWith("image/png")) {
					type = ".png";
				}
				if (file.getContentType().endsWith("image/jpeg")) {
					type = ".jpg";
				}
				String originalFilename = System.currentTimeMillis()
				        + new Random().nextInt(89999999) + type;
				File imageFile = new File(path + originalFilename);
				// 创建输出流
				FileOutputStream outStream = new FileOutputStream(imageFile);
				// 写入数据
				outStream.write(file.getBytes());
				// 关闭输出流
				outStream.close();
				map.put("path", originalFilename);
				map.put("code", 1);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				map.put("code", 0);
			}
			listMap.add(map);
		}
		return ResultData.build().parseList(listMap);
	}
	

	@ResponseBody
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	public ResultData upload(MultipartHttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/")
		        + "/assets/uploadimg/";
		String type = ".png";
		ResultData result = ResultData.build();
		MultipartFile file = request.getFile("file");
		try {
			if (file.getContentType().endsWith("image/png")) {
				type = ".png";
			}
			if (file.getContentType().endsWith("image/jpeg")) {
				type = ".jpg";
			}
			String originalFilename = System.currentTimeMillis()
			        + new Random().nextInt(89999999) + type;
			File imageFile = new File(path + originalFilename);
			// 创建输出流
			FileOutputStream outStream = new FileOutputStream(imageFile);
			// 写入数据
			outStream.write(file.getBytes());
			// 关闭输出流
			outStream.close();
			result.put("path", originalFilename);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			result.failure();
		}
		return result;
		
	}
	
}