package com.spring.boot.api.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.MvcUriComponentsBuilder;

import com.spring.boot.api.entity.File;
import com.spring.boot.api.entity.Response;
import com.spring.boot.api.service.FileServiceImp;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class FileRestController {

	@Autowired
	private FileServiceImp fileService;
	
	@PostMapping("/files")
	public ResponseEntity<Response> uploadFiles(@RequestParam("files") List<MultipartFile> files) throws Exception {
			fileService.saveFiles(files);
			return ResponseEntity.status(HttpStatus.OK).body(new Response("Los archivos se subieron exitosamente"));
	}
	
	@GetMapping("/files/{filename:.+}")
	public ResponseEntity<Resource> getFile(@PathVariable String filename) throws Exception{
		Resource resource = fileService.load(filename);
		return ResponseEntity.ok()
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}
	
	@GetMapping("/files")
	public ResponseEntity<List<File>> getAllFiles() throws Exception{
		List<File> files = fileService.loadAll().map(path -> {
			String filename = path.getFileName().toString();
			String url = MvcUriComponentsBuilder.fromMethodName(FileRestController.class, "getFile", path.getFileName().toString()).build().toString();
			return new File(filename, url);
		}).collect(Collectors.toList());
		return ResponseEntity.status(HttpStatus.OK).body(files);
	}
	
}
