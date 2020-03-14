package com.distkv.server.view;


import java.util.concurrent.ConcurrentHashMap;

public abstract class DistkvAbstractView {

  protected GlobalTable globalTable;

  protected NodeTable nodeTable;

  protected ShardTable shardTable;

  private ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

  protected void put(String key, String value) {
    map.put(key, value);
  }

  public String get(String key) {
    return map.get(key);
  }

}
