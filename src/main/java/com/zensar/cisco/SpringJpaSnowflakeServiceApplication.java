package com.zensar.cisco;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
 public class SpringJpaSnowflakeServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaSnowflakeServiceApplication.class, args);
	}

	/*
	 * @Autowired StudentRepository sn;
	 * 
	 * @Override public void run(String... args) {
	 * 
	 * try{
	 * 
	 * 
	 * System.out.println("Inside the run method");
	 * Class.forName("net.snowflake.client.jdbc.SnowflakeDriver"); Connection
	 * con=DriverManager.getConnection(
	 * "jdbc:snowflake://ciscodev.us-east-1.snowflakecomputing.com/?role=CSCQUALITY_QPI_BUS_ANALYST_ROLE&warehouse=CSCQUALITY_QPI_RPT_WH",
	 * "cscquality_qpi_rpt_svc",")DE)h2TDln"); //here sonoo is database name, root
	 * is username and password Statement stmt=con.createStatement(); ResultSet
	 * rs=stmt.
	 * executeQuery("SELECT COUNT(*)  FROM \"CSCQUALITY_DB\".\"CSCQUALITY_QPI_BR\".\"QPI_FRAP_UPLOADED_SN\" WHERE FRAP_CASE_ID='FRAP_296'\n"
	 * + "AND UPLOADED_ON!='2021-01-04 23:35:29.718'"); while(rs.next())
	 * System.out.println(rs.getInt(1)); con.close();
	 * 
	 * 
	 * System.out.println("count =="+sn.findCount()); }catch(Exception e){
	 * System.out.println(e);} }
	 */
	
	@Override
	public void run(String...strings ) {
	
		System.out.println("Inside the SpringJpaRunner");
	}
	
}
