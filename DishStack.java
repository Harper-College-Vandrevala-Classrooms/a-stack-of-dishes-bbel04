public class DishStack {
    private Dish[] dishStackArray;
    private int top;
    private int capacity;

    public DishStack(int size) {    //DishStack object constructor
        capacity = size;
        dishStackArray = new Dish[size];
        top = -1; //size is empty
    }

    public void push(Dish element) {
        if (top == capacity - 1) { //when stack is full 
            System.out.println("Stack Overflow -- Cannot add element, stack is full.");
            return;
        }
        dishStackArray[++top] = element; //increment array size, add element to top of stack
    }

    public Dish pop() {
        if (top == -1) { //if stack is empty
            System.out.println("Cannot remove element, stack is empty.");
            return null;
        }
        return dishStackArray[top--]; //decrease size of array, return popped element
    }

    public Dish peek() {
        if (top == - 1) { //if stack is empty
            System.out.println("Stack is empty, no top element to view.");
            return null;
        }
        return dishStackArray[top]; //return top element of the stack
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        DishStack stack = new DishStack(5); //initialize new DishStack of capacity 5

        //create Dish objects
        Dish oneDish = new Dish("A dish with one pattern on it");  
        Dish twoDish = new Dish("A dish with two patterns on it");
        Dish threeDish = new Dish("A dish with a red pattern on it");
        Dish fourDish = new Dish("A dish with a blue pattern on it");

        //The variable stack_size should equal zero.
        int stackSize = stack.size();
        System.out.println(stackSize);

        stack.push(oneDish);
        stack.push(twoDish);
        stack.push(threeDish);
        stack.push(fourDish);

        //The variable sizeAfterPushes should equal four.
        int sizeAfterPushes = stack.size();
        System.out.println(sizeAfterPushes);

        //The variable peekedDish should have a description of "A dish with a blue pattern on it"
        Dish peekedDish = stack.peek();
        if (peekedDish != null) {
            System.out.println("Peeked dish description: " + peekedDish.getDescription());
        }

        //access and print the description of the popped dish
        Dish poppedDish = stack.pop();
        if (poppedDish != null) {
            System.out.println("Popped dish description: " + poppedDish.getDescription());
        }

        //access and print the description of another popped dish
        Dish anotherPoppedDish = stack.pop();
        if (anotherPoppedDish != null) {
            System.out.println("Another popped dish description: " + anotherPoppedDish.getDescription());
        }

        //Final size
        int finalSize = stack.size();
        System.out.println("Final stack size: " + finalSize);
    }
}
