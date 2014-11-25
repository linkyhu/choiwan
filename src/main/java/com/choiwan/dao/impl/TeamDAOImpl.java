package com.choiwan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.choiwan.dao.TeamDAO;
import com.choiwan.domain.Team;

@Repository//表明注解它是一个DAO
public class TeamDAOImpl implements TeamDAO {

	/**
	 * Hibernate工作原理： 
	 *1.读取并解析配置文件 
	 *2.读取并解析映射信息，创建SessionFactory 
 	 *3.打开Sesssion 
     *4.创建事务Transation 
	 *5.持久化操作 
	 *6.提交事务 
	 *7.关闭Session
	 *8.关闭SesstionFactory
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
