package com.shallowan.spring.boot.repository;

import java.util.List;

import com.shallowan.spring.boot.domain.User;

/**
 * User Repository�ӿ�
 * 
 * @author Elliot
 *
 */
public interface UserRepository {

	/**
	 * ���������޸��û�
	 * 
	 * @param user
	 * @return
	 */
	User saveOrUpdateUser(User user);

	/**
	 * ɾ���û�
	 * 
	 * @param id
	 */
	void deleteUser(Long id);

	/**
	 * ����id��ѯ�û�
	 * 
	 * @param id
	 * @return
	 */
	User getUserById(Long id);

	/**
	 * ��ȡ�û��б�
	 * 
	 * @return
	 */
	List<User> listUsers();
}
