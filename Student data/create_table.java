import java.sql.*;
import java.util.*;


public class CreateTable
{
    public static void main(String args[])
    {
    	try{
	Scanner sc = new Scanner(System.in);
	DATA_de d = new DATA_de();	
        Connection c = null;
        Statement stmt = null;
    	String CreateSql = null;

	Class.forName("org.postgresql.Driver");
        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        System.out.println("Database Connected ..");
	int a = 0 ;
	while(a!=-1)
	{
    		System.out.println("choose an action: 1) Create Table...2)Add values..3) display...");
		a = sc.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("\n");
				d.table_Cre();
				break;
			case 2:
				System.out.println("\n");
				d.insert_val();
				break;
			case 3:     
				System.out.println("\n"); 
				d.display();
				break;
			default:
				System.out.println("Enter values between 1-3");
			
		}
	}
	
    		} catch (Exception e){
        			System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        			System.exit(0);
        		}	
	    }
	

}
	
class DATA_de
{
			
			 public static void table_Cre()
			{
				try{
					Scanner sc = new Scanner(System.in);	
        				Connection c = null;
       					Statement stmt = null;
    					String CreateSql = null;
					
					Class.forName("org.postgresql.Driver");
       					c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        				//System.out.println("Database Connected ..");
		
				
        				stmt = c.createStatement(); 
   
        				//CreateSql = "Create Table  Student(STUDENT_NO varchar(3) not null primary key,STUDENT_NAME varchar(30),STUDENT_DOB DATE date, STUDENT_DOJ DATE) ";      
        				
				
			public static void insert_val()
			{
				try{
  					Scanner sc = new Scanner(System.in);	
        				Connection c = null;
       					Statement stmt = null;
    					String CreateSql = null;
				
					Class.forName("org.postgresql.Driver");
        				c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        				//System.out.println("Database Connected ..");
	
					System.out.println("Enter name");
					String Dname = sc.nextLine();
					System.out.println("Enter Student_no");
					String Student_no= sc.nextLine();
                                        System.out.println("Enter Student_dob");
					String Student_dob= sc.nextLine();
                                        System.out.println("Enter Student_doj");
					String Student_doj= sc.nextLine();
					String sql = "INSERT INTO student " + "VALUES (?,?,?,?)";
			
					//stmt.executeUpdate(sql);
			
					PreparedStatement myStmt = c.prepareStatement(sql); 
					myStmt.setString(1,name);    
					myStmt.setString(2,Student_no);
                                        myStmt.setString(3,Student_dob);    
					myStmt.setString(4,Student_doj);
                          		
				
					System.out.println("values added successfuly"); 
					myStmt.executeUpdate();   
					//stmt.close();
					//c.close();
				}catch (Exception e){
        					System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        					System.exit(0);
        				}
			}
				public static void display()
      				{
        				try{
  						Scanner sc = new Scanner(System.in);
        					Connection c = null;
       						Statement stmt = null;
    						String CreateSql = null;


						Class.forName("org.postgresql.Driver");
        					c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "postgres");
        					//System.out.println("Database Connected ..");
	
                				PreparedStatement pst = c.prepareStatement("SELECT * FROM Department");
                        			ResultSet rs = pst.executeQuery();
						

						
          					System.out.println("name         Student_no      Student_dob        Student_doj");
          					while (rs.next()) {
                  					System.out.print(rs.getString(1));
                  					System.out.print("      :     ");
                  					System.out.println(rs.getString(2));
                                                        System.out.print("      :     ");
                                                        System.out.print(rs.getString(3));
                  					System.out.print("      :     ");
                  					System.out.println(rs.getString(4));
                                                        System.out.println("\n");
              					}
						
					}catch (Exception e){
        					System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        					System.exit(0);
        			}	  		
	
  	
}
  	

}