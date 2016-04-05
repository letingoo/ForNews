package letingoo.Dao;

import javax.enterprise.inject.New;

import letingoo.DTO.News;



public interface NewsDao {
	
	
	/**
	 * 检索一条新闻
	 * @param id
	 * @return
	 */
	public News selectNewsByID(int id);
	
	
	
	/**
	 * 插入一条新闻
	 * @param news
	 * @return
	 */
	
	public void insertNews(News news);
	
	
	/**
	 * 更新 一条新闻
	 * @param news
	 */
	public void updateNews(News news);
	
	/**
	 * 删除一条新闻
	 * @param news
	 */
	public void deleteNews(News news);
}
