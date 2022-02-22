package com.lru.ex;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;

public class LRUCache<K, V> {
	
	  int capacity;
	  
	  Set<K> cache; 
	  LinkedList<LinkedListNode<K, V>> cache_vals;
	  
	  public LRUCache(int capacity) {
	    this.capacity = capacity;
	    cache = new HashSet<K>(capacity);
	    cache_vals = new LinkedList<LinkedListNode<K, V>>();
	  }

	  LinkedListNode<K, V> get(K key) {
	    if(!cache.contains(key)){
	      return null;
	    } else {
	    ListIterator<LinkedListNode<K, V>> iterator1 = cache_vals.listIterator(0);
	    
	    while(iterator1.hasNext()) {
	    
	      LinkedListNode<K, V> node = iterator1.next(); 
	      
	      if (node.key == key){
	          return node;
	        }
	      }
	    
	      return null;
	    }
	    
	  }

	  void put(K key, V value) {
	    LinkedListNode<K, V> node = get(key);

	    if(node == null){
	      evict_if_needed();
	      node = new LinkedListNode<K, V>(key, value);
	      cache_vals.addLast(node);
	      cache.add(key);
	    }
	    else {
	      cache_vals.remove(node);
	      cache_vals.addLast(node);
	    }
	  }

	  void evict_if_needed(){
	    if(cache_vals.size() >= capacity) {
	      LinkedListNode<K, V> node = cache_vals.remove();
	      cache.remove(node.key);
	      
	    }
	  }

	  void print() {
	    ListIterator<LinkedListNode<K, V>> iterator = cache_vals.listIterator(0);
	    while(iterator.hasNext()){
	      LinkedListNode<K, V> node = iterator.next();
	      System.out.print(node.key + ":" + node.data + ", ");  
	    }
	    
	    System.out.println("");
	  }
	  public static void main(String[] args) {
		  
	    LRUCache<Integer, Integer> cache = new LRUCache<>(4);
	    
	    cache.put(10, 50);
	    cache.print();

	    cache.put(15, 25);
	    cache.print();

	    cache.put(20, 30);
	    cache.print();

	    cache.put(25, 35);
	    cache.print();

	    cache.put(20, 30);
	    cache.print();

	    cache.put(40, 50);
	    cache.print();

	    cache.put(25, 35);
	    cache.print();
	  }
	  
	  class LinkedListNode<K, V> {

		K key;
		V data;
		  
		public LinkedListNode(K key, V value) {
			this.key = key;
			this.data = value;
		}
		  
	  }
	  
	}
