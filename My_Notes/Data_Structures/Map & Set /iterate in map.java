Map<Integer,Integer> hashmap = new HashMap<>();
.
.
.
.
.
.
Iterator itr = hashmap.entrySet().iterator(); 
.
.
.
.
.
while(itr.hasNext()){
	Map.Entry m = (Map.Entry)itr.next();
	curKey = (int)m.getKey();
	curVal = (int)m.getValue();
}

.
.
.
.
.
.








// You can also itirate using the for each loop in Java.
.
.
.
.
.
 HashMap<String, Integer> hm =   new HashMap<String, Integer>(); 
.
.
.
.
 for (Map.Entry mapElement : hm.entrySet()) { 
            String key = (String)mapElement.getKey(); 
        } 
 .
 .
 .
 .
 .






// using forEach loop  
.
.
.
.
HashMap<String, Integer> hm = new HashMap<String, Integer>(); 
.
.
.
.
.
hm.forEach((k, v) -> System.out.println(k + " : " + v));
.
.
.
.