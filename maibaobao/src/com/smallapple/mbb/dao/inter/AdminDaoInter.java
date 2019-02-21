package com.smallapple.mbb.dao.inter;

import java.util.List;

import com.smallapple.mbb.vo.Admin;
import com.smallapple.mbb.vo.Page;

public interface AdminDaoInter {
	List<Admin> searchAll(Page page);
	List<Admin> searchAll(String keyword,Page page);
	//�������Ŀ��
	int searchNumber();
	//ɾ��
	int deleteAdmin(String aid);
	//���
	int insertAdmin(Admin admin);
	//����һ��Ա������Ϣ
	Admin searchById(String aid);
	//�޸�Ա����Ϣ�ķ���
	int update(Admin admin);
	//����Ա�޸ĸ�����Ϣ��ѯģ��
	Admin selectChangeAdmin(String aid);
	//����Ա�޸ĸ�����Ϣ����ģ��
	int insertChangeAdmin(Admin admin);

}
