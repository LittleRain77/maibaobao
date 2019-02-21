package com.smallapple.mbb.biz.inter;

import java.util.List;

import com.smallapple.mbb.vo.Admin;
import com.smallapple.mbb.vo.Page;

public interface AdminBizInter {
	//�������Ա����Ϣ
	List<Admin> getAllAdminInfo(Page page);
	//�������������Ա����Ϣ
	List<Admin> getAllAdminInfo(String keyword,Page page);
	//����ܵ���Ŀ��
	int getNumber();
	//ɾ��Ա��
	boolean deleteAdmin(String aid);
	//���Ա��
	boolean insertAdmin(Admin admin);
	//���һ��Ա����Ϣ
	Admin getOneAdminInfo(String aid);
	//�޸�Ա����Ϣ
	boolean updateAdmin(Admin admin);
	//�ж��û��Ƿ����
	int isHaveAdmin(String aid);
	//����Ա������Ϣ�޸Ĳ�ѯģ��
	Admin searchChangeAdmin(String aid);
	//����Ա������Ϣ�޸Ĳ���ģ��
	boolean insertChangeAdmin(Admin admin);

}
