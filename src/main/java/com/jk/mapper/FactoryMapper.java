package com.jk.mapper;


import com.jk.pojo.Factory;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface FactoryMapper {

   List<Factory> find(Factory factory);

   Factory get(Serializable id);

   void insert(Factory factory);

   void update(Factory factory);

   void  delete(Serializable id);

   void delteBatch(Serializable[] id);

   void changState(Map<String,Object> map);
}