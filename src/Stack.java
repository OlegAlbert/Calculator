public class Stack {
    private int ptr;
    private String[] array;

    Stack() {
        ptr = -1;
        array = new String[20];
    }

    Stack(int size) {
        ptr = -1;
        array = new String[size];
    }

    private boolean isEmpty() {
        return (ptr == -1);
    }
    private boolean isFull() {
        return ptr == this.array.length - 1;
    }

    void push(String num) {
        if (!this.isFull()) {
            this.array[++ptr] = num;
        }
        else {
            System.out.println("Stack is full!");
        }
    }

    String pop() {
        if (!this.isEmpty()) {
            return this.array[ptr--];
        }
        else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    void showFirstElement() {
        if (!this.isEmpty()) {
            System.out.println(this.array[ptr]);
        }
        else {
            System.out.println("Stack is empty!");
        }
    }

    void showStack() {
        for (int i = 0; i <= ptr; i++) {
            System.out.println(this.array[i]);
        }
    }

}
