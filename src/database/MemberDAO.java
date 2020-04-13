package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import com.mysql.cj.jdbc.PreparedStatementWrapper;

public class MemberDAO {
	// 드라이버 클래스 로드
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 커넥션 연결
	public Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";	// 데이터 베이스 서버 주소 및 연결문자열
		String user = "javadb"; 								// 허가받은 사용자 아이디
		String password = "12345";								// 비밀번호

		Connection con = null;
		try {
			con=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	// 데이터베이스 요청 작업
	public Vector<MemberVO> getList() {
		Vector<MemberVO> vecList = new Vector<MemberVO>();
		
		String sql = "select * from memberTBL";
		try (Connection con = getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql);
			 ResultSet rs = pstmt.executeQuery()) {
			
			while (rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString(2));
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString(4));
				vecList.add(vo);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vecList;
	}
	
	public int insert(MemberVO vo) {
		String sql = "insert into memberTBL values(member_seq.nextval, ?, ?, ?)"; // ? = 사용자가 입력 해야되는 것
		int result = 0;
		try (Connection con = getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql)){
//			 PreparedStatement : 서버로 쿼리 문장 전송하는 역할 → insert into memberTBL values(member_seq.nextval, ?, ?, ?, ?) 준비 시켜놓고 서버에 보내면 준비가 되어 있기 때문에 바로 실행을 가능하게 해준다
			
			// 쿼리 실행
			pstmt.setString(1, vo.getName());
			pstmt.setInt(2, vo.getAge());
			pstmt.setString(3, vo.getGender());
			
			
			result = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;	// 1 나오면 성공, 0 나오면 실패
	}
	
	// no에 해당하는 레코ㅗ드 가져오기
	public MemberVO getRow(int no) {
		String sql = "select * from memberTBL where no =?";
		MemberVO vo = null;
		
		try (Connection con = getConnection();
			 PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, no);
			ResultSet rs = pstmt.executeQuery();
			// ResultSet : | | | | | 한줄을 vo에 옮겨 담는다
			
			if (rs.next()) {
				// 하나만 나올수 있는 값이라서 if문 를 쓴것
				vo = new MemberVO();
				vo.setNo(rs.getInt(1));
				vo.setName(rs.getString("name"));	// 필드명 담아서 하는 방식
				vo.setAge(rs.getInt(3));
				vo.setGender(rs.getString("gender"));
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	
	//no 값을 이용해서 회원 삭제하기
		// delete from memberTBL where no=?
		public int remove(int no) {
			int result=0;
			String sql="delete from memberTBL where no=?";
			try(Connection con=getConnection();
				PreparedStatement pstmt=con.prepareStatement(sql)) {
				
				pstmt.setInt(1, no);
				result = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			return result;
		}
}
