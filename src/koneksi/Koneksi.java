
package koneksi;

import java.sql.Connection;
public class Koneksi {
    


    public static Connection koneksi_database() {
        try {
            MysqlDataSource m = new MysqlDataSource();
            m.setUser("root");
            m.setPassword("");
            m.setDatabaseName("absensikaryawan");
            m.setServerName("localhost");
            m.setPortNumber(3306);
            m.setServerTimeZone("Asia/Jakarta");
            
            Connection C = m.getConnection();
            System.out.println("sukses terhubung ke database");
            return C;
           
                    
        } catch (Exception e) {
            //penanganan eror
            System.out.println("gagal terhubung ke database");
            System.out.println("Eror: "+ e.getMessage());
            
        }
        return null;
    }
    
}


   
    
    

