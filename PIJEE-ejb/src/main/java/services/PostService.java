package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Post;

import interfaces.PostServiceRemote;
@Stateless
@LocalBean	
public class PostService implements PostServiceRemote {

	
	@PersistenceContext(unitName = "PIJEE-ejb")
	private EntityManager em;
	
	@Override
	public int AddPost(Post P) {
		System.out.println("In addPost : ");
		em.persist(P);
		System.out.println("Out of addPost" + P.getId());
		return P.getId();
	}

	@Override
	public void RemovePost(int id) {
		
		em.remove(em.find(Post.class, id));
		
		
	}

	@Override
	public Post FindPostById(int id) {
	Post p =	em.find(Post.class, id);
	return p;
	}

	@Override
	public List<Post> FindAllPosts() {
		List<Post> Post = em.createQuery("from Post", Post.class).getResultList();
		
		return Post;
	}

	@Override
	public void UpdatePost(Post PostNewValues) {
		Post p = em.find(Post.class, PostNewValues.getId());
		p.setTitle(PostNewValues.getTitle());
		p.setDescription(PostNewValues.getDescription());
		p.setCategory(PostNewValues.getCategory());
		p.setImage(PostNewValues.getImage());
		em.merge(PostNewValues);
		
	}

}
