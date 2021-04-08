

    The Conditional Operators

    The && and || operators perform Conditional-AND and Conditional-OR operations on two boolean expressions. 
    These operators exhibit "short-circuiting" behavior, which means that the second operand is evaluated only if needed.

    && Conditional-AND || Conditional-OR



    That means:

    if (c == '(' && opened++ > 0) s.append(c)

    is same as, 

	 if(c == '(') {
                if(opened > 0) s.append(c);
                opened++;
        }


    because opened will be incremented only when c =='('



/**
* Another Good thing about logical operators is to remeber thier precedence order
*/

Below are the logical operations sorted in order of decreasing their priorities in expressions: 

! (NOT), ^ (XOR), && (AND), || (OR).