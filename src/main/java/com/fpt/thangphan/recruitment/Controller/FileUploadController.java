package com.fpt.thangphan.recruitment.Controller;

import com.fpt.thangphan.recruitment.configuration.Permission;
import com.fpt.thangphan.recruitment.sevice.UploadTextService;
import com.fpt.thangphan.recruitment.storage.StorageFileNotFoundException;
import com.fpt.thangphan.recruitment.storage.StorageService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.IOException;
import java.util.Map;

@Controller
public class FileUploadController {

    @Autowired
    private StorageService storageService;

    @Autowired
    private UploadTextService uploadTextService;

    @Autowired
    private Map<String, String> loginData;

    @Permission
    @GetMapping("/upload")
    public ModelAndView listUploadedFiles(ModelAndView modelAndView,
                                          HttpServletRequest request) throws IOException {
        modelAndView.addObject("files", storageService.getFiles(request));
        modelAndView.addObject("username", loginData.get(request.getRemoteAddr()));
        modelAndView.addObject("message", uploadTextService.getTextForUser(loginData.get(request.getRemoteAddr())));
        modelAndView.setViewName("admin/index");
        return modelAndView;
    }

    @Permission
    @GetMapping("/files/{filename:.+}")
    @ResponseBody
    public ResponseEntity<? extends Object> serveFile(@PathVariable String filename,
                                                      HttpServletRequest request) {

        Resource file = storageService.loadAsResource(filename);

        if (file == null)
            return ResponseEntity.notFound().build();

        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }

//    @Permission
//    @PostMapping("/")
//    public String handleFileUpload(@RequestParam("file") MultipartFile[] file,
//                                   RedirectAttributes redirectAttributes,
//                                   HttpServletRequest request) {
//        for (int i = 0; i < file.length; i++) {
//            storageService.store(file[i]);
//        }
//        redirectAttributes.addFlashAttribute("message",
//                "You successfully uploaded " + file.length + " file!");
//
//        return "redirect:/upload";
//    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
}
