package com.ust.respository;

import org.springframework.data.repository.CrudRepository;

import com.ust.model.Books;

public interface BooksRespository extends CrudRepository<Books, Integer> {

	

}
