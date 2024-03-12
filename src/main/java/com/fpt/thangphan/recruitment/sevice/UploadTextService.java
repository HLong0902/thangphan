package com.fpt.thangphan.recruitment.sevice;


import com.fpt.thangphan.recruitment.entity.UploadTextEntity;

public interface UploadTextService {

    public void saveTextToFile(String data, String username);

    public UploadTextEntity getTextForUser(String username);
}
