package tn.esprit;

import java.io.Console;
import java.util.Date;
import java.util.List;
    
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;

import entity.Post;
import services.PostService;
         
@ManagedBean
@ViewScoped
public class PostBean {
	                                                                   
	@EJB
	PostService service;
	
	private int clieckedPostId;
	
	private int id;
	
	private int iduser = UserBean.connected_User_Id;
	
	private String title;
	
	private String description;
	
	private String image;
	 
          
	private String category;
	 

	private Date date;
	

	private List<Post> Posts;
	 
	


	
	public String goToAddPostsPage(){
		return "/PIJEE-web/pages/addPost.jsf";
	}
	                                        

	public int yaa(){
		String value = FacesContext.getCurrentInstance().
				getExternalContext().getRequestParameterMap().get("bacon");
		System.out.println("**************** one *****" + value);
		System.out.println("***************"+clieckedPostId);
		return clieckedPostId; 
	}

	                                  
	public String goToComments(){

		String value = FacesContext.getCurrentInstance().
				getExternalContext().getRequestParameterMap().get("bacon");
		
		System.out.println("****************" + value);
		return "/PIJEE-web/pages/Listcommantaires.jsf";	
	}
	                                            
	                                      
		
	  
	
	
	
	public String addPost(){
		Post p = new Post(iduser, title, description,date);
		service.AddPost(p);
		return "/PIJEE-web/pages/Posts.jsf";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIduser() {
		return iduser;
	}

	public void setIduser(int iduser) {
		this.iduser = iduser;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


                  
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Post> getPosts() {
		Posts = service.FindAllPosts();
		return Posts;
	}

	public void setPosts(List<Post> posts) {
		Posts = posts;
	}

	public PostService getService() {
		return service;
	}

	public void setService(PostService service) {
		this.service = service;
	}


	public int getClieckedPostId() {
		return clieckedPostId;
	}


	public void setClieckedPostId(int clieckedPostId) {
		this.clieckedPostId = clieckedPostId;
	}




	
	
	
	

}
