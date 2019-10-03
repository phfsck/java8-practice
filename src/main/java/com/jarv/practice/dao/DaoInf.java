package com.jarv.practice.dao;

import java.util.List;
import java.util.Optional;

import com.jarv.practice.pojo.Book;

public interface DaoInf<T> {
	
	Optional<T> get(T t);
	List<T> getAll();
	void save(T t);
	void update(T t, String... params);
	void delete(T t);

}
