public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Sắp xếp số nguyên");
        stackOfIntegers();
        System.out.println("\n2. Sắp xếp chuối");
        stackOfIStrings();
    }
    private static void stackOfIStrings(){
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("năm");
        stack.push("bốn");
        stack.push("ba");
        stack.push("hai");
        stack.push("một");
        System.out.println("1.1. kích thước ngăn xếp sau khi thêm: " + stack.size());
        System.out.println("1.2. lấy phần tử ra khỏi ngăn xếp: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. kích thước của ngăn xếp sau khi lấy ra: " + stack.size());
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. kích thước của ngăn xếp sau khi thêm: " + stack.size());
        System.out.println("2.2. lấy phần tử ra khỏi ngăn xếp : ");
        while (!stack.isEmpty()){
            System.out.printf(" %d",stack.pop());
        }
        System.out.println("\n1.3. kích thước của ngăn xếp sau khi lấy ra: " + stack.size());
    }


}
