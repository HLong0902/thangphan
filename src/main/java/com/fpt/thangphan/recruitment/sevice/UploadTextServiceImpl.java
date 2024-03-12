package com.fpt.thangphan.recruitment.sevice;


import com.fpt.thangphan.recruitment.CommonService;
import com.fpt.thangphan.recruitment.entity.UploadTextEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.fpt.thangphan.recruitment.CommonService.getFileFromData;
import static com.fpt.thangphan.recruitment.CommonService.saveDataToFile;

@Service
public class UploadTextServiceImpl implements UploadTextService {

    private String pathSaveFile;


    @Override
    public void saveTextToFile(String data, String username) {
        UploadTextEntity uploadTextEntity = new UploadTextEntity();
        uploadTextEntity.setUserId(username);
        uploadTextEntity.setCreatedDate(LocalDateTime.now());
        uploadTextEntity.setPath(CommonService.saveTextToFile(data, username, pathSaveFile));
        saveDataToFile(uploadTextEntity, pathSaveFile);
    }

    @Override
    public UploadTextEntity getTextForUser(String username) {
        return getFileFromData(username, pathSaveFile);
    }
}
