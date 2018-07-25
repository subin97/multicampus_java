# Day 14
***
- C:\Program Files\Java\jdk1.8.0_181\jre\lib\ext  
    위 폴더에 오라클 라이브러리 복사 해서 붙여넣기한다.

 검색어 : data source explorer

### JDBC  
> 자바 프로그램 안에서 SQL을 실행하기 위해 데이터베이스를 연결해주는 응용프로그램 인터페이스를 말한다.

  1. 드라이버 로드  
  ~~~java
	Class.forName("oracle.jdbc.OracleDriver");
  ~~~
  2. 연결
	~~~java
  Connection conn = DriverManager.getConnection(url, uid, pwd);
  ~~~
  3. SQL 명령어 사용  
  [JDBC정리](http://blog.naver.com/PostView.nhn?blogId=reddezi&logNo=220943872649&categoryNo=24&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView)
  ~~~java
  Statement stmt = conn.createStatement();
	ResultSet rs = stmt.executeQuery(" select * from gift "); //반환값 있는 경우

	stmt.executeUpdate(sql);  // 반환값이 없는 경우

  System.out.println("상품번호\t상품명\t최저가\t최고가");
  while(rs.next()) {
    int gno = rs.getInt(1);  // int gno = rs.getInt("gno");
    // 필드명 인덱스로 호출 가능, 권장은 X
    String name = rs.getString("gname");
    int g_s = rs.getInt("g_start");
    int g_e = rs.getInt("g_end");

    System.out.println(gno+ "\t" + name + "\t" + g_s + "\t" + g_e);
  } // 레코드 가져오기
  ~~~
  4. 닫기
  ~~~java
  rs.close();    stmt.close();    conn.close();
  ~~~
  - API 확인하기
  ~~~java
>> Database 연결 eclipse : Data Source Explorer
  ~~~

### pstmt
[PreparedStatement.executeUpdate 메소드를 사용하여 테이블에서 데이터 갱신](https://www.ibm.com/support/knowledgecenter/ko/SSEPGG_11.1.0/com.ibm.db2.luw.apdv.java.doc/src/tpc/imjcc_tjvpsxup.html)
