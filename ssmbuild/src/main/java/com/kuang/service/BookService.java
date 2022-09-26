package com.kuang.service;
import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author HuHu
 * @version 1.0
 * @date 2022-05-26 17:03
 */
//BookService:底下需要去实现,调用dao层
public interface BookService {
    //增加一个Book
    int addBook(Books book);
    //根据id删除一个Book
    int deleteBookById(int id);
    //更新Book
    int updateBook(Books books);
    //根据id查询,返回一个Book
    Books queryBookById(int id);
    //查询全部Book,返回list集合
    List<Books> queryAllBook();
    //查询搜索
    Books queryBookByName(String bookName);
}

