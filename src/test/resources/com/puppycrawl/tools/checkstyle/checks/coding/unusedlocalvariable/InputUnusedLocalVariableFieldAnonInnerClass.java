/*
UnusedLocalVariable
allowUnnamedVariables = false

*/

package com.puppycrawl.tools.checkstyle.checks.coding.unusedlocalvariable;

public class InputUnusedLocalVariableFieldAnonInnerClass {

    // Field-level anonymous inner class with a non-private instance variable
    Object fieldAnon = new Object() {
        int sharedName = 1;
    };

    void testMethod() {
        int sharedName = 10;  // This local variable is used in the local anonymous inner class
        
        // Local anonymous inner class that uses the local variable sharedName
        Object localAnon = new Object() {
            void method() {
                int result = sharedName;
                System.out.println(result);
            }
        };
        localAnon.toString();
    }
    
    // Another field-level anonymous inner class
    Runnable fieldRunnable = new Runnable() {
        public void run() {
            int unused = 5; // violation, 'Unused local variable'
        }
    };
}

