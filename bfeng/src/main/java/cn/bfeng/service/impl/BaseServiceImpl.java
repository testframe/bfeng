package cn.bfeng.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import cn.bfeng.dao.BaseDao;
import cn.bfeng.service.BaseService;
import cn.bfeng.util.Pager;

public class BaseServiceImpl<T> implements BaseService<T> {

	@Autowired
	private BaseDao<T> dao;

	@Override
	public T get(Serializable id) {
		return dao.get(id);
	}

	@Override
	public T load(Serializable id) {
		return dao.load(id);
	}

	@Override
	public void save(T entity) {
		dao.save(entity);
	}

	@Override
	public void update(T entity) {
		dao.update(entity);
	}

	@Override
	public void saveOrUpdate(T entity) {
		dao.saveOrUpdate(entity);
	}

	@Override
	public void delete(T entity) {
		dao.delete(entity);
	}

	@Override
	public void delete(Serializable id) {
		dao.delete(id);
	}

	@Override
	public void delete(Serializable... ids) {
		dao.delete(ids);
	}

	@Override
	public T getUniqueResult(String param, Object value) {
		return dao.getUniqueResult(param, value);
	}

	@Override
	public T getUniqueResult(Map<String, ?> values) {
		return dao.getUniqueResult(values);
	}

	@Override
	public List<T> findAll() {
		return dao.findAll();
	}

	@Override
	public List<T> findAll(String order, boolean desc) {
		return dao.findAll(order, desc);
	}

	@Override
	public List<T> findListByProterty(String param, Object value) {
		return dao.findListByProperty(param, value);
	}

	@Override
	public List<T> findListByProterties(Map<String, ?> values) {
		return dao.findListByProperties(values);
	}

	@Override
	public List<T> findListByProterty(String param, Object value, String order, boolean desc) {
		return dao.findListByProperty(param, value, order, desc);
	}

	@Override
	public List<T> findListByProterties(Map<String, ?> values, String order, boolean desc) {
		return dao.findListByProperties(values, order, desc);
	}

	@Override
	public Pager<T> selectPage(int pageNo, int pageSize) {
		return dao.selectPage(pageNo, pageSize);
	}

	@Override
	public Pager<T> selectPage(int pageNo, int pageSize, String order, boolean desc) {
		return dao.selectPage(pageNo, pageSize, order, desc);
	}

	@Override
	public Pager<T> selectPageByProterty(int pageNo, int pageSize, String param, Object value) {
		return dao.selectPageByProterty(pageNo, pageSize, param, value);
	}

	@Override
	public Pager<T> selectPageByProterties(int pageNo, int pageSize, Map<String, ?> values) {
		return dao.selectPageByProterties(pageNo, pageSize, values);
	}

	@Override
	public Pager<T> selectPageByProterty(int pageNo, int pageSize, String param, Object value, String order,
			boolean desc) {
		return dao.selectPageByProterty(pageNo, pageSize, param, value, order, desc);
	}

	@Override
	public Pager<T> selectPageByProterties(int pageNo, int pageSize, Map<String, ?> values, String order,
			boolean desc) {
		return dao.selectPageByProterties(pageNo, pageSize, values, order, desc);
	}

	@Override
	public long countResult() {
		return dao.countResult();
	}

	@Override
	public int countByProperty(String param, Object value) {
		return dao.countByProperty(param, value);
	}

	@Override
	public int countByProperties(Map<String, ?> values) {
		return dao.countByProperties(values);
	}

}
