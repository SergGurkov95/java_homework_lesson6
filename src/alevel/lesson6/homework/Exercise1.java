/*Класс Phone.
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
    Выводит на консоль сообщение “Звонит {name}”. getNumber – возвращает номер телефона.
    Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
Добавить конструктор без параметров.
*/


package alevel.lesson6.homework;

public class Exercise1 {

    public static void main(String[] args) {

        Phone firstPhone = new Phone("380931231231", "первая", 123.3);
        Phone secondPhone = new Phone("380930001112", "вторая", 213.2);
        Phone thirdPhone = new Phone("380935550555", "десятая", 323.5);

        System.out.println("номер: " + firstPhone.number +
                "\nмодель: " + firstPhone.model +
                "\nмасса: " + firstPhone.weight + "г\n");

        System.out.println("номер: " + secondPhone.number +
                "\nмодель: " + secondPhone.model +
                "\nмасса: " + secondPhone.weight + "г\n");

        System.out.println("номер: " + thirdPhone.number +
                "\nмодель: " + thirdPhone.model +
                "\nмасса: " + thirdPhone.weight + "г\n");

        firstPhone.receiveCall("Маша");
        System.out.println(firstPhone.getNumber() + "\n");

        secondPhone.receiveCall("Петя");
        System.out.println(secondPhone.getNumber() + "\n");

        thirdPhone.receiveCall("Саша");
        System.out.println(thirdPhone.getNumber() + "\n");
    }
}
