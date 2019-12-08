package interfaces;





import javax.ejb.Local;


import entity.Like;


@Local
public interface LikeServiceLocal {
	public int AddLike(Like l);
	public void RemoveLike(int iduser,int idcomment);
	
	//public void RemovePost(int id);
	//public Post FindPostById(int id);
	
	//public void UpdatePost(Post PostNewValues);
}
