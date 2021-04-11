package com.DAO;

import java.sql.ResultSet;
import java.util.List;

import com.Model.ClientModel;



public interface ClientDAO {
	void addClient(ClientModel c);
	void updateClient(ClientModel c);
	ClientModel getClient(int id);
	List<ClientModel> getClients();
	public ClientModel verify(String mail, String mdp);
}
