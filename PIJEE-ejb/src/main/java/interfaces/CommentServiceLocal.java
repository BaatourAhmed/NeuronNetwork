package interfaces;



import java.util.List;

import javax.ejb.Local;

import entity.Comment;


@Local
public interface CommentServiceLocal {
	public int AddComment(Comment c);
	//public void RemovePost(int id);
	//public Post FindPostById(int id);
	public List<Comment> FindAllComments(int id);
	//public void UpdatePost(Post PostNewValues);
}
