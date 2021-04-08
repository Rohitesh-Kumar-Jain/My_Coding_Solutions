##In layman's perspective ` ~idx = -idx - 1`


The one's complement operator ( ~ ), sometimes called the bitwise complement operator, yields a bitwise one's complement of its operand. That is, every bit that is 1 in the operand is 0 in the result. Conversely, every bit that is 0 in the operand is 1 in the result.


Reasoning for : ~idx = - idx - 1. 

Remember that negative numbers are stored as the two's complement of the positive counterpart. As an example, here's the representation of -2 in two's complement: (8 bits)

1111 1110

The way you get this is by taking the binary representation of a number, taking its complement (inverting all the bits) and adding one. Two starts as 0000 0010, and by inverting the bits we get 1111 1101. Adding one gets us the result above. The first bit is the sign bit, implying a negative.

So let's take a look at how we get ~2 = -3:

Here's two again:

0000 0010

Simply flip all the bits and we get:

1111 1101

Well, what's -3 look like in two's complement? Start with positive 3: 0000 0011, flip all the bits to 1111 1100, and add one to become negative value (-3), 1111 1101.

So if you simply invert the bits in 2, you get the two's complement representation of -3.