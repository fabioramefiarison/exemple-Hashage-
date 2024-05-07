/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examplehash;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author ANDRY-PC
 */
public class ExampleHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "Bonjour tout le monde. ";
        String s2 = "Bonjour tout le monde. Ca va ?";
        HashSet<String> ens = new HashSet<>();
        ens.add("Sitraka");
        ens.add("Olivier"); //kosa e
        ens.add("Olivia"); 
        ens.add("Andry"); 
        ens.add("Antsa"); 
        
        System.out.println(ens.contains("Andry"));
        System.out.println(ens.contains("Andry"));
        System.out.println(ens.contains("Michelle"));
  
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Sitraka", 23);
        map.put("Olivier", 69);
        map.put("Antsa", 14);
        
        System.out.println(map.get("Sitraka"));
        System.out.println(map.get("Olivier"));
        System.out.println(map.get("Antsa"));
        System.out.println(map.get("Andry")); //null 
     
///     Avec Bulletin
        HashMap<String, Bulletin> mapbul = new HashMap<>();
        mapbul.put("Sitraka", new Bulletin("", "", 23, new float[]{12.3f, 10f, 19f}));
        mapbul.put("Olivier", new Bulletin("", "", 69, new float[]{12.3f, 0f, 19f}));
        mapbul.put("Antsa", new Bulletin("", "", 14, new float[]{}));
        
        System.out.println(mapbul.get("Sitraka"));
        System.out.println(mapbul.get("Olivier"));
        System.out.println(mapbul.get("Antsa"));
        System.out.println(mapbul.get("Andry")); //null 
    }
    
}
