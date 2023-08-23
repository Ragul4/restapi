package com.skcet.content.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skcet.content.model.ContentModel;

public interface ContentRepository extends JpaRepository<ContentModel, Integer>{
	
}
