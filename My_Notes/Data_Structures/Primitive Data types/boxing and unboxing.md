##Boxing and unboxing

Boxing is the conversion of primitive types to objects of corresponding wrapper classes. Unboxing is the reverse process. The following code illustrates both processes:

```
int primitive = 100;
Integer reference = Integer.valueOf(primitive); // boxing
int anotherPrimitive = reference.intValue();    // unboxing
```

Autoboxing and auto-unboxing are automatic conversions performed by the Java compiler.

```
double primitiveDouble = 10.8;
Double wrapperDouble = primitiveDouble; // autoboxing
double anotherPrimitiveDouble = wrapperDouble; // auto-unboxing
```