package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import common.DBManager;
import dto.Member;

/**
 * membersテーブルを操作するDao.
 * 
 * @author igamasayuki
 *
 */
public class MemberDao {
	private static final String TABLE_NAME = "test_members";
	/**
	 * 全件検索を行います.
	 * 
	 * @return メンバー情報の全件
	 */
	public List<java.lang.reflect.Member> findAll(){
		Connection con = DBManager.createConnection();
		String sql = "SELECT * FROM " + TABLE_NAME;
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに全件検索処理を書く
			ResultSet rs = pstmt.executeQuery();
            List<Member> list = new ArrayList<>();
			
            while (rs.next()) {
                Member member = new Member();
                member.setId(rs.getInt("id"));
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
				member.setDep_id(rs.getInt("dep_id"));
				list.add(member);
			}
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("全件検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

	/**
	 * 主キー検索を行います.
	 * 
	 * @param id 検索したい主キーの値
	 * @return　メンバー情報(検索されなかった場合はnullが返ります)
	 */
	public Member load(int id){
		Connection con = DBManager.createConnection();
		String sql = "SELECT * FROM " + TABLE_NAME + " WHERE id = 2";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに主キー検索処理を書く
			pstmt.setInt(2, id);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Member member = new Member();
                member.setId(rs.getInt("id"));
                member.setName(rs.getString("name"));
                member.setAge(rs.getInt("age"));
				member.setDep_id(rs.getInt("dep_id"));
				return member;
            }
			
			return null; //←コンパイルエラーを消すための処理なので必要なら書き換えてください
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("主キー検索処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}
	/**
	 * メンバー情報を登録します.
	 * 
	 * @param member メンバー情報
	 */
	public void insert(Member member){
		Connection con = DBManager.createConnection();
		String sql = "INSERT INTO " + TABLE_NAME + " (name, age, dep_id) VALUES ('シロー', 54, 3)";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			// ここに挿入処理を書く
			pstmt.setInt(1, member.getId());
            pstmt.setString(2, member.getName());
            pstmt.setInt(3, member.getAge());
            pstmt.setInt(4, member.getDep_id());
            pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("登録処理に失敗しました",e);
		} finally {
			DBManager.closeConnection(con);
		}
	}

}
