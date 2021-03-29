/**
* Implicit type conversions.... 
*
*The compiler automatically performs implicit casting when the target type is wider than the source type. 
*
*Normally, there is no loss of information when the target type is wider than the source type, for example when we *cast int to long. But it is not possible to automatically cast in the backward order (e.g. from long to int or from double to float).
*
*When we convert a char to an int in Java we actually get the ASCII value for a given character. 
*
*Strictly speaking, Java uses Unicode Character Representations (UTF-16), which is a superset of ASCII and includes a by far larger set of symbols. However, the numbers 0–127 have the same values in ASCII and Unicode. 
*/


/**
* Explicit type conversions
*
*/