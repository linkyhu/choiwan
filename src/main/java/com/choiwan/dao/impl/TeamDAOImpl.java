package com.choiwan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choiwan.dao.TeamDAO;
import com.choiwan.domain.Team;

@Repository//����ע������һ��DAO
public class TeamDAOImpl implements TeamDAO {

	/**
	 * Hibernate����ԭ�� 
	 *1.��ȡ�����������ļ� 
	 *2.��ȡ������ӳ����Ϣ������SessionFactory 
 	 *3.��Sesssion 
     *4.��������Transation 
	 *5.�־û����� 
	 *6.�ύ���� 
	 *7.�ر�Session
	 *8.�ر�SesstionFactory
	 */
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getCurrentSession()
	{
		return sessionFactory.getCurrentSession();
	}
	public void addTeadm(Team team) {
		// TODO Auto-generated method stub
		
	}

	public void updateTeam(Team team) {
		// TODO Auto-generated method stub
		
	}

	public Team getTeam(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteTeam(int id) {
		// TODO Auto-generated method stub
		
	}

	public List<Team> getTeams() {
		// TODO Auto-generated method stub
		return null;
	}

}
