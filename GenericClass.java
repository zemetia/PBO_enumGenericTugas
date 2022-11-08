public class GenericClass {
    public static void main(String[] args) {
        GenericTest test = new GenericTest<int, String>(51, "Yoel");
        test.print();
    }
}

class GenericTest<T, K> {
    private T data1;
    private K data2;

    /**
    * @param T data1
    * @param K data2 
    */

    public void GenericTest(T data1, K data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    public void print(){
        System.out.println("Data 1 is " + this.data1);
        System.out.println("Data 2 is " + this.data2);
    }
}