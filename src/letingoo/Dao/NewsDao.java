package letingoo.Dao;

import javax.enterprise.inject.New;

import letingoo.DTO.News;



public interface NewsDao {
	
	
	/**
	 * ����һ������
	 * @param id
	 * @return
	 */
	public News selectNewsByID(int id);
	
	
	
	/**
	 * ����һ������
	 * @param news
	 * @return
	 */
	
	public void insertNews(News news);
	
	
	/**
	 * ���� һ������
	 * @param news
	 */
	public void updateNews(News news);
	
	/**
	 * ɾ��һ������
	 * @param news
	 */
	public void deleteNews(News news);
}
