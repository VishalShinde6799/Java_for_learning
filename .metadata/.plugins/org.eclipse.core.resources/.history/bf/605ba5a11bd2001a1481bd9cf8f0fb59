package com.zensar.main;

import java.sql.Connection;
import java.sql.SQLException;

import com.zensar.dbconfig.Connectivity;

public class ConnectionTest {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = Connectivity.getConnectivity();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
