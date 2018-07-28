package com.uaijug.appex.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uaijug.appex.model.domain.Client;

@Repository
public class ClientDAO {

	private List<Client> clients = new ArrayList<>();
	
	public void save(Client client) {
		clients.add(client);
	}
	
	public List<Client> list() {
		return this.clients;
	}
}
