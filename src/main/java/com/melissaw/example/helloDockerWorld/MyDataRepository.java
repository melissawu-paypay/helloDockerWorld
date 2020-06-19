package com.melissaw.example.helloDockerWorld;

import org.springframework.data.repository.CrudRepository;

public interface MyDataRepository extends CrudRepository<MyData, Integer> {
}