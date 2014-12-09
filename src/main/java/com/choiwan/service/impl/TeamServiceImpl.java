package com.choiwan.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.choiwan.dao.TeamDAO;
import com.choiwan.domain.Team;
import com.choiwan.service.TeamService;

@Service
@Transactional
public class TeamServiceImpl implements TeamService{

	@Autowired
	private TeamDAO teamDAO;
	public void addTeam(Team team) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeam(Team team) {
		// TODO Auto-generated method stub
		
	}

	public Team getTeam(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Void deleteTeam(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Team> getTeams() {
		// TODO Auto-generated method stub
		return null;
	}

}
