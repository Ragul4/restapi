package com.skcet.content.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.content.model.ContentModel;
import com.skcet.content.service.ContentService;




@RestController
public class ContentController {
	@Autowired
	
	ContentService cs;
	
	
	//to initialize
	
	
	@PostMapping("/savecontent")
	public ContentModel saveDetails(@RequestBody ContentModel cm) {
		return cs.saveDetails(cm);
	}
	
	//update
	
	@PutMapping("/updatecontent")
	public ContentModel updateDetais(@RequestBody ContentModel cm) {
		return cs.updateDetails(cm);
	}
	
	//delete using if-else
	
	
	@DeleteMapping("/deletecontent/{id}")
	public ResponseEntity<String> deleteContentInfo(@PathVariable int id){
		boolean deleted = cs.deleteContent(id);
		
		if (deleted) {
			return ResponseEntity.ok("Book with ID " + id + " deleted successfully");
		}
		
		else{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("BOOK with ID" + id + " not found");
		}
		
	}
	
	//delete using path variable
	
	@DeleteMapping("/delete4/{book_id}")
	public String deleteds(@PathVariable("book_id") int book_id) {
		
		cs.delete4(book_id);
		return "BOOK_Id "+book_id+" is deleted";
	}
	
	
	
	//fetching details using id
	
	@GetMapping("/users/{userId}")
	public ResponseEntity<?>getUserId(@PathVariable int userId)
	{
	Optional<ContentModel>book=cs.getUserId(userId);
	if(book!=null) {
		return ResponseEntity.ok(book); 
	}
	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("ID NOT FOUND");
	}
		
	//fetch
	@GetMapping("/getcontent")
	public List<ContentModel> getContentde(){
		return cs.getDetails();
	}
	
	
	//DELETE USING REQUEST
	
	@DeleteMapping("/byReqParm")
	  public String removeByRequestPam(@RequestParam("id") int id)
	  { 
	    cs.deleteApp(id);
	    return "App with Id "+id+" is deleted"; 
	  }
}
