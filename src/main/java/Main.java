package bank;
class Main {
    public static void main(String[] args) {
        BankAccount acct1 = new BankAccount(1000 , -1000 , "Lisa");
        BankAccount acct2 = new BankAccount(1000 , -1000 , "Bob");
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
        acct1.transfer(acct2, 500);
        System.out.println(acct1.toString());
        System.out.println(acct2.toString());
        if(acct1.transfer(acct2, 1600) == false)
        	System.out.println("crossing the minnimum balance allowed");
        Rectangle rec1 = new Rectangle (10,5);
        Rectangle rec2 = new Rectangle (8,6);
        rec1.scale(2);
        System.out.println("the sum of perimeters:" + (rec1.calcPerimeter() + rec2.calcPerimeter()));
        System.out.println("the sum of perimeters:" + (rec1.calcArea() + rec2.calcArea()));
        
    }
}
