// package com.company;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
   This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
   public static void main(String[] args)
   {      
      Map<String, Color> favoriteColors = new HashMap<String, Color>();
      favoriteColors.put("Juliet", Color.BLUE);
      favoriteColors.put("Romeo", Color.GREEN);
      favoriteColors.put("Adam", Color.MAGENTA);
      favoriteColors.put("Eve", Color.BLUE);
      favoriteColors.put("Kay", Color.BLUE);
      favoriteColors.put("Kay", Color.YELLOW);// modifies value of existing key

      Color kaysFavoriteColor = favoriteColors.get("Kay");
      System.out.println(kaysFavoriteColor);//expect Color.ORANGE);



      // Print all keys and values in the map

      Set<String> keySet = favoriteColors.keySet();
      for (String key : keySet)
      {
         Color value = favoriteColors.get(key);
         System.out.println(key + " : " + value);
      }

      // Trying to figure out why set printed out in random order.
      Map<String, Integer> id = new TreeMap<String, Integer>();
      id.put("Juliet", 1);
      id.put("Romeo", 2);
      id.put("Adam", 3);
      id.put("Eve", 4);
      id.put("Kay", 5);

      Set<String> keySet2 = id.keySet();
      for (String key : keySet2) {
         Integer value = id.get(key);
         System.out.println(key + " : " + value);
      }


   }
}
