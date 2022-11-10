package andmember;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;


@Repository
public class AndMemberDAO {

	@Autowired @Qualifier("cteam") private SqlSession sql;
	
	
	//회원탈퇴 - jk 2022/09/29
	public int delete(String email) {
		return sql.delete("andmember.delete", email);
	}
	

	//내정보 수정 - jk 2022/09/28
	public int update(MemberVO vo) {
		return sql.update("andmember.update", vo );
	}
	
	//내정보 수정 파일 경로 확인 - jk 2022/09/28
	public MemberVO profile_image_detail(String email) {
		return sql.selectOne("andmember.detail", email);
	}
	
	
	// 로그인
	public MemberVO login(MemberVO vo) {
		return sql.selectOne("andmember.login", vo);
	}

	
	// 회원가입 - hs
	public int join(MemberVO vo) {
		return sql.insert("andmember.and_join", vo);
	}

	//소셜 회원가입
	public int social_join(MemberVO vo) {
		return sql.insert("andmember.social_join", vo);
	}

	
	//이메일 체크 - hs
	public boolean email_check(String email) {
		//return (Integer) sql.selectOne("andmember.email_check", email) == 1 ? true : false;
		int result = (Integer) sql.selectOne("andmember.email_check", email);
		return result == 1 ? true : false;
	}
	
	//소셜 아이디 중복체크 -sb
	public int social_email_check(MemberVO vo) {
		// 결과값이 1이상이면 true , 아니면 false
		return (Integer)sql.selectOne("andmember.social_id_check", vo);
	}


	//로그인정보 변경- jk
	public MemberVO resume(MemberVO vo) {
		return sql.selectOne("andmember.resume", vo);
	}





}
