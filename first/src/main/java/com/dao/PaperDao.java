package com.dao;

import com.pojo.Paper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PaperDao {
    int addPaper(Paper paper);
    int deletePaperById(long id);
    int updatePaper(Paper paper);
    Paper queryById(long id);
    List<Paper> queryAllPaper();

    List<Paper> findByName(@Param("name") String name);
}
