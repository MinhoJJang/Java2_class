package overload;

public class Article {
	private int seq;
	private String subject;
	private String writer;
	
	public Article(int seq, String subject, String writer) {
		super();
		this.seq = seq;
		this.subject = subject;
		this.writer = writer;
	}
	
	public Article( int seq ) {
		this(seq, "�������", "�͸�");
	}
	
	public Article( int seq, String subject ) {
		this(seq, subject, "�͸�");
	}

	@Override
	public String toString() {
		return "Article [seq=" + seq + ", subject=" + subject 
				+ ", writer=" + writer + "]";
	}
	
	
	
	
	
	
}
