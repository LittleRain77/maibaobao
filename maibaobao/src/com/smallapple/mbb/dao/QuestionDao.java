package com.smallapple.mbb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.smallapple.mbb.dao.inter.QuestionDaoInter;
import com.smallapple.mbb.dbutil.DBHelp;
import com.smallapple.mbb.vo.Goods;
import com.smallapple.mbb.vo.Page;
import com.smallapple.mbb.vo.Question;

public class QuestionDao implements QuestionDaoInter {
	private DBHelp hp;

	public QuestionDao() {
		hp=new DBHelp();
	}

	@Override
	public int searchNumber() {
		//查询总条目数
		String sql="select count(*) from question";
		int temp=0;
		try {
			ResultSet rs=hp.select(sql);
			if(rs.next()){
				temp=rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public int insert(Question qst) {
		// 添加咨询
		String sql="insert into question(uid,gid,qtype,qtext,qtime) values(?,?,?,?,?)";
		int temp=-1;
		try {
			temp=hp.update(sql, qst.getUid(),qst.getGds().getGid(),qst.getQtype(),qst.getQtext(),qst.getQtime());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	@Override
	public List<Question> select(Page page) {
		// 查询所有
		String sql="SELECT q.qid,q.uid,g.gname,q.qtype,q.qtext,q.qtime FROM question AS q INNER JOIN goods AS g ON q.gid = g.gid limit ?,?";
		List<Question> list=new ArrayList<Question>();
		try {
			ResultSet rs=hp.select(sql, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Question qst=new Question();
				qst.setQid(rs.getInt("q.qid"));
				qst.setUid(rs.getString("q.uid"));

				Goods gds=new Goods();
				gds.setGname(rs.getString("g.gname"));
				qst.setGds(gds);

				qst.setQtype(rs.getString("q.qtype"));
				qst.setQtext(rs.getString("q.qtext"));
				qst.setQtime(rs.getString("q.qtime"));

				list.add(qst);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Question> select(String keyword, Page page) {
		// 根据商品名称模糊查询
		String sql="SELECT q.qid,q.uid,g.gname,q.qtype,q.qtext,q.qtime FROM question AS q INNER JOIN goods AS g ON q.gid = g.gid where g.gname like ? limit ?,?";
		keyword="%"+keyword+"%";
		List<Question> list=new ArrayList<Question>();
		try {
			ResultSet rs=hp.select(sql,keyword, page.getSelectIndex(),page.getShowNumber());
			while(rs.next()){
				Question qst=new Question();
				qst.setQid(rs.getInt("q.qid"));
				qst.setUid(rs.getString("q.uid"));

				Goods gds=new Goods();
				gds.setGname(rs.getString("g.gname"));
				qst.setGds(gds);

				qst.setQtype(rs.getString("q.qtype"));
				qst.setQtext(rs.getString("q.qtype"));
				qst.setQtime(rs.getString("q.qtime"));

				list.add(qst);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
}

}
