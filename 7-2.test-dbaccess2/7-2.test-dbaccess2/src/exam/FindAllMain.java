package exam;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

import dao.MemberDao;

/**
 * findAll()メソッド、動作確認用の実行クラスです.
 * 
 * @author igamasayuki
 *
 */
public class FindAllMain {

	public static void main(String[] args) {
		MemberDao dao = new MemberDao();

		List<Member> list = dao.findAll();
		
		for (Member answer : list) {
			System.out.println(list);
		}

	}

}
