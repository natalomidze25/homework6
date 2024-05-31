public class Main {
    public static void main(String[] args) {

        String[] strings = new String[10];
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew", "Kiwi", "Lemon"};
        int[] numArr = {1, 5, 10, 15, 20};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        fruit(numArr, 10);
    }

    public static void fruit(int[] numArr, int number) {

        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == number) {
                System.out.println("Index: " + i);
                return;
            }
        }

        System.out.println("I can not find");

    }
}


//შექმენი სტრინგების Array, ჩაამატე 10
//სიტყვა, გადაუყევი მას for loop ით და
//დაბეჭდე თითოეული სიტყვა
//დაწერე მეთოდი რომელსაც გადაეცემა
//მასივი, და ციფრი
//მეთოდის მიზანია იპოვოს ეს გადმოცემული
//ციფრი მასივში და დაბეჭდოს მისი ინდექსი,
//ვერ პოვნის შემთხვევაში დაბეჭდე მესიჯი
//„ვერ ვიპოვე“