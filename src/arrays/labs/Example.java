package arrays.labs;

public class Example {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "dog";
        array[1] = "cat";
        array[2] = "dolphin";
        array[3] = "lion";
        array[4] = "tiger";

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
