package interfaces;

import java.util.List;

import javax.ejb.Remote;

import entity.Post;

@Remote
public interface PostServiceRemote {
	public int AddPost(Post P);
	public void RemovePost(int id);
	public Post FindPostById(int id);
	public List<Post> FindAllPosts();
	public void UpdatePost(Post PostNewValues);
}
