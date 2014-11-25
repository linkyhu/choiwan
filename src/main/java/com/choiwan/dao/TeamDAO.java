package com.choiwan.dao;

import java.util.List;

import com.choiwan.domain.Team;

public interface TeamDAO {
	void addTeadm(Team team);
	void updateTeam(Team team);
	Team getTeam(int id);
	void deleteTeam(int id);
	List<Team> getTeams();

}
