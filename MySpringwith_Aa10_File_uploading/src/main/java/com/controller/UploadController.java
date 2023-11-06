package com.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class UploadController {

	
	@RequestMapping("/form")
	public String showForm()
	{
		
		return "fileupload_form";
	}
	
	@RequestMapping(value="/uploadimage", method= RequestMethod.POST)
	public String uploadfile(@RequestParam("image") CommonsMultipartFile file,HttpSession session,Model m)
	{
		
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		System.out.println(file.getStorageDescription());
		System.out.println(file.getBytes());
		System.out.println(file.getClass());
		System.out.println(file.getFileItem());
	
		byte[] data = file.getBytes();
		// we have to save this file to server or folder
		String path = session.getServletContext().getRealPath("/")+"WEB-INF" + File.separator+"resources" + File.separator+"image"+File.separator + file.getOriginalFilename();
		System.out.println("path: "+ path);
			
		try {
		FileOutputStream fos = new FileOutputStream(path);
		fos.write(data);
		fos.close();
		System.out.println("file uploaded successfully...");
		m.addAttribute("msg","Uploaded successfully...");
		m.addAttribute("filename", file.getOriginalFilename());
		
		}catch(IOException e)
		{
			e.printStackTrace();
			System.out.println("Uploading error");
			m.addAttribute("msg","Failed to uplad something went wrong!");
		}
		return "success";
	}
	
}
