package interfaces;

import java.util.List;

import javax.ejb.Remote;

import entity.Comment;

@Remote
public interface CommentServiceRemote {
	public int AddComment(Comment c);
	//public void RemovePost(int id);
	//public Post FindPostById(int id);
	public List<Comment> FindAllComments(int id);
	//public void UpdatePost(Post PostNewValues);
}
