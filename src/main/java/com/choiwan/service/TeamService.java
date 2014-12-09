package com.choiwan.service;

import java.util.List;

import com.choiwan.domain.Team;

public interface TeamService {
	void addTeam(Team team);
	void updateTeam(Team team);
	Team getTeam(int id);
	Void deleteTeam(int id);
	List<Team> getTeams();

}
