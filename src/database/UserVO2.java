package database;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserVO2 {	// 오라클 UserTBL 연동
	private int no;
	private String username;
	private int birthYear;
	private String addr;
}
