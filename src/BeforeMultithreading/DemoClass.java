package BeforeMultithreading;

public class DemoClass {
    public static void main(String[] args) {
        System.out.println("part1 to print in ascending order");
        for(int i=1;i<=10;i++){
            System.out.println("i value is :"+i);
        }
        System.out.println("part2 to print in descending order");
        for(int i=10;i>=1;i--){
            System.out.println("i value is :"+i);
        }
    }
}
