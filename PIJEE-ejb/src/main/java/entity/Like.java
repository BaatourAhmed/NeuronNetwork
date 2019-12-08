package entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * Entity implementation class for Entity: Comment
 *
 */
@Entity
@Table(name="likee")
public class Like implements Serializable {
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Comment getIdcomment() {
		return idcomment;
	}

	public void setIdcomment(Comment idcomment) {
		this.idcomment = idcomment;
	}

	@JoinColumn(name="idcomment",referencedColumnName="id")
	@ManyToOne
	private Comment idcomment;
	
	@JoinColumn(name="iduser",referencedColumnName="id")
	@ManyToOne
	private User iduser;
	
	
	public User getIduser() {
		return iduser;
	}

	public void setIduser(User iduser) {
		this.iduser = iduser;
	
	
	}
	
   
}
