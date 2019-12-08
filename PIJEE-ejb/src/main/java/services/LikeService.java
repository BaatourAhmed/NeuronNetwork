package services;



import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entity.Comment;
import entity.Like;
import interfaces.LikeServiceLocal;
import interfaces.LikeServiceRemote;

@Stateless
public class LikeService implements LikeServiceRemote,LikeServiceLocal {

	
	@PersistenceContext(unitName = "PIJEE-ejb")
	EntityManager em;
	
	


	@Override
	public int AddLike(Like l) {
		System.out.println("In addComent : ");
		em.persist(l);
		System.out.println("Out of addComment" + l.getId());
		return l.getId();}




	@Override
	public void RemoveLike(int iduser, int idcomment) {
		 em.createQuery("DELETE FROM Like c WHERE c.iduser="+String.valueOf(iduser)+"AND c.idcomment="+String.valueOf(idcomment)).executeUpdate();

		
	}






	

}
