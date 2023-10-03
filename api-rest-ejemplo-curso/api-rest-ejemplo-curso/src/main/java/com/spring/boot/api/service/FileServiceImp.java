package com.spring.boot.api.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileServiceImp implements IFileService{

	private final Path rootfolder = Paths.get("uploads");
	
	@Override
	public void saveFile(MultipartFile file) throws Exception {
		Files.copy(file.getInputStream(), this.rootfolder.resolve(file.getOriginalFilename()));
	}

	@Override
	public Resource load(String name) throws Exception {
		Path file = rootfolder.resolve(name);
		Resource resource = new UrlResource(file.toUri());
		return resource;
	}

	@Override
	public void saveFiles(List<MultipartFile> files) throws Exception { 
		for (MultipartFile file : files) {
			this.saveFile(file);
		}
		
	}

	@Override
	public Stream<Path> loadAll() throws Exception {
		
		return Files.walk(rootfolder, 1).filter(path -> !path.equals(rootfolder)).map(rootfolder::relativize);
	}

}
