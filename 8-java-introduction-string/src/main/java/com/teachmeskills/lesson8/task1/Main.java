package com.teachmeskills.lesson8.task1;

public class Main {

    public static void main(String[] args) {
        String someString = "someString";
        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов



        System.out.println(str1.length()); // 4
        char[] helloArray = str1.toCharArray();

        String s = "";   // строка не указывает на объект
        if(s.length() == 0) System.out.println("String is empty");

        if(s.isEmpty()) System.out.println("String is empty");

        s = null;   // строка не указывает на объект
        if(s == null) System.out.println("String is null");

        s = null;   // строка не указывает на объект
        if(s.length()==0) System.out.println("String is empty");    // ! Ошибка

        s = null;   // строка не указывает на объект
        if(s!=null && s.length()==0) System.out.println("String is empty");

        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come

        String srt = "2";

        System.out.println(String.valueOf(2));
        System.out.println(String.join("-", someString, "someString2"));
        System.out.println(someString.compareTo("someString"));
        System.out.println(someString.charAt(1));
        char[] dst = new char[7];
        someString.getChars(0, 6, dst, 0);



        System.out.println(someString.equals("someString"));
        System.out.println(someString.equalsIgnoreCase("someString"));
        System.out.println(someString.regionMatches(0, "someString", 5, 2));
        someString.indexOf("String");
        someString.lastIndexOf("ing");
        someString.startsWith("some");
        someString.endsWith("ing");
        someString.replace("s", "new string");
        someString.trim();



        // format
        //%a Шестнадцатеричное значение с плавающей точкой
        //%b Логическое (булево) значение аргумента
        //%c Символьное представление аргумента
        //%d Десятичное целое значение аргумента
        //%h Хэш-код аргумента
        //%e Экспоненциальное представление аргумента
        //%f Десятичное значение с плавающей точкой
        //%g Выбирает более короткое представление из двух: %е или %f
        //%o Восьмеричное целое значение аргумента
        //%n Вставка символа новой строки
        //%s Строковое представление аргумента
        //%t Время и дата
        //%x Шестнадцатеричное целое значение аргумента
        //%% Вставка знака %
        // Флаги формата

//          -         	Выравнивание влево
//          #         	Изменяет формат преобразования
//          0         	Выводит значение, дополненное нулями вместо пробелов. Применим только к числам.
//          Пробел      Положительные числа предваряются   пробелом
//          +        	Положительные числа предваряются знаком +. Применим только к числам.
//          ,         	Числовые значения включают разделители групп. Применим только к числам.
//          (          	Отрицательные числовые значения заключаются в скобки. Применим только к числам.

        System.out.printf("%,.2f%n", 10000.0 / 3.0);
        System.out.printf("%, (.2f%n", -10000.0 / 3.0);
        System.out.printf("%09.2f%n", 10000.0 / 3.0);

        System.out.printf("Hello %1$s!%n%1$s, how are you?%n"
                        + "Welcome to the site %2$s",
                "John", "www.site.com");

        //Общий синтаксис можно описать так:
        // %[аргумент_индекс][флаги][ширина][.точность]символ_преобразования
    }
}
