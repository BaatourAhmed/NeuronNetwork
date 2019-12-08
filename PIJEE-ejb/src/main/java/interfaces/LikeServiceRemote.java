package interfaces;

import java.util.List;

import javax.ejb.Remote;

import entity.Like;
import entity.Post;

@Remote
public interface LikeServiceRemote {
	public int AddLike(Like l);
	public void RemoveLike(int iduser,int idcomment);
	
	
}
