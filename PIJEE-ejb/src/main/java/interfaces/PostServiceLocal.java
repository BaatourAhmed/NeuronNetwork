package interfaces;

import java.util.List;

import javax.ejb.Local;

import entity.Post;

@Local
public interface PostServiceLocal {
	public int AddPost(Post P);
	public void RemovePost(int id);
	public Post FindPostById(int id);
	public List<Post> FindAllPosts();
	public void UpdatePost(Post PostNewValues);
}
