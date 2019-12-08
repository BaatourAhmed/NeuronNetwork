package tn.esprit;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


import entity.Comment;

import services.CommentService;

@ManagedBean
@ViewScoped
public class CommentsBean {
	
	     
	
	@EJB
	CommentService service;
	
	private int id;
	private int id_user;
	private String comment;
	private Date date;
	private List<Comment> comments;
	

	        
	public void addComment(){
		System.out.println("**********************************************");
		Comment cm = new Comment(comment,date);
		int i = service.AddComment(cm);
		System.out.println("************************"+i);
	
	}
	
	public CommentService getService() {
		return service;
	}
	public void setService(CommentService service) {
		this.service = service;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public List<Comment> getComments() {
		comments = service.FindAllComments(1);
		return comments;
	}
	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
	
	     

}
