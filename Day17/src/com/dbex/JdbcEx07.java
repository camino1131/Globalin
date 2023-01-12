package com.dbex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcEx07 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// 동적 쿼리문 작성
		String sql = "select a.name, a.profno, a.position, b.dname from professor a, department b "
				+"where a.deptno=b.deptno and a.deptno=?";

		try {
			// 데이터베이스 연결
			conn = ConnUtil.getConnection();

			pstmt = conn.prepareStatement(sql);

			// 바인팅 변수 설치
			pstmt.setInt(1, 203);

			rs = pstmt.executeQuery();

			// 결과 추출
			while (rs.next()) {
				String s1 = rs.getString("name");
				int i = rs.getInt("profno");
				String s2 = rs.getString("dname");
				String s3 = rs.getString("position");

				System.out.println(s1 + "\t" + i + "\t" + s2 + "\t" + i + "\t" + s3 + "\t");

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			try {
				if (pstmt != null)
					pstmt.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}

	}

}
