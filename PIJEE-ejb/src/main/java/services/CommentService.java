package services;



import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Comment;

import interfaces.CommentServiceLocal;
import interfaces.CommentServiceRemote;

@Stateless
@LocalBean
public class CommentService implements CommentServiceRemote {

	
	@PersistenceContext(unitName = "PIJEE-ejb")
	EntityManager em;
	
	

	@Override
	public int AddComment(Comment c) {
		System.out.println("In addComent : ");
		em.persist(c);
		System.out.println("Out of addComment" + c.getId());
		return c.getId();
		
	}



	@Override
	public List<Comment> FindAllComments(int id) {
		
			List<Comment> comments = em.createQuery("SELECT c FROM Comment c", Comment.class).getResultList();
		
		return comments;
	}

}
