package com.spring.boot.api.service;


import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface IFileService {
	public void saveFile(MultipartFile file) throws Exception;
	public Resource load(String name) throws Exception;
	public void saveFiles(List<MultipartFile> files) throws Exception;
	public Stream<Path> loadAll() throws Exception;
	
}
