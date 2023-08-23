package com.skcet.content.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Content_Model")
public class ContentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int book_id;
	@Column(name="book_name")
	private String book_name;
	private String author;
	private String domain;
	private String related_domain;
	private String best_university_for_domain;
	private String language;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getRelated_domain() {
		return related_domain;
	}
	public void setRelated_domain(String related_domain) {
		this.related_domain = related_domain;
	}
	public String getBest_university_for_domain() {
		return best_university_for_domain;
	}
	public void setBest_university_for_domain(String best_university_for_domain) {
		this.best_university_for_domain = best_university_for_domain;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
}
