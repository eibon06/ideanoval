package com.humanbooster.services.impl;

import java.time.Instant;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humanbooster.business.Idea;
import com.humanbooster.dao.IdeaDao;
import com.humanbooster.services.IdeaService;

@Service
public class IdeaServiceImpl implements IdeaService {
	
	@Autowired
	private IdeaDao id;

	@Override
	public Idea findIdeaById(int idIdea) {
		Idea idea = id.findIdeaById (idIdea);
		return idea;
	}
	
	public List<Integer> getAllIdFromIdea(){
		List<Integer> listeId = id.getAllIdFromIdea();
		return listeId ;
	}


	@Override
	public boolean addIdea(Idea idea) {
		idea.setPublishDateIdea(Date.from(Instant.now()));
		idea.setAvailableIdea(true);
		if(id.saveIdea(idea)){
			return true;
		}else{
		return false;
		}
	}

	@Override
<<<<<<< HEAD
	public boolean updateIdea(Idea idea) {
		
		return id.updateIdea(idea);
=======
	public List<Idea> findEnableIdea() {
		return id.findEnableIdea();
>>>>>>> origin/master
	}

}
