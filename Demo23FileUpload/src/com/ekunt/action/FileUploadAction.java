package com.ekunt.action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class FileUploadAction extends ActionSupport{
	
	private File image; //�ϴ����ļ�
    private String imageFileName; //�ļ�����
    
    public String input() {
    	return INPUT;
    }

    public String upload() {
        try {
			String realpath = ServletActionContext.getServletContext().getRealPath("/images");
			System.out.println("realpath: "+realpath);
			if (image != null) {
			    File savefile = new File(new File(realpath), imageFileName);
			    if (!savefile.getParentFile().exists())
			        savefile.getParentFile().mkdirs();
			    //�˾��ص㣬����ϴ���
			    FileUtils.copyFile(image, savefile);
			    ActionContext.getContext().put("message", "�ļ��ϴ��ɹ�");
			}
		} catch (RuntimeException | IOException e) {
			e.printStackTrace();
		}
        return SUCCESS;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }



}
