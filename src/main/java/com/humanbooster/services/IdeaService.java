package com.humanbooster.services;

import java.util.List;

import com.humanbooster.business.Idea;

public interface IdeaService {
	
	public Idea findIdeaById(int idIdea);
	
	public Idea findIdeaByTitle(String titleIdea);

	public boolean addIdea(Idea idea);
	
	public List<Integer> getAllIdFromIdea();

	public boolean updateIdea(Idea idea);

	public List<Idea> findEnableIdea();

}
