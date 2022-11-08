public class GenericMethod {
    public static void main(String[] args) {
        String[] nama = ["Yoel", "Mountanus", "Sitorus", "Pane"];
        testGenericPrintArray(nama);
    }

    public <T> void testGenericPrintArray(T[] array) {
        for (T data: array){
            System.out.print(data);
        }
    }
}