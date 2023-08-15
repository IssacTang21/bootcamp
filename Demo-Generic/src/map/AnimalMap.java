package map;

import java.util.HashMap;
import java.util.Map;

import zoo.Animal;

public class AnimalMap<T> { // java17 removed
  Map<T, String> map;

  public void put(T key, String animal) {
    map.put(key, animal);
  }

  public AnimalMap(){
    map = new HashMap<>();
  }

  public static void main(String[] args) {
    AnimalMap<String> map1 = new AnimalMap<>();
    map1.put("cat", "dog");

    AnimalMap<Integer> map2 = new AnimalMap<>();
    map2.put(1, "dog");
  }

}