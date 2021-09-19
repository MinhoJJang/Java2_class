package Static;

// �ϳ��� �Խù��� ǥ��
public class Article {
	/*
	 * static�� ��� ��ü�� �����ϴ� ���̴�. 
	 * static���� Ŭ���� �̸��� ���ؼ� �����ؾ� �ϸ�, 
	 * ��ü�� ���� ���ο� ��� ���� ����� �����ϴ�.
	 */
	
	// ��ü �Խù��� ���� ǥ���ϱ� ���� ������
	private static int count = 0;
	// ��� �Խù��� �ϳ��� ī�װ� �ȿ� �����Ѵٰ� �����Ѵ�.
	// �Խù��� �з��� �����ϱ� ���� ������
	private static String category;
	
	private int num;		// �� ��ȣ
	private String title;	// �� ����
	private String regDate;	// �ۼ��Ͻ�
	
	public Article(int num, String title, String regDate) {
		super();
		this.num = num;
		this.title = title;
		this.regDate = regDate;
		
		/*
		 * �� Ŭ������ ���� ��ü ���� -> �Խù� �ű� ���
		 * �Խù��� ���� ��ϵ� �� ����, ��ü �� ���� �ǹ��ϴ�
		 * count ������ 1�� �����Ѵ�.
		 * ��ü �Խù� ���� ��� ��ü�� �����ϴ� ���̹Ƿ�,
		 * static���� �����Ǿ�� �Ѵ�.
		 */
		count++;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Article.count = count;
	}

	public static String getCategory() {
		return category;
	}

	public static void setCategory(String category) {
		Article.category = category;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return  "�� �з� = " + category + 
				" , ��ü �� �� = " + count +
				", Article [num=" + num + 
				", title=" + title + 
				", regDate=" + regDate + "]";
	}
	
	
	
	
	
	
}




