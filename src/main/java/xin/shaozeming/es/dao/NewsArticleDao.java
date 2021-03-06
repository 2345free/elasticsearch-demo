package xin.shaozeming.es.dao;

import org.apache.ibatis.annotations.Mapper;
import xin.shaozeming.es.po.NewsArticlePO;

import java.util.List;

@Mapper
public interface NewsArticleDao {
    /**
     * 根据主键删除数据库的记录
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     * 插入数据库记录
     *
     * @param record
     */
    int insert(NewsArticlePO record);

    /**
     *
     * @param record
     */
    int insertSelective(NewsArticlePO record);

    /**
     * 根据主键获取一条数据库记录
     *
     * @param id
     */
    NewsArticlePO selectByPrimaryKey(Long id);

    /**
     *
     * @param record
     */
    int updateByPrimaryKeySelective(NewsArticlePO record);

    /**
     * 根据主键来更新数据库记录
     *
     * @param record
     */
    int updateByPrimaryKey(NewsArticlePO record);

    List<NewsArticlePO> selectList();
}