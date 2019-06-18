package com.project.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.project.bean.BookBean;

public interface IBookDao {
	@Select("select b_id id,b_name name,b_price price,b_type type,b_number number from b_book")
	public List<BookBean> findAll();
	@Update("update b_book set b_number=b_number+1 where b_id=#{id}")
	public void updateById(int id);
	@Select("select b_name name,b_type type,b_price price from b_book where b_id=#{id}")
    public BookBean findById(int id);
	@Select("select b_imgname imgName from b_book where b_id=#{id}")
	public String findImg(int id);

}
