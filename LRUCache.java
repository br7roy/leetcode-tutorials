import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

	LinkedHashMap<Integer, Integer> hashMap = null;
	int capacity = 0;

	public LRUCache(int capacity) {
		hashMap = new LinkedHashMap<>();
		this.capacity = capacity;
	}


	//LRUCache(int capacity) 以正整数作为容量 capacity 初始化 LRU 缓存
	// int get(int key) 如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
	// void put(int key, int value) 如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值」。当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。


	public int get(int key) {
		if (!hashMap.containsKey(key)) {
			return -1;
		}
		Integer value = hashMap.get(key);
		hashMap.remove(key, value);
		hashMap.put(key, value);
		return value;
	}

	public void put(int key, int value) {
		// 判断，如果容量达到最大，需要移除key相应entry
		if (hashMap.containsKey(key)) {
			// 存在，移除相应entry
			Integer v2 = hashMap.get(key);
			hashMap.remove(key, v2);

		} else if (hashMap.size() == capacity) {
			Iterator<Map.Entry<Integer, Integer>> it = hashMap.entrySet().iterator();
			Map.Entry<Integer, Integer> next = it.next();
			hashMap.remove(next.getKey(), next.getValue());
		}
		// 最后put新元素
		hashMap.put(key, value);
	}

}
