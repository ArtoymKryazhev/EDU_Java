package Lab_6_5;

import java.util.HashMap;
import java.util.Map;

class ResourceCache {
    private Map<String, Resource> cache = new HashMap<>();

    public Resource getResource(String name) {
        // Если ресурс уже в кэше - возвращаем его
        if (cache.containsKey(name)) {
            System.out.println("Используем кэшированный ресурс: " + name);
            return cache.get(name);
        }

        // Если нет - создаем новый и кэшируем
        Resource resource = new Resource(name);
        cache.put(name, resource);
        return resource;
    }

    public int getCacheSize() {
        return cache.size();
    }

    public void clearCache() {
        cache.clear();
        System.out.println("Кэш очищен");
    }
}
