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
.
.
.