/**
 * It's possible to pass an arbitrary number of the same type arguments to a method using the special syntax named
 * varargs (variable-length arguments). These arguments are specified by three dots after the type. In the body of the
 * method, you can process this parameter as a regular array of the specified type.
 * <p>
 * The following method takes an integer vararg parameter and outputs the number of arguments in the standard output
 * using the length property of arrays.
 */
public static void printNumberOfArguments(int...numbers){
        System.out.println(numbers.length);
        }

        /**
         *      As you can see,a special syntax...is used here to specify a vararg parameter.
         *
         *         Now,you can invoke the method passing several integer numbers or an array of ints.
         */

        printNumberOfArguments(1);
        printNumberOfArguments(1,2);
        printNumberOfArguments(1,2,3);
        printNumberOfArguments(new int[]{}); // no arguments here
        printNumberOfArguments(new int[]{1,2});
/**
        This code outputs:

        1
        2
        3
        0
        2

*/

/**
 If a method has more than one parameter, the vararg parameter must be the last one in the declaration of the method.

 Here is an incorrect example:

 public static void method(double... varargs, int a) {  do something  }

        The correct version of the method is:
*/

public static void method(int a, double... varargs) { /* do something */ }