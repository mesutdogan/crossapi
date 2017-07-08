package com.doganmesut.crossapi;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mesut on 02.07.2017.
 */

public interface BaseService<K,T> {

    K save(K k);

    K findOne(T t);

    List<K> findAll();
}
