package NO146_LRU_Cache;

import java.util.*;

class LRUCache {
    int cacheSize = 0;
    Map<Integer, AbstractMap.SimpleEntry<Integer, Integer>> cache;
    TreeMap<Integer, List<Integer>> lru;

    public LRUCache(int capacity) {
        this.cacheSize = capacity;
        cache = new HashMap<Integer, AbstractMap.SimpleEntry<Integer, Integer>>();
        lru = new TreeMap<Integer, List<Integer>>();
    }

    public int get(int key) {
        System.out.println("get " + key);
        AbstractMap.SimpleEntry<Integer, Integer> valueAge = cache.get(key);
        if (valueAge == null) {
            return -1;
        }
        age(key);
        return valueAge.getKey();
    }

    public void put(int key, int value) {
        System.out.println("put " + key);
        AbstractMap.SimpleEntry<Integer, Integer> valueAge = cache.get(key);
        if (valueAge != null) {
            int age = valueAge.getValue();
            cache.put(key, new AbstractMap.SimpleEntry<>(value, age + 1));
        } else {
            if (cache.size() >= cacheSize) {
                evict(key);
            }
            cache.put(key, new AbstractMap.SimpleEntry<>(value, 0));
        }
        age(key);
    }

    private void evict(int key) {
        int toBeRemoved = lru.firstEntry().getValue().get(0);
        cache.remove(toBeRemoved);
        lru.firstEntry().getValue().remove(0);
    }

    private void age(int key) {
        AbstractMap.SimpleEntry<Integer, Integer> valueAge = cache.get(key);
        int val = valueAge.getKey();
        int age = valueAge.getValue();

        if (lru.get(age) == null) {
            lru.put(age, new LinkedList<>());
        }
        List<Integer> keys = lru.get(age);
        if (keys.size() > 0) {
            keys.remove(keys.indexOf(key));
        }
        if (keys.size() <= 0) {
            lru.remove(age);
        }

        if (lru.get(age + 1) == null) {
            lru.put(age + 1, new LinkedList<>());
        }
        keys = lru.get(age + 1);
        keys.add(key);

        valueAge.setValue(age + 1);
    }
}
