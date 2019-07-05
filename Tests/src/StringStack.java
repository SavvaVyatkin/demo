public class StringStack {
    String[] stack = new String[10];
    int stackIndex = 0;

    public void push(String value) {
        if (stackIndex < stack.length) {
            stack[stackIndex] = value;
            stackIndex += 1;
        } else 
        {
            System.out.println("Exception.");
        }
    }

    public String pop() {
        if (stackIndex > 0) {
            stackIndex-=1;
            return stack[stackIndex];
        }
        else
        {
            return null;
        }

    }

    public String[] pop(int n) {
    	if (n > stackIndex) n = stackIndex;
    	String[] s = new String[n];
    	int start = 0;
    	if (n < stackIndex) start = stackIndex - n;
    	for (int i = start; i < n + start; i++) s[i-start]=stack[i];
        return s;
    }

    public StringStack(int initialCapacity)
    {
        stack = new String[initialCapacity];
        stackIndex = 0;
    }   

    public String peek() {
        if (stackIndex > 0) {
            System.out.println ("Initial Stack: " + stackIndex);
            return stack[stackIndex-1];
        }
        else
        {
            return null;
        }
    }    

    public class StackException extends Exception {
        /**
         * Constructor for objects of class StackException
         */
        public StackException(String message) {
            super(message);
        }
    }

    private class StackUnderflowException extends StackException {
        private static final String UNDERFLOW_MESSAGE = "Pop requested on empty stack";
        /**
         * Constructor for objects of class StackUnderflowException
         */
        public StackUnderflowException() {
            super(UNDERFLOW_MESSAGE);
        }
    }
}
