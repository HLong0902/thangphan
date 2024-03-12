package com.fpt.thangphan.recruitment.storage;

import com.fpt.thangphan.recruitment.dto.FileDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@Service
public class FileSystemStorageService implements StorageService {

    @Override
    public void store(MultipartFile file) {

    }

    @Override
    public Stream<Path> loadAll() {
        return null;
    }

    @Override
    public Path load(String filename) {
        return null;
    }

    @Override
    public Resource loadAsResource(String filename) {
        try {
            Path file = load(filename);
            Resource resource = new UrlResource(file.toUri());
            if (resource.exists() || resource.isReadable()) {
                return resource;
            } else {
                throw new StorageFileNotFoundException(
                        "Could not read file: " + filename);

            }
        } catch (MalformedURLException e) {
            throw new StorageFileNotFoundException("Could not read file: " + filename, e);
        }
    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<FileDTO> getFiles(HttpServletRequest request) {
        return new ArrayList<>();
    }

    // Hàm đổi tên file
    private String cleanFileName(String originalFileName) {
        return originalFileName.replaceAll("[^a-zA-Z0-9.-]", "");
    }

    public MultipartFile createRenamedMultipartFile(MultipartFile originalFile, String newFilename) {
        return new RenamedMultipartFile(originalFile, newFilename);
    }

    @Override
    public void init() {

    }
}
