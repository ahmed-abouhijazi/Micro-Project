package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.Model.ClientModel;

import com.Model.ConnexionDB;

public class ClientDAOImlp implements ClientDAO{
	private Connection conn;
	@Override
	public void addClient(ClientModel c) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		conn = ConnexionDB.getConn();
		String query ="INSERT INTO clients (Id,Email,Nom,Prenom,Adresse,CodePostal,Ville,Tel,MotPasse) VALUES (NULL,?,?,?,?,?,?,?,?);";

		
		try {
			PreparedStatement pr = conn.prepareStatement(query);
			pr.setString(1, c.getEmail());
			pr.setString(2, c.getNom());
			pr.setString(3, c.getPrenom());
			pr.setString(4, c.getAdresse());
			pr.setString(5, c.getCodePostal());
			pr.setString(6, c.getVille());
			pr.setString(7, c.getTel());
			pr.setString(8, c.getMotPasse());
			pr.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}
		System.out.println("added");
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
	}

	@Override
	public void updateClient(ClientModel c) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ClientModel getClient(int id) {

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ClientModel> getClients() {
		// TODO Auto-generated method stub
		return null;
	}
	public ClientModel verify(String mail,String mdp) {
		PreparedStatement ps;
		ResultSet rs;
		String query1 ="SELECT * FROM clients WHERE Email='"+mail+"' AND MotPasse='"+mdp+"';";

		try {
			ps = ConnexionDB.getConn().prepareStatement(query1);
			rs = ps.executeQuery();

			if(rs.next()!=false) {
				ClientModel c1 = new ClientModel();

					c1.setNom(rs.getString("Nom"));
					c1.setPrenom(rs.getString("Prenom"));
					c1.setEmail(rs.getString("Email"));
					c1.setAdresse(rs.getString("Adresse"));
					c1.setCodePostal(rs.getString("CodePostal"));
					c1.setVille(rs.getString("Ville"));
					c1.setTel(rs.getString("Tel"));
					c1.setMotPasse(rs.getString("MotPasse"));
					return c1;
			}
			else return null;
			
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}

		return null;
		
	}

}
