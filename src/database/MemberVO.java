package database;

public class MemberVO {
	// memberTBL 내용 담기
	private int no;
	private String name;
	private int age;
	private String gender;
	
//	@NoArgsConstructor
	public MemberVO() {
		super();
	}
//	@AllArgsConstructor
	public MemberVO(int no, String name, int age, String gender) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}	
//	@Getter
//	@Setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//	@ToString
	@Override
	public String toString() {
		return "MemberVO [no=" + no + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}
