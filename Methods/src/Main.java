public class Main {
    public static void main(String[] args) {

        //1. Write a Java method to ﬁnd the smallest number among three numbers
        typeMinNumber smallestNumber;   // typeMinNumber = variable, name of variable smallestNumber;
        smallestNumber = new typeMinNumber(); // new - key word for creating new object ==> the same as typeMinNumber = new typeMinNumber;
        // variable has new value which is "new typeMinNumber"
        //променливата smallestNumber сочи към обект от този тип typeMinNumber; значи typeMinNumber е обектът.

        double result = smallestNumber.methodMinNumber(10, 4, 25);
        System.out.println(result);
        
    }
}

