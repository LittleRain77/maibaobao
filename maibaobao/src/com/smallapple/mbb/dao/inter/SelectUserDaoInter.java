package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.User;

public interface SelectUserDaoInter {
	//��ѯ�û�
	List<User> selectUserDao(Page page);
	//��������ѯ�û�
	List<User> selectUserKey(String userkey,Page page);
	//��ѯ����������������ҳʹ�ã�
	int countUser();
	//ɾ���û�
	int deleteUserDao(String uid);
	//�޸��û���ѯģ��
	User selectChangeUser(String uid);
	//�޸��û�����ģ��
	int insertChangeUser(User uid);
	//�������Ĳ�ѯ
	User selectPerson(String uid);

}
