package com.uaijug.appex.model.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uaijug.appex.dao.ClientDAO;
import com.uaijug.appex.exceptions.CPFValidationException;
import com.uaijug.appex.model.domain.Client;

@Service
public class ClientService {

	@Autowired
	private ClientDAO dao;
	
	public void save(Client client) {
		if(client == null || client.getCpf().length() < 11) {
			throw new CPFValidationException();
		} else {
			dao.save(client);
		}
	}
	
	public List<Client> list() {
		return dao.list();
	}
}
