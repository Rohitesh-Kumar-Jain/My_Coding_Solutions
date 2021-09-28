Suppose we got to input this : 

```
['a', 'b', 'c'] [1, 2 ,3] (0, 1)
[1, 2, 3] [4, 5] (2, 1)

```

We can do the same by:

```
InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String a = in.readLine();
    String b = in.readLine();
    String c = in.readLine();
    List<String> A = createListFromString(a);
    List<String> B = createListFromString(b);
    List<String> C = createListFromString(c);

private static List<String> createListFromString(String string) {
    List<String> list = new ArrayList<String>();
    Pattern p = Pattern.compile("\\d+");
    Matcher m = p.matcher(string);
    while(m.find()) {
        list.add(m.group());
    }
    return list;
  }
```
