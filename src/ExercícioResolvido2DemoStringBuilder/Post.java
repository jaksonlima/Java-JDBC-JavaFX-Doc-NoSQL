package ExercícioResolvido2DemoStringBuilder;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date moments;
	private String titles;
	private String content;
	private Integer likes;

	private List<Comment> comments = new ArrayList<>();

	public Post(Date moments, String titles, String content, Integer likes) {
		this.moments = moments;
		this.titles = titles;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoments() {
		return moments;
	}

	public void setMoments(Date moments) {
		this.moments = moments;
	}

	public String getTitles() {
		return titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public String getContent() {
		return content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public void addComments(Comment comment) {
		comments.add(comment);
	}

	public void removeComments(Comment comment) {
		comments.remove(comment);
	}

	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append(titles + "\n");
		s.append("likes :" + likes + "\n");
		s.append(sdf.format(moments) + "\n");
		s.append(content + "\n");
		s.append("Comments: \n");
		for (Comment c : comments) {
			s.append(c.getText() + "\n");
		}
		return s.toString();

	}

}
