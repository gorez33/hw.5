public class Calculator {
    public void startCalculations(){
        while (true){
            System.out.println("Введите операцию: \n"+
                    "сложение: +  \n" +
                    "вычетание: - \n" +
                    "деление: / \n" +
                    "умножение: * \n" +
                    "выход: + e \n");
                char ch = Main.scanner.next().charAt(0);

            switch (ch){
                case '+':
                    sum();
                    break;
                case '-':
                    sub();
                    break;
                case '*':
                    mul();
                    break;
                case '/':
                    div();
                    break;
                case 'e':
                    System.exit(0);
                    break;

            }
        }
    }

    private void sum(){
        int a = Main.scanner.nextInt();
        int b = Main.scanner.nextInt();
        System.out.println("Сумма "+(a+b));
    }
    private void sub() {
        int a = Main.scanner.nextInt();
        int b = Main.scanner.nextInt();
        System.out.println("Разность " + (a-b));
    }

    private void mul() {
        int a = Main.scanner.nextInt();
        int b = Main.scanner.nextInt();
        System.out.println("Произведение " + a*b);
    }
    private void div() {
        double a = Main.scanner.nextDouble();
        double b = Main.scanner.nextDouble();
        System.out.println("Частное " + a/b);
    }

}
