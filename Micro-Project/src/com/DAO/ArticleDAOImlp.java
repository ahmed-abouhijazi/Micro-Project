package com.DAO;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.Model.ArticleModel;
import com.Model.ConnexionDB;

public class ArticleDAOImlp implements ArticleDAO {
	
	@Override
	public List<ArticleModel> ArticleParType(String t) {
		List<ArticleModel> articles = null;
		PreparedStatement ps;
		ResultSet rs;
		String query1 ="SELECT * FROM article WHERE Type='"+t+"';";

		try {
			ps = ConnexionDB.getConn().prepareStatement(query1);
			rs = ps.executeQuery();
			while(rs.next()) {
				
			
				ArticleModel ar = new ArticleModel();

					ar.setReference(rs.getString("Reference"));
					ar.setAuteur(rs.getString("Auteur"));
					ar.setQuantite(Integer.parseInt(rs.getString("Quantité")));
					ar.setTitre(rs.getString("Titre"));
					ar.setType(rs.getString("Type"));
					ar.setPhoto(rs.getString("Photo"));
					ar.setPrix(Double.parseDouble(rs.getString("Prix")));
					articles.add(ar);
			}
			return articles;
		} catch (SQLException e) {
			e.printStackTrace();// TODO: handle exception
		}

		return null;
		
	}


}
