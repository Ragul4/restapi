package com.skcet.content.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skcet.content.model.ContentModel;
import com.skcet.content.repository.ContentRepository;



@Service
public class ContentService {
	@Autowired
	ContentRepository cr;
	
	public ContentModel saveDetails(ContentModel cm) {
		return cr.save(cm);
	}
	
	
	public ContentModel updateDetails(ContentModel hm) {
		return cr.saveAndFlush(hm);
	}
	
	public boolean deleteContent(int hotelId) {
		if(cr.existsById(hotelId)) {
			cr.deleteById(hotelId);
			return true;
		}
		return false;
	}
	
	
	
	public void delete4(int book_id) {
		System.out.print("Deleted");
		cr.deleteById(book_id);
	}
	
	public Optional<ContentModel> getUserId(int userId)
	   {
		   Optional<ContentModel>book=cr.findById(userId);
		   if(book.isPresent())
		   {
			   return book;
		   }
		   return null;
	   }
	
	public void deleteUser(int book_id) {
        cr.deleteById(book_id);
    }
	
	public void deleteApp(int id)
	  {
	    System.out.println("Deleted");
	    cr.deleteById(id);
	  }
	
	public List<ContentModel> getDetails(){
		return cr.findAll();
	}
	
	
}
