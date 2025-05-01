# 1. Змінні

Змінна - комірка в пам'яті, яка містить в собі інформацію з якою можна взаємодіяти.

```
int num = 5;

де:
int - тип даних
num - ім'я змінної
= - присвоєння значення
5 - значення
```
Змінну можна оголосити без присвоєння значення:
```
int num1;
```
Одночасно можна оголисити декілька змінних:

```
int num2, num3, num4;

або одразу з присвоєнням значень:

int num5 = 10, num6 = 15, num7 = 20;
```
Як вивести змінну на екран:

```
 System.out.print(num);
```

Щоб змінити значення вже існуючої змінної достатньо написати назву змінної і присвоїти їй нове значення:
```
num = 10;
```

Щоб збільшити/зменшити значення вже існуючої числової змінної на n:
```
num += 5;
num -= 5;
```

Щоб збільшити/зменшити значення вже існуючої числової змінної на 1:
```
num++;
num--;

це те саме що:

num += 1;
num -= 1;
```

Типи даних для створення змінних:

1. Типи для цілочисельних даних:
- byte  від -128 до 127
- short від -32768 до 32767
- int   від -2147483648 до 2147483647
- long  (великі числа)

2. Типи для чисел з плаваючою точкою:
- float
- double

3. Символи і текст:
- char (символ)
- String (текст)

4. Логічний тип:
- boolean (true / false)

# 2. Основи синтаксису

1. Пробільні символи
- пробіл
- табуляція
- розрив рядка

Приклад коду який враховує всі ці правила:
```
public class HelloWorld { 
		public static void main (String[] args) {
	 		System.out.println ("Hello World!");
		 } 
	}
```

2. Коментарі
- // однорядковий коментар
- /* ... */ коментар на декілька рядків
- /** ...... */ Javadoc коментарі

3. Правила іменування
- пакети: усі літери маленькі
```
package helloworld;
```
- класи та інтерфейси: починаються з великої літери, кожне наступне слово з великої літери
```
class HomeWorkFourth { ... }
```
- методи, поля, змінні: починаються з маленької літери, кожне наступне слово з великої літери
```
public static void doSomething () { ... }
```
- константи: усі літери великі, слова розділяються знаком підкреслення
```
int MAX_LENGTH = 64;
```

# 3. Типи даних

1. Примітивні:
- byte, short, int, long
- float, double
- boolean
- char

2. Референсні (об'єктні):
- класи
- інтерфейси
- масиви
- рядки

# 4. Операції 

- Присвоєння (=)
- Арифметичні (+, -, *, /, %)
- Порівняння (==, <, <=, >, >=, !=)
- Логічні (!, ||, &&)

# 5. If-else Statement

Приклад:

```
if (count > 2) {
    System.out.println("Count is higher than 2");
} else if (count <= 0) {
    System.out.println("Count is less or equal than zero");
} else {
    System.out.println("Count is either equal to one, or two");
}
```

# 6. Switch Statement

Ми не можемо порівнювати всі типи об’єктів і примітивів в операторі switch. 
- byte and Byte 
- short and Short
- int and Integer
- char and Character
- Enum
- String

Приклад:

```
public String exampleOfSwitch(String animal) {
    String result;
    switch (animal) {
        case "DOG":
            result = "domestic animal";
            break;
        case "CAT":
            result = "domestic animal";
            break;
        case "TIGER":
            result = "wild animal";
            break;
        default:
            result = "unknown animal";
            break;
    }
    return result;
}
```

# 7. Тернарний оператор

Конструкція:
```
booleanExpression ? expression1 : expxression2
```
Приклад:
```
boolean isGreaterThanTwo = one < 2 ? true : false;
```